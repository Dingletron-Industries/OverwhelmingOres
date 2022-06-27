package industries.dingletron.overwhelmingores.helpers;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import industries.dingletron.overwhelmingores.items.coal.*;
import industries.dingletron.overwhelmingores.items.diamond.*;
import industries.dingletron.overwhelmingores.items.emerald.*;
import industries.dingletron.overwhelmingores.items.gold.*;
import industries.dingletron.overwhelmingores.items.hammer.*;
import industries.dingletron.overwhelmingores.items.iron.*;
import industries.dingletron.overwhelmingores.items.lapis.*;
import industries.dingletron.overwhelmingores.items.nether_quartz.*;
import industries.dingletron.overwhelmingores.items.netherite.*;
import industries.dingletron.overwhelmingores.items.redstone.*;
import industries.dingletron.overwhelmingores.items.refined_gold.*;
import industries.dingletron.overwhelmingores.items.refined_iron.*;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OverwhelmingOres.MOD_ID);

    // Hammers
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", StoneHammer::new);
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", IronHammer::new);
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer", GoldHammer::new);
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", DiamondHammer::new);
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", NetheriteHammer::new);


    //Coal Items
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", TinyCoal::new);
    public static final RegistryObject<Item> COAL_CHUNK = ITEMS.register("coal_chunk", CoalChunk::new);
    public static final RegistryObject<Item> COAL_LUMP = ITEMS.register("coal_lump", CoalLump::new);
    public static final RegistryObject<Item> ENRICHED_COAL = ITEMS.register("enriched_coal", EnrichedCoal::new);
    public static final RegistryObject<Item> WEALTHY_COAL = ITEMS.register("wealthy_coal", WealthyCoal::new);
    public static final RegistryObject<Item> PRISTINE_COAL = ITEMS.register("pristine_coal", PristineCoal::new);

    //Raw Iron Items
    public static final RegistryObject<Item> TINY_IRON = ITEMS.register("tiny_iron", TinyIron::new);
    public static final RegistryObject<Item> IRON_CHUNK = ITEMS.register("iron_chunk", IronChunk::new);
    public static final RegistryObject<Item> IRON_LUMP = ITEMS.register("iron_lump", IronLump::new);
    public static final RegistryObject<Item> ENRICHED_IRON = ITEMS.register("enriched_iron", EnrichedIron::new);
    public static final RegistryObject<Item> WEALTHY_IRON = ITEMS.register("wealthy_iron", WealthyIron::new);
    public static final RegistryObject<Item> PRISTINE_IRON = ITEMS.register("pristine_iron", PristineIron::new);

    //Raw Gold Items
    public static final RegistryObject<Item> TINY_GOLD = ITEMS.register("tiny_gold", TinyGold::new);
    public static final RegistryObject<Item> GOLD_CHUNK = ITEMS.register("gold_chunk", GoldChunk::new);
    public static final RegistryObject<Item> GOLD_LUMP = ITEMS.register("gold_lump", GoldLump::new);
    public static final RegistryObject<Item> ENRICHED_GOLD = ITEMS.register("enriched_gold", EnrichedGold::new);
    public static final RegistryObject<Item> WEALTHY_GOLD = ITEMS.register("wealthy_gold", WealthyGold::new);
    public static final RegistryObject<Item> PRISTINE_GOLD = ITEMS.register("pristine_gold", PristineGold::new);

    //Lapis Items
    public static final RegistryObject<Item> TINY_LAPIS = ITEMS.register("tiny_lapis", TinyLapis::new);
    public static final RegistryObject<Item> LAPIS_CHUNK = ITEMS.register("lapis_chunk", LapisChunk::new);
    public static final RegistryObject<Item> LAPIS_LUMP = ITEMS.register("lapis_lump", LapisLump::new);
    public static final RegistryObject<Item> ENRICHED_LAPIS = ITEMS.register("enriched_lapis", EnrichedLapis::new);
    public static final RegistryObject<Item> WEALTHY_LAPIS = ITEMS.register("wealthy_lapis", WealthyLapis::new);
    public static final RegistryObject<Item> PRISTINE_LAPIS = ITEMS.register("pristine_lapis", PristineLapis::new);

    //Redstone Items
    public static final RegistryObject<Item> TINY_REDSTONE = ITEMS.register("tiny_redstone", TinyRedstone::new);
    public static final RegistryObject<Item> REDSTONE_CHUNK = ITEMS.register("redstone_chunk", RedstoneChunk::new);
    public static final RegistryObject<Item> REDSTONE_LUMP = ITEMS.register("redstone_lump", RedstoneLump::new);
    public static final RegistryObject<Item> ENRICHED_REDSTONE = ITEMS.register("enriched_redstone", EnrichedRedstone::new);
    public static final RegistryObject<Item> WEALTHY_REDSTONE = ITEMS.register("wealthy_redstone", WealthyRedstone::new);
    public static final RegistryObject<Item> PRISTINE_REDSTONE = ITEMS.register("pristine_redstone", PristineRedstone::new);

    //Emerald Items
    public static final RegistryObject<Item> TINY_EMERALD = ITEMS.register("tiny_emerald", TinyEmerald::new);
    public static final RegistryObject<Item> EMERALD_CHUNK = ITEMS.register("emerald_chunk", EmeraldChunk::new);
    public static final RegistryObject<Item> EMERALD_LUMP = ITEMS.register("emerald_lump", EmeraldLump::new);
    public static final RegistryObject<Item> ENRICHED_EMERALD = ITEMS.register("enriched_emerald", EnrichedEmerald::new);
    public static final RegistryObject<Item> WEALTHY_EMERALD = ITEMS.register("wealthy_emerald", WealthyEmerald::new);
    public static final RegistryObject<Item> PRISTINE_EMERALD = ITEMS.register("pristine_emerald", PristineEmerald::new);

    //Diamond Items
    public static final RegistryObject<Item> TINY_DIAMOND = ITEMS.register("tiny_diamond", TinyDiamond::new);
    public static final RegistryObject<Item> DIAMOND_CHUNK = ITEMS.register("diamond_chunk", DiamondChunk::new);
    public static final RegistryObject<Item> DIAMOND_LUMP = ITEMS.register("diamond_lump", DiamondLump::new);
    public static final RegistryObject<Item> ENRICHED_DIAMOND = ITEMS.register("enriched_diamond", EnrichedDiamond::new);
    public static final RegistryObject<Item> WEALTHY_DIAMOND = ITEMS.register("wealthy_diamond", WealthyDiamond::new);
    public static final RegistryObject<Item> PRISTINE_DIAMOND = ITEMS.register("pristine_diamond", PristineDiamond::new);

    //Nether Quartz Items
    public static final RegistryObject<Item> TINY_NETHER_QUARTZ = ITEMS.register("tiny_nether_quartz", TinyNetherQuartz::new);
    public static final RegistryObject<Item> NETHER_QUARTZ_CHUNK = ITEMS.register("nether_quartz_chunk", NetherQuartzChunk::new);
    public static final RegistryObject<Item> NETHER_QUARTZ_LUMP = ITEMS.register("nether_quartz_lump", NetherQuartzLump::new);
    public static final RegistryObject<Item> ENRICHED_NETHER_QUARTZ = ITEMS.register("enriched_nether_quartz", EnrichedNetherQuartz::new);
    public static final RegistryObject<Item> WEALTHY_NETHER_QUARTZ = ITEMS.register("wealthy_nether_quartz", WealthyNetherQuartz::new);
    public static final RegistryObject<Item> PRISTINE_NETHER_QUARTZ = ITEMS.register("pristine_nether_quartz", PristineNetherQuartz::new);

    //Netherite Items
    public static final RegistryObject<Item> TINY_NETHERITE_SCRAP = ITEMS.register("tiny_netherite_scrap", TinyNetheriteScrap::new);
    public static final RegistryObject<Item> NETHERITE_SCRAP_PIECE = ITEMS.register("netherite_scrap_piece", NetheriteScrapPiece::new);
    public static final RegistryObject<Item> NETHERITE_SCRAP_SLICE = ITEMS.register("netherite_scrap_slice", NetheriteScrapSlice::new);
    public static final RegistryObject<Item> STACKED_NETHERITE_SCRAP = ITEMS.register("stacked_netherite_scrap", StackedNetheriteScrap::new);
    public static final RegistryObject<Item> BOUND_NETHERITE_SCRAP = ITEMS.register("bound_netherite_scrap", BoundNetheriteScrap::new);
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_SCRAP = ITEMS.register("compressed_netherite_scrap", CompressedNetheriteScrap::new);

    //Refined Gold Items
    public static final RegistryObject<Item> TINY_REFINED_GOLD = ITEMS.register("tiny_refined_gold", TinyRefinedGold::new);
    public static final RegistryObject<Item> REFINED_GOLD_CHUNK = ITEMS.register("refined_gold_chunk", RefinedGoldChunk::new);
    public static final RegistryObject<Item> REFINED_GOLD_LUMP = ITEMS.register("refined_gold_lump", RefinedGoldLump::new);
    public static final RegistryObject<Item> ENRICHED_REFINED_GOLD = ITEMS.register("enriched_refined_gold", EnrichedRefinedGold::new);
    public static final RegistryObject<Item> WEALTHY_REFINED_GOLD = ITEMS.register("wealthy_refined_gold", WealthyRefinedGold::new);
    public static final RegistryObject<Item> PRISTINE_REFINED_GOLD = ITEMS.register("pristine_refined_gold", PristineRefinedGold::new);

    //Refined Iron Items
    public static final RegistryObject<Item> TINY_REFINED_IRON = ITEMS.register("tiny_refined_iron", TinyRefinedIron::new);
    public static final RegistryObject<Item> REFINED_IRON_CHUNK = ITEMS.register("refined_iron_chunk", RefinedIronChunk::new);
    public static final RegistryObject<Item> REFINED_IRON_LUMP = ITEMS.register("refined_iron_lump", RefinedIronLump::new);
    public static final RegistryObject<Item> ENRICHED_REFINED_IRON = ITEMS.register("enriched_refined_iron", EnrichedRefinedIron::new);
    public static final RegistryObject<Item> WEALTHY_REFINED_IRON = ITEMS.register("wealthy_refined_iron", WealthyRefinedIron::new);
    public static final RegistryObject<Item> PRISTINE_REFINED_IRON = ITEMS.register("pristine_refined_iron", PristineRefinedIron::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
