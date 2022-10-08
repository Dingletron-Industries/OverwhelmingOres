package industries.dingletron.overwhelmingores.item;

import industries.dingletron.overwhelmingores.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab OVERWHELMINGORES_BLOCKS_TAB = new CreativeModeTab("owoModTabBlocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PRISTINE_COAL_ORE.get());
        }
    };
    public static final CreativeModeTab OVERWHELMINGORES_ITEMS_TAB = new CreativeModeTab("owoModTabItems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TINY_COAL.get());
        }
    };

}
