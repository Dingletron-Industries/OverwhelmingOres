package industries.dingletron.overwhelmingores.blocks.redstone.abs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.awt.*;
import java.util.Random;

public abstract class GlowingBlock extends Block {

    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
    private final double offset;
    private final RedstoneParticleData colour;
    private int iter;

    //Sets the block Particle Color
    public static class ParticleColour {

        private final float r, g, b, a;

        public ParticleColour(int r, int g, int b, float a) {
            this.r = r / 255.0f;
            this.g = g / 255.0f;
            this.b = b / 255.0f;
            this.a = a;
        }

        public ParticleColour(int r, int g, int b) {
            this(r, g, b, 1.0f);
        }

        public ParticleColour(String hex, float a) {
            final Color decode = Color.decode(hex.trim().charAt(0) == '#' ? hex.trim() : "#" + hex.trim());
            this.r = decode.getRed() / 255.0f;
            this.g = decode.getGreen() / 255.0f;
            this.b = decode.getBlue() / 255.0f;
            this.a = a;
        }

        public ParticleColour(String hex) {
            this(hex, 1.0f);
        }

        public RedstoneParticleData getData() {
            return new RedstoneParticleData(r, g, b, a);
        }

    }

    public GlowingBlock(Properties properties, double offset, ParticleColour colour) {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(LIT, false));
        this.offset = offset;
        this.colour = colour.getData();
    }

    public void withParticleCount(int iterations) {
        this.iter = iterations;
    }

    public boolean ticksRandomly(BlockState state) {
        return state.get(LIT);
    }

    @Override
    @SuppressWarnings({"deprecation"})
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            worldIn.setBlockState(pos, state.with(LIT, false), 3);
        }
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch != 0 ? 0 : new Random().nextInt(10) * (fortune + 1);
    }

//    @Override
//    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state) {
//        worldIn.playSound(null, pos, ModSoundEvents.POG.get(), SoundCategory.BLOCKS, 1, 1);
//        super.onPlayerDestroy(worldIn, pos, state);
//    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        activate(worldIn.getBlockState(pos), worldIn, pos);
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    @Override
    @SuppressWarnings({"deprecation"})
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        activate(state, worldIn, pos);
        super.onBlockClicked(state, worldIn, pos, player);
    }

    private void activate(BlockState state, World world, BlockPos pos) {
        spawnParticles(world, pos);
        if (!state.get(LIT)) {
            world.setBlockState(pos, state.with(LIT, true), 3);
        }
    }

    private void spawnParticles(World world, BlockPos worldIn) {
        final Random random = world.rand;
        for (final Direction direction : Direction.values()) {
            for (int i = 0; i < Math.max(1, iter); i++) {
                final Direction.Axis axis = direction.getAxis();
                final double origin = 0.5D;
                final double d1 = axis == Direction.Axis.X ? origin + offset * direction.getXOffset() : random.nextFloat();
                final double d2 = axis == Direction.Axis.Y ? origin + offset * direction.getYOffset() : random.nextFloat();
                final double d3 = axis == Direction.Axis.Z ? origin + offset * direction.getZOffset() : random.nextFloat();
                world.addParticle(colour,
                        worldIn.getX() + d1,
                        worldIn.getY() + d2,
                        worldIn.getZ() + d3,
                        0.0d, 0.0d, 0.0d);
            }
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

}
