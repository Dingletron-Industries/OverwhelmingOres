package industries.dingletron.overwhelmingores.items.hammer.abs;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ToolItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashSet;

public abstract class BaseHammer extends ToolItem {

    public BaseHammer(float dmg, float speed, ItemTier tier, int dura) {
        super(dmg, speed, tier, new HashSet<>(), ItemTier.NETHERITE == tier ?
                new Properties().group(OverwhelmingOres.ITEM_GROUP).defaultMaxDamage(dura).isImmuneToFire() :
                new Properties().group(OverwhelmingOres.ITEM_GROUP).defaultMaxDamage(dura));
    }

    @Override
    public boolean canPlayerBreakBlockWhileHolding(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        return false;
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        if (itemStack.getMaxDamage() == itemStack.getDamage()) {
            return ItemStack.EMPTY;
        } else {
            final ItemStack copy = itemStack.copy();
            copy.setDamage(copy.getDamage() + 1);
            return copy;
        }
    }

}
