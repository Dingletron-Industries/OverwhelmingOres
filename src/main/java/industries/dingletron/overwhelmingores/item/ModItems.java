package industries.dingletron.overwhelmingores.item;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OverwhelmingOres.MOD_ID);

    //Coal Items
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COAL_CHUNK = ITEMS.register("coal_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COAL_LUMP = ITEMS.register("coal_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ENRICHED_COAL = ITEMS.register("enriched_coal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEALTHY_COAL = ITEMS.register("wealthy_coal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PRISTINE_COAL = ITEMS.register("pristine_coal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Raw Iron Items
    public static final RegistryObject<Item> RAW_TINY_IRON = ITEMS.register("raw_tiny_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_IRON_CHUNK = ITEMS.register("raw_iron_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_IRON_LUMP = ITEMS.register("raw_iron_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_ENRICHED_IRON = ITEMS.register("raw_enriched_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_WEALTHY_IRON = ITEMS.register("raw_wealthy_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_PRISTINE_IRON = ITEMS.register("raw_pristine_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Refined Iron Items
    public static final RegistryObject<Item> REFINED_TINY_IRON = ITEMS.register("refined_tiny_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_IRON_CHUNK = ITEMS.register("refined_iron_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_IRON_LUMP = ITEMS.register("refined_iron_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_ENRICHED_IRON = ITEMS.register("refined_enriched_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_WEALTHY_IRON = ITEMS.register("refined_wealthy_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_PRISTINE_IRON = ITEMS.register("refined_pristine_iron",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Raw Gold Items
    public static final RegistryObject<Item> RAW_TINY_GOLD = ITEMS.register("raw_tiny_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_GOLD_CHUNK = ITEMS.register("raw_gold_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_GOLD_LUMP = ITEMS.register("raw_gold_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_ENRICHED_GOLD = ITEMS.register("raw_enriched_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_WEALTHY_GOLD = ITEMS.register("raw_wealthy_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_PRISTINE_GOLD = ITEMS.register("raw_pristine_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Refined Gold Items
    public static final RegistryObject<Item> REFINED_TINY_GOLD = ITEMS.register("refined_tiny_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_GOLD_CHUNK = ITEMS.register("refined_gold_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_GOLD_LUMP = ITEMS.register("refined_gold_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_ENRICHED_GOLD = ITEMS.register("refined_enriched_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_WEALTHY_GOLD = ITEMS.register("refined_wealthy_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_PRISTINE_GOLD = ITEMS.register("refined_pristine_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    /*Raw Nether Gold Items
    public static final RegistryObject<Item> RAW_TINY_GOLD = ITEMS.register("raw_tiny_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_GOLD_CHUNK = ITEMS.register("raw_gold_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_GOLD_LUMP = ITEMS.register("raw_gold_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_ENRICHED_GOLD = ITEMS.register("raw_enriched_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_WEALTHY_GOLD = ITEMS.register("raw_wealthy_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_PRISTINE_GOLD = ITEMS.register("raw_pristine_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Refined Nether Gold Items
    public static final RegistryObject<Item> REFINED_TINY_GOLD = ITEMS.register("refined_tiny_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_GOLD_CHUNK = ITEMS.register("refined_gold_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_GOLD_LUMP = ITEMS.register("refined_gold_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_ENRICHED_GOLD = ITEMS.register("refined_enriched_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_WEALTHY_GOLD = ITEMS.register("refined_wealthy_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINED_PRISTINE_GOLD = ITEMS.register("refined_pristine_gold",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));*/

    //Lapis Items
    public static final RegistryObject<Item> TINY_LAPIS = ITEMS.register("tiny_lapis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LAPIS_CHUNK = ITEMS.register("lapis_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LAPIS_LUMP = ITEMS.register("lapis_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ENRICHED_LAPIS = ITEMS.register("enriched_lapis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEALTHY_LAPIS = ITEMS.register("wealthy_lapis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PRISTINE_LAPIS = ITEMS.register("pristine_lapis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Redstone Items
    public static final RegistryObject<Item> TINY_REDSTONE = ITEMS.register("tiny_redstone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REDSTONE_CHUNK = ITEMS.register("redstone_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REDSTONE_LUMP = ITEMS.register("redstone_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ENRICHED_REDSTONE = ITEMS.register("enriched_redstone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEALTHY_REDSTONE = ITEMS.register("wealthy_redstone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PRISTINE_REDSTONE = ITEMS.register("pristine_redstone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Diamond Items
    public static final RegistryObject<Item> TINY_DIAMOND = ITEMS.register("tiny_diamond",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_CHUNK = ITEMS.register("diamond_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_LUMP = ITEMS.register("diamond_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ENRICHED_DIAMOND = ITEMS.register("enriched_diamond",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEALTHY_DIAMOND = ITEMS.register("wealthy_diamond",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PRISTINE_DIAMOND = ITEMS.register("pristine_diamond",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Emerald Items
    public static final RegistryObject<Item> TINY_EMERALD = ITEMS.register("tiny_emerald",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_CHUNK = ITEMS.register("emerald_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_LUMP = ITEMS.register("emerald_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ENRICHED_EMERALD = ITEMS.register("enriched_emerald",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEALTHY_EMERALD = ITEMS.register("wealthy_emerald",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PRISTINE_EMERALD = ITEMS.register("pristine_emerald",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Nether Quartz Items
    public static final RegistryObject<Item> TINY_NETHER_QUARTZ = ITEMS.register("tiny_nether_quartz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> NETHER_QUARTZ_CHUNK = ITEMS.register("nether_quartz_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> NETHER_QUARTZ_LUMP = ITEMS.register("nether_quartz_lump",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ENRICHED_NETHER_QUARTZ = ITEMS.register("enriched_nether_quartz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEALTHY_NETHER_QUARTZ = ITEMS.register("wealthy_nether_quartz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PRISTINE_NETHER_QUARTZ = ITEMS.register("pristine_nether_quartz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Netherite Scrap Items
    public static final RegistryObject<Item> TINY_NETHERITE_SCRAP = ITEMS.register("tiny_netherite_scrap",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> NETHERITE_SCRAP_SLICE = ITEMS.register("netherite_scrap_slice",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> NETHERITE_SCRAP_PIECE = ITEMS.register("netherite_scrap_piece",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> STACKED_NETHERITE_SCRAP = ITEMS.register("stacked_netherite_scrap",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BOUND_NETHERITE_SCRAP = ITEMS.register("bound_netherite_scrap",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_SCRAP = ITEMS.register("compressed_netherite_scrap",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Hammers
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
