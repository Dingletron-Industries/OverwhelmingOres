package industries.dingletron.overwhelmingores.gen.abs;

import com.mojang.serialization.Codec;
import industries.dingletron.overwhelmingores.helpers.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public abstract class Cluster extends Feature<NoFeatureConfig> {

    /**
     * Set to 0 for no debug
     * Set to 1 for debug console output
     * Set to 2 for AIR to be placed around the cluster & console output lines.
     */
    protected static final int debug_ore_generation = -1;

    private final List<String> quality, types;
    private final HashMap<String, Integer> chances;

    public Cluster(Codec<NoFeatureConfig> codec) {
        super(codec);
        types = getTypesMatrix();
        quality = getQualityMatrix();
        chances = getChances();
    }

    protected abstract List<String> getTypesMatrix();

    protected abstract List<String> getQualityMatrix();

    protected abstract HashMap<String, Integer> getChances();

    protected abstract String getDesiredDimension();

    protected abstract int getSurfaceLevel();

    protected abstract int getTierUpChance();

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand,
                            BlockPos pos, NoFeatureConfig config) {
        final String key = types.get(rand.nextInt(types.size()));
        if (!(rand.nextInt(10000) <= chances.getOrDefault(key, 500)))
            return false;
        if (!reader.getWorld().getDimensionKey().getLocation().getPath().equals(getDesiredDimension())) return false;
        final int centerX = pos.getX() + 7 + rand.nextInt(1);
        final int centerZ = pos.getZ() + 7 + rand.nextInt(1);
        final int topYLevel = getSurfaceLevel();
        final int centerY = topYLevel / 2 - (rand.nextInt(15) - 7);
        final BlockPos center = new BlockPos(centerX, centerY, centerZ);
        final int index = rand.nextInt(quality.size());
        final List<String> elements = quality.subList(index, quality.size());
        final int size = elements.size();
        final BlockState topLeft = reader.getBlockState(new BlockPos(centerX + size, centerY + size,
                centerZ + size));
        final BlockState bottomRight = reader.getBlockState(new BlockPos(centerX - size, centerY - size,
                centerZ - size));
        if (!isValidPosition(topLeft) || !isValidPosition(bottomRight)) return false;
        if (debug_ore_generation >= 1) {
            System.out.println("############################################");
            System.out.println("Cluster-Type:\t" + getClass().getSimpleName());
            System.out.println("Generate (" + pos + ")");
            System.out.println("Chunk:\t" + (pos.getX() >> 4) + ":" + (pos.getZ() >> 4));
            System.out.println("Considering:\t" + center + " for:\t" + key);
            System.out.println("Placing " + quality.get(index) + " (" + index + ")");
            System.out.println("The Cluster will contain:\t" + String.join(", ", elements));
            System.out.println("Dimension:\t" + reader.getWorld().getDimensionKey().getLocation().getPath());
            System.out.println("Desired:\t" + getDesiredDimension());
            System.out.println("Surface Y Level:\t" + getSurfaceLevel());
            System.out.println("############################################");
        }
        for (int x = -size; x <= size; x++) {
            for (int y = -size; y <= size; y++) {
                for (int z = -size; z <= size; z++) {
                    if (x * x + y * y + z * z <= size * size) {
                        int distance = (int) Math.floor(Math.pow(
                                Math.pow(centerX - (centerX + x), 2) +
                                        Math.pow(centerY - (centerY + y), 2) +
                                        Math.pow(centerZ - (centerZ + z), 2), 0.5)
                        );
                        if (rand.nextInt(100) <= getTierUpChance()) distance = distance - 1;
                        if (distance >= elements.size()) distance = elements.size() - 1;
                        if (distance <= 0) distance = 0;
                        final String tier = elements.get(distance);
                        final BlockState blockStateFor = getBlockStateFor(key, tier);
                        reader.setBlockState(new BlockPos((centerX + x), (centerY + y), (centerZ + z)), blockStateFor, 3);
                    } else {
                        if (debug_ore_generation > 1) {
                            reader.setBlockState(new BlockPos((centerX + x), (centerY + y), (centerZ + z)),
                                    Blocks.AIR.getDefaultState(), 3);
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean isValidPosition(BlockState state) {
        return  !state.equals(Blocks.WATER.getDefaultState()) &&
                !state.equals(Blocks.LAVA.getDefaultState()) &&
                !state.equals(Blocks.AIR.getDefaultState()) &&
                !state.equals(Blocks.VOID_AIR.getDefaultState());
    }

    private BlockState getBlockStateFor(String key, String quality) {
        try {
            final Class<ModBlocks> modBlocksClass = ModBlocks.class;
            final Class<Blocks> blocksClass = Blocks.class;
            final String GEM = key.toUpperCase().replaceAll(" ", "_");
            final String QUALITY = quality.toUpperCase();
            final boolean originalOre = quality.equals("Original");
            final String name =
                    // originalOre = true
                    // GEM_ORE
                    // originalOre = true and gem = ANCIENT_DEBRIS
                    // GEM
                    (originalOre ? "" : QUALITY + "_") + GEM + (originalOre && GEM.equals("ANCIENT_DEBRIS") ? "" : "_ORE");
            final Field field = originalOre ? blocksClass.getField(name) : modBlocksClass.getField(name);
            final Object value = field.get(null);
            final Block block = value instanceof Block ? (Block) value : (Block) ((RegistryObject<?>) value).get();
            return block.getDefaultState();
        } catch (ReflectiveOperationException ignored) {
            return Blocks.STONE.getDefaultState();
        }
    }

}
