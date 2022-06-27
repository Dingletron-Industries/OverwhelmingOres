package industries.dingletron.overwhelmingores.events;

import industries.dingletron.overwhelmingores.helpers.ModFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BiomeLoadEvent {

    @SubscribeEvent
    public void load(BiomeLoadingEvent event) {
        final BiomeGenerationSettingsBuilder generation = event.getGeneration();
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ModFeatures.OVERWORLD_CLUSTER.get()
                .withConfiguration(NoFeatureConfig.NO_FEATURE_CONFIG));
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ModFeatures.NETHER_CLUSTER.get()
                .withConfiguration(NoFeatureConfig.NO_FEATURE_CONFIG));
    }

}
