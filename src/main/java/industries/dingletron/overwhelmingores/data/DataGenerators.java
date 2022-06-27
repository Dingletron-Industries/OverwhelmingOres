package industries.dingletron.overwhelmingores.data;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = OverwhelmingOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        final ModBlockTagsProvider provider = new ModBlockTagsProvider(event.getGenerator(), event.getExistingFileHelper());
        generator.addProvider(provider);
        generator.addProvider(new ModItemTagsProvider(event.getGenerator(), provider, event.getExistingFileHelper()));
    }
}
