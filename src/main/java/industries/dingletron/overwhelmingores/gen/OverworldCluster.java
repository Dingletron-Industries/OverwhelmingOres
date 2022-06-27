package industries.dingletron.overwhelmingores.gen;

import com.mojang.serialization.Codec;
import industries.dingletron.overwhelmingores.gen.abs.Cluster;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OverworldCluster extends Cluster {

    public OverworldCluster(Codec<NoFeatureConfig> codec) {
        super(codec);
    }

    @Override
    protected List<String> getTypesMatrix() {
        return Arrays.asList("Coal", "Iron", "Gold", "Diamond", "Emerald", "Lapis", "Redstone");
    }

    @Override
    protected List<String> getQualityMatrix() {
        return Arrays.asList("Pristine", "Wealthy", "Enriched", "Original", "Poor", "Reduced", "Scanty");
    }

    @Override
    protected HashMap<String, Integer> getChances() {
        final HashMap<String, Integer> chances = new HashMap<>();
        chances.put("Coal", 600);
        chances.put("Iron", 400);
        chances.put("Lapis", 400);
        chances.put("Redstone", 300);
        chances.put("Emerald", 50);
        chances.put("Diamond", 70);
        chances.put("Gold", 100);
        return chances;
    }

    @Override
    protected String getDesiredDimension() {
        return "overworld";
    }

    @Override
    protected int getSurfaceLevel() {
        return 64;
    }

    @Override
    protected int getTierUpChance() {
        return 33;
    }

}
