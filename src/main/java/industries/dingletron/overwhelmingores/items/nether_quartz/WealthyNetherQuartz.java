package industries.dingletron.overwhelmingores.items.nether_quartz;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class WealthyNetherQuartz extends Item {

    public WealthyNetherQuartz() { super(new Properties().group(OverwhelmingOres.ITEM_GROUP)); }

    @Override
    public ITextComponent getDisplayName(ItemStack stack) {
        return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.DARK_BLUE);
    }

    @Override
    public boolean hasEffect(ItemStack stack) { return false; }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("wealthy_nether_quartz"))
                .mergeStyle(TextFormatting.DARK_GRAY));
    }

}
