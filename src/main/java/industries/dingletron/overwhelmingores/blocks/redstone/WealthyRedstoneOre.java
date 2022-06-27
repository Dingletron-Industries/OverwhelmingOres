package industries.dingletron.overwhelmingores.blocks.redstone;

import industries.dingletron.overwhelmingores.blocks.redstone.abs.GlowingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class WealthyRedstoneOre extends GlowingBlock {

    public WealthyRedstoneOre() {
        super(Properties
                .create(Material.ROCK)
                .hardnessAndResistance(5.0f, 6.9f)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .harvestLevel(3)
        , 0.5625D, new GlowingBlock.ParticleColour(255, 100, 100, 1.0f));
        withParticleCount(10);
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch != 0 ? 0 : new Random().nextInt(10)*(fortune + 1);
    }

}