package industries.dingletron.overwhelmingores.data;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import industries.dingletron.overwhelmingores.helpers.ModItems;
import industries.dingletron.overwhelmingores.helpers.ModTags;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, OverwhelmingOres.MOD_ID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void registerTags() {
        final Class<ModTags.Blocks> blocksClass = ModTags.Blocks.class;
        final Class<ModTags.Items> itemsClass = ModTags.Items.class;
        final Field[] fields = blocksClass.getFields();
        for (Field field : fields) {
            try {
                if (!Modifier.isStatic(field.getModifiers())) continue;
                if (!field.getType().equals(ITag.INamedTag.class)) continue;
                final Object tagObj = field.get(null);
                final Object otherTagObj = itemsClass.getField(field.getName()).get(null);
                if (!(tagObj instanceof ITag.INamedTag<?>) || !(otherTagObj instanceof ITag.INamedTag<?>)) continue;
                final ITag.INamedTag<?> blockTag = (ITag.INamedTag<?>) tagObj;
                final ITag.INamedTag<?> itemTag = (ITag.INamedTag<?>) otherTagObj;
                copy((ITag.INamedTag<Block>) blockTag, (ITag.INamedTag<Item>) itemTag);
            } catch (ReflectiveOperationException ignored) {
            }
        }
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        final Class<ModItems> modItemsClass = ModItems.class;
        final Field[] itemFields = modItemsClass.getFields();
        for (Field itemField : itemFields) {
            try {
                if (!itemField.getType().equals(RegistryObject.class)) continue;
                if (!Modifier.isStatic(itemField.getModifiers())) continue;
                final ITag.INamedTag<Item> resolvedTag = resolveTag(itemField.getName());
                if (resolvedTag == null) {
                    System.err.println("Failed to find tag for " + itemField.getName());
                    continue;
                }
                getOrCreateBuilder(resolvedTag).add(((RegistryObject<Item>) itemField.get(null)).get());
            } catch (Exception ex) {
                System.out.println("Failed to register '" + itemField + "'!");
                ex.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private ITag.INamedTag<Item> resolveTag(String name) {
        try {
            final Class<ModTags.Items> itemsClass = ModTags.Items.class;
            final Field[] fields = itemsClass.getFields();
            final String[] nameData = name.split("_");
            for (int i = nameData.length - 1; i >= 0; i--) {
                String nameDatum = nameData[i];
                for (Field field : fields) {
                    if (field.getName().contains("ORES")) continue;
                    if (field.getName().contains("_" + nameDatum) || field.getName().contains(nameDatum + "_")) {
                        return (ITag.INamedTag<Item>) field.get(null);
                    }
                }
            }
            return null;
        } catch (Exception ex) {
            System.out.println("Failed to resolve tag for name '" + name + "'!");
            ex.printStackTrace();
            return null;
        }
    }

}
