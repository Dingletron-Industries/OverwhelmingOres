package industries.dingletron.overwhelmingores.items.coal;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class WealthyCoal extends Item {

    public WealthyCoal() { super(new Item.Properties().group(OverwhelmingOres.ITEM_GROUP)); }

    @Override
    public ITextComponent getDisplayName(ItemStack stack) {
        return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.DARK_BLUE);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 102400;
    }

    @Override
    public boolean hasEffect(ItemStack stack) { return false; }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("x64 Fuel Time"))
                .mergeStyle(TextFormatting.DARK_GRAY));
    }

}
