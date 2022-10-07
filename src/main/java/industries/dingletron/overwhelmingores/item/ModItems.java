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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
