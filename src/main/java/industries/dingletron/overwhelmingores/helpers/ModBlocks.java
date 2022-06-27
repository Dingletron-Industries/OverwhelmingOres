package industries.dingletron.overwhelmingores.helpers;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import industries.dingletron.overwhelmingores.blocks.ancientdebris.*;
import industries.dingletron.overwhelmingores.blocks.coal.*;
import industries.dingletron.overwhelmingores.blocks.diamond.*;
import industries.dingletron.overwhelmingores.blocks.emerald.*;
import industries.dingletron.overwhelmingores.blocks.gold.*;
import industries.dingletron.overwhelmingores.blocks.iron.*;
import industries.dingletron.overwhelmingores.blocks.lapis.*;
import industries.dingletron.overwhelmingores.blocks.nethergold.*;
import industries.dingletron.overwhelmingores.blocks.netherquartz.*;
import industries.dingletron.overwhelmingores.blocks.redstone.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    // nighty night <3 xoxoxoxo - One of the coolest people I've met. <3

    public static RegistryObject<Item> PRISTINE_COAL_ORE_ITEM;

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OverwhelmingOres.MOD_ID);

    public static final RegistryObject<Block> PRISTINE_COAL_ORE =
            registerBlock("pristine_coal_ore", PristineCoalOre::new);
    public static final RegistryObject<Block> WEALTHY_COAL_ORE =
            registerBlock("wealthy_coal_ore", WealthyCoalOre::new);
    public static final RegistryObject<Block> ENRICHED_COAL_ORE =
            registerBlock("enriched_coal_ore", EnrichedCoalOre::new);
    public static final RegistryObject<Block> POOR_COAL_ORE =
            registerBlock("poor_coal_ore", PoorCoalOre::new);
    public static final RegistryObject<Block> REDUCED_COAL_ORE =
            registerBlock("reduced_coal_ore", ReducedCoalOre::new);
    public static final RegistryObject<Block> SCANTY_COAL_ORE =
            registerBlock("scanty_coal_ore", ScantyCoalOre::new);

    public static final RegistryObject<Block> PRISTINE_IRON_ORE =
            registerBlock("pristine_iron_ore", PristineIronOre::new);
    public static final RegistryObject<Block> WEALTHY_IRON_ORE =
            registerBlock("wealthy_iron_ore", WealthyIronOre::new);
    public static final RegistryObject<Block> ENRICHED_IRON_ORE =
            registerBlock("enriched_iron_ore", EnrichedIronOre::new);
    public static final RegistryObject<Block> POOR_IRON_ORE =
            registerBlock("poor_iron_ore", PoorIronOre::new);
    public static final RegistryObject<Block> REDUCED_IRON_ORE =
            registerBlock("reduced_iron_ore", ReducedIronOre::new);
    public static final RegistryObject<Block> SCANTY_IRON_ORE =
            registerBlock("scanty_iron_ore", ScantyIronOre::new);

    public static final RegistryObject<Block> PRISTINE_GOLD_ORE =
            registerBlock("pristine_gold_ore", PristineGoldOre::new);
    public static final RegistryObject<Block> WEALTHY_GOLD_ORE =
            registerBlock("wealthy_gold_ore", WealthyGoldOre::new);
    public static final RegistryObject<Block> ENRICHED_GOLD_ORE =
            registerBlock("enriched_gold_ore", EnrichedGoldOre::new);
    public static final RegistryObject<Block> POOR_GOLD_ORE =
            registerBlock("poor_gold_ore", PoorGoldOre::new);
    public static final RegistryObject<Block> REDUCED_GOLD_ORE =
            registerBlock("reduced_gold_ore", ReducedGoldOre::new);
    public static final RegistryObject<Block> SCANTY_GOLD_ORE =
            registerBlock("scanty_gold_ore", ScantyGoldOre::new);

    public static final RegistryObject<Block> PRISTINE_DIAMOND_ORE =
            registerBlock("pristine_diamond_ore", PristineDiamondOre::new);
    public static final RegistryObject<Block> WEALTHY_DIAMOND_ORE =
            registerBlock("wealthy_diamond_ore", WealthyDiamondOre::new);
    public static final RegistryObject<Block> ENRICHED_DIAMOND_ORE =
            registerBlock("enriched_diamond_ore", EnrichedDiamondOre::new);
    public static final RegistryObject<Block> POOR_DIAMOND_ORE =
            registerBlock("poor_diamond_ore", PoorDiamondOre::new);
    public static final RegistryObject<Block> REDUCED_DIAMOND_ORE =
            registerBlock("reduced_diamond_ore", ReducedDiamondOre::new);
    public static final RegistryObject<Block> SCANTY_DIAMOND_ORE =
            registerBlock("scanty_diamond_ore", ScantyDiamondOre::new);

    public static final RegistryObject<Block> PRISTINE_NETHER_GOLD_ORE =
            registerBlock("pristine_nether_gold_ore", PristineNetherGoldOre::new);
    public static final RegistryObject<Block> WEALTHY_NETHER_GOLD_ORE =
            registerBlock("wealthy_nether_gold_ore", WealthyNetherGoldOre::new);
    public static final RegistryObject<Block> ENRICHED_NETHER_GOLD_ORE =
            registerBlock("enriched_nether_gold_ore", EnrichedNetherGoldOre::new);
    public static final RegistryObject<Block> POOR_NETHER_GOLD_ORE =
            registerBlock("poor_nether_gold_ore", PoorNetherGoldOre::new);
    public static final RegistryObject<Block> REDUCED_NETHER_GOLD_ORE =
            registerBlock("reduced_nether_gold_ore", ReducedNetherGoldOre::new);
    public static final RegistryObject<Block> SCANTY_NETHER_GOLD_ORE =
            registerBlock("scanty_nether_gold_ore", ScantyNetherGoldOre::new);

    public static final RegistryObject<Block> PRISTINE_NETHER_QUARTZ_ORE =
            registerBlock("pristine_nether_quartz_ore", PristineNetherQuartzOre::new);
    public static final RegistryObject<Block> WEALTHY_NETHER_QUARTZ_ORE =
            registerBlock("wealthy_nether_quartz_ore", WealthyNetherQuartzOre::new);
    public static final RegistryObject<Block> ENRICHED_NETHER_QUARTZ_ORE =
            registerBlock("enriched_nether_quartz_ore", EnrichedNetherQuartzOre::new);
    public static final RegistryObject<Block> POOR_NETHER_QUARTZ_ORE =
            registerBlock("poor_nether_quartz_ore", PoorNetherQuartzOre::new);
    public static final RegistryObject<Block> REDUCED_NETHER_QUARTZ_ORE =
            registerBlock("reduced_nether_quartz_ore", ReducedNetherQuartzOre::new);
    public static final RegistryObject<Block> SCANTY_NETHER_QUARTZ_ORE =
            registerBlock("scanty_nether_quartz_ore", ScantyNetherQuartzOre::new);

    public static final RegistryObject<Block> PRISTINE_EMERALD_ORE =
            registerBlock("pristine_emerald_ore", PristineEmeraldOre::new);
    public static final RegistryObject<Block> WEALTHY_EMERALD_ORE =
            registerBlock("wealthy_emerald_ore", WealthyEmeraldOre::new);
    public static final RegistryObject<Block> ENRICHED_EMERALD_ORE =
            registerBlock("enriched_emerald_ore", EnrichedEmeraldOre::new);
    public static final RegistryObject<Block> POOR_EMERALD_ORE =
            registerBlock("poor_emerald_ore", PoorEmeraldOre::new);
    public static final RegistryObject<Block> REDUCED_EMERALD_ORE =
            registerBlock("reduced_emerald_ore", ReducedEmeraldOre::new);
    public static final RegistryObject<Block> SCANTY_EMERALD_ORE =
            registerBlock("scanty_emerald_ore", ScantyEmeraldOre::new);

    public static final RegistryObject<Block> PRISTINE_REDSTONE_ORE =
            registerBlock("pristine_redstone_ore", PristineRedstoneOre::new);
    public static final RegistryObject<Block> WEALTHY_REDSTONE_ORE =
            registerBlock("wealthy_redstone_ore", WealthyRedstoneOre::new);
    public static final RegistryObject<Block> ENRICHED_REDSTONE_ORE =
            registerBlock("enriched_redstone_ore", EnrichedRedstoneOre::new);
    public static final RegistryObject<Block> POOR_REDSTONE_ORE =
            registerBlock("poor_redstone_ore", PoorRedstoneOre::new);
    public static final RegistryObject<Block> REDUCED_REDSTONE_ORE =
            registerBlock("reduced_redstone_ore", ReducedRedstoneOre::new);
    public static final RegistryObject<Block> SCANTY_REDSTONE_ORE =
            registerBlock("scanty_redstone_ore", ScantyRedstoneOre::new);

    public static final RegistryObject<Block> PRISTINE_LAPIS_ORE =
            registerBlock("pristine_lapis_ore", PristineLapisOre::new);
    public static final RegistryObject<Block> WEALTHY_LAPIS_ORE =
            registerBlock("wealthy_lapis_ore", WealthyLapisOre::new);
    public static final RegistryObject<Block> ENRICHED_LAPIS_ORE =
            registerBlock("enriched_lapis_ore", EnrichedLapisOre::new);
    public static final RegistryObject<Block> POOR_LAPIS_ORE =
            registerBlock("poor_lapis_ore", PoorLapisOre::new);
    public static final RegistryObject<Block> REDUCED_LAPIS_ORE =
            registerBlock("reduced_lapis_ore", ReducedLapisOre::new);
    public static final RegistryObject<Block> SCANTY_LAPIS_ORE =
            registerBlock("scanty_lapis_ore", ScantyLapisOre::new);

    public static final RegistryObject<Block> PRISTINE_ANCIENT_DEBRIS_ORE =
            registerBlock("pristine_ancient_debris_ore", PristineAncientDebrisOre::new);
    public static final RegistryObject<Block> WEALTHY_ANCIENT_DEBRIS_ORE =
            registerBlock("wealthy_ancient_debris_ore", WealthyAncientDebrisOre::new);
    public static final RegistryObject<Block> ENRICHED_ANCIENT_DEBRIS_ORE =
            registerBlock("enriched_ancient_debris_ore", EnrichedAncientDebrisOre::new);
    public static final RegistryObject<Block> POOR_ANCIENT_DEBRIS_ORE =
            registerBlock("poor_ancient_debris_ore", PoorAncientDebrisOre::new);
    public static final RegistryObject<Block> REDUCED_ANCIENT_DEBRIS_ORE =
            registerBlock("reduced_ancient_debris_ore", ReducedAncientDebrisOre::new);
    public static final RegistryObject<Block> SCANTY_ANCIENT_DEBRIS_ORE =
            registerBlock("scanty_ancient_debris_ore", ScantyAncientDebrisOre::new);


    //Registers the new blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //Registers the blocks as items
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        RegistryObject<Item> object = ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(OverwhelmingOres.BLOCK_GROUP)));
        if (name.equals("pristine_coal_ore")) PRISTINE_COAL_ORE_ITEM = object;
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
