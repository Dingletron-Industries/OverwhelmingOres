package industries.dingletron.overwhelmingores.gen;

import com.mojang.serialization.Codec;
import industries.dingletron.overwhelmingores.gen.abs.Cluster;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NetherCluster extends Cluster {

    public NetherCluster(Codec<NoFeatureConfig> codec) {
        super(codec);
    }

    @Override
    protected List<String> getTypesMatrix() {
        return Arrays.asList("Nether Gold", "Nether Quartz", "Ancient Debris");
    }

    @Override
    protected List<String> getQualityMatrix() {
        return Arrays.asList("Pristine", "Wealthy", "Enriched", "Original", "Poor", "Reduced", "Scanty");
    }

    @Override
    protected HashMap<String, Integer> getChances() {
        final HashMap<String, Integer> chances = new HashMap<>();
        chances.put("Nether Gold", 650);
        chances.put("Nether Quartz", 400);
        chances.put("Ancient Debris", 75);
        return chances;
    }

    @Override
    protected String getDesiredDimension() {
        return "the_nether";
    }

    @Override
    protected int getSurfaceLevel() {
        return 120;
    }

    @Override
    protected int getTierUpChance() {
        return 50;
    }

}
