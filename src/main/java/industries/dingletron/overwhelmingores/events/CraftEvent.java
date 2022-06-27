package industries.dingletron.overwhelmingores.events;

import industries.dingletron.overwhelmingores.helpers.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Arrays;
import java.util.HashSet;

public class CraftEvent {

    @SubscribeEvent
    public void onCraft(PlayerEvent.ItemCraftedEvent event) {
        final PlayerEntity player = event.getPlayer();
        if (event.getInventory() instanceof CraftingInventory) {
            if (event.getInventory().hasAny(new HashSet<>(Arrays.asList(
                    ModItems.DIAMOND_HAMMER.get(), ModItems.NETHERITE_HAMMER.get(), ModItems.IRON_HAMMER.get(),
                    ModItems.GOLD_HAMMER.get(), ModItems.STONE_HAMMER.get()
            )))) {
                player.world.playSound(player, event.getPlayer().getPosition(),
                        SoundEvents.BLOCK_ANVIL_USE, SoundCategory.AMBIENT, 1, 1);
            }
        }
    }

}
