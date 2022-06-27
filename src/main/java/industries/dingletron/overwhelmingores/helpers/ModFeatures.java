package industries.dingletron.overwhelmingores.helpers;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import industries.dingletron.overwhelmingores.gen.NetherCluster;
import industries.dingletron.overwhelmingores.gen.OverworldCluster;
import industries.dingletron.overwhelmingores.gen.abs.Cluster;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, OverwhelmingOres.MOD_ID);

    public static final RegistryObject<Cluster> OVERWORLD_CLUSTER = FEATURES.register("overworld_cluster",
            () -> new OverworldCluster(NoFeatureConfig.CODEC));
    public static final RegistryObject<Cluster> NETHER_CLUSTER = FEATURES.register("nether_cluster",
            () -> new NetherCluster(NoFeatureConfig.CODEC));

    public static void register(IEventBus bus) {
        FEATURES.register(bus);
    }

}
