package industries.dingletron.overwhelmingores.data;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import industries.dingletron.overwhelmingores.helpers.ModBlocks;
import industries.dingletron.overwhelmingores.helpers.ModTags;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, OverwhelmingOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        final Class<ModBlocks> modBlocksClass = ModBlocks.class;
        final Class<ModTags.Blocks> blocksClass = ModTags.Blocks.class;
        final Field[] fields = modBlocksClass.getFields();
        for (Field field : fields) {
            try {
                if (!field.getType().equals(RegistryObject.class)) continue;
                if (!Modifier.isStatic(field.getModifiers())) continue;
                final Object obj = field.get(null);
                if (!(obj instanceof RegistryObject)) continue;
                final RegistryObject<?> block = (RegistryObject<?>) obj;
                final String name = field.getName().replaceAll("_ORE", "");
                if (name.contains("ITEM")) continue;
                final String[] splitData = name.split("_");
                String tagName;
                if (splitData.length == 2) tagName = splitData[1];
                else if (splitData.length == 3) tagName = splitData[1] + "_" + splitData[2];
                else { continue; }
                tagName = "ORES_" + tagName;
                final Field tagField = blocksClass.getField(tagName);
                if (!Modifier.isStatic(tagField.getModifiers()) || !tagField.getType().equals(ITag.INamedTag.class)) continue;
                final Object tagObj = tagField.get(null);
                if (!(tagObj instanceof ITag.INamedTag)) continue;
                final ITag.INamedTag<?> tag = (ITag.INamedTag<?>) tagObj;
                //noinspection unchecked
                getOrCreateBuilder((ITag.INamedTag<Block>) tag).add((Block) block.get());
            } catch (ReflectiveOperationException ex) {
                System.out.println("Failed to do it mate");
                ex.printStackTrace();
            }
        }
    }

}
