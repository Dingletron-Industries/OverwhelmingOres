package industries.dingletron.overwhelmingores.block;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import industries.dingletron.overwhelmingores.item.ModCreativeModeTab;
import industries.dingletron.overwhelmingores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OverwhelmingOres.MOD_ID);

    /*!Stone Ores!*/
    //Stone Coal Ores
    public static final RegistryObject<Block> SCANTY_COAL_ORE = registerBlock("scanty_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_COAL_ORE = registerBlock("reduced_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_COAL_ORE = registerBlock("poor_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_COAL_ORE = registerBlock("enriched_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_COAL_ORE = registerBlock("wealthy_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_COAL_ORE = registerBlock("pristine_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Iron Ores
    public static final RegistryObject<Block> SCANTY_IRON_ORE = registerBlock("scanty_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_IRON_ORE = registerBlock("reduced_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_IRON_ORE = registerBlock("poor_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_IRON_ORE = registerBlock("enriched_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_IRON_ORE = registerBlock("wealthy_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_IRON_ORE = registerBlock("pristine_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Copper Ores
    public static final RegistryObject<Block> SCANTY_COPPER_ORE = registerBlock("scanty_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_COPPER_ORE = registerBlock("reduced_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_COPPER_ORE = registerBlock("poor_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_COPPER_ORE = registerBlock("enriched_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_COPPER_ORE = registerBlock("wealthy_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_COPPER_ORE = registerBlock("pristine_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Gold Ores
    public static final RegistryObject<Block> SCANTY_GOLD_ORE = registerBlock("scanty_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_GOLD_ORE = registerBlock("reduced_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_GOLD_ORE = registerBlock("poor_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_GOLD_ORE = registerBlock("enriched_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_GOLD_ORE = registerBlock("wealthy_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_GOLD_ORE = registerBlock("pristine_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Redstone Ores
    public static final RegistryObject<Block> SCANTY_REDSTONE_ORE = registerBlock("scanty_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_REDSTONE_ORE = registerBlock("reduced_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_REDSTONE_ORE = registerBlock("poor_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_REDSTONE_ORE = registerBlock("enriched_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_REDSTONE_ORE = registerBlock("wealthy_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_REDSTONE_ORE = registerBlock("pristine_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Lapis Ores
    public static final RegistryObject<Block> SCANTY_LAPIS_ORE = registerBlock("scanty_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_LAPIS_ORE = registerBlock("reduced_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_LAPIS_ORE = registerBlock("poor_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_LAPIS_ORE = registerBlock("enriched_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_LAPIS_ORE = registerBlock("wealthy_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_LAPIS_ORE = registerBlock("pristine_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Emerald Ores
    public static final RegistryObject<Block> SCANTY_EMERALD_ORE = registerBlock("scanty_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_EMERALD_ORE = registerBlock("reduced_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_EMERALD_ORE = registerBlock("poor_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_EMERALD_ORE = registerBlock("enriched_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_EMERALD_ORE = registerBlock("wealthy_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_EMERALD_ORE = registerBlock("pristine_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Stone Diamond Ores
    public static final RegistryObject<Block> SCANTY_DIAMOND_ORE = registerBlock("scanty_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_DIAMOND_ORE = registerBlock("reduced_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_DIAMOND_ORE = registerBlock("poor_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_DIAMOND_ORE = registerBlock("enriched_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_DIAMOND_ORE = registerBlock("wealthy_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_DIAMOND_ORE = registerBlock("pristine_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    /*!Deepslate Ores!*/
    //Deepslate Coal Ores
    public static final RegistryObject<Block> SCANTY_DEEPSLATE_COAL_ORE =
            registerBlock("scanty_deepslate_coal_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_DEEPSLATE_COAL_ORE =
            registerBlock("reduced_deepslate_coal_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_DEEPSLATE_COAL_ORE =
            registerBlock("poor_deepslate_coal_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_DEEPSLATE_COAL_ORE =
            registerBlock("enriched_deepslate_coal_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_DEEPSLATE_COAL_ORE =
            registerBlock("wealthy_deepslate_coal_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_DEEPSLATE_COAL_ORE =
            registerBlock("pristine_deepslate_coal_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Deepslate Iron Ores
    public static final RegistryObject<Block> SCANTY_DEEPSLATE_IRON_ORE =
            registerBlock("scanty_deepslate_iron_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_DEEPSLATE_IRON_ORE =
            registerBlock("reduced_deepslate_iron_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_DEEPSLATE_IRON_ORE =
            registerBlock("poor_deepslate_iron_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_DEEPSLATE_IRON_ORE =
            registerBlock("enriched_deepslate_iron_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_DEEPSLATE_IRON_ORE =
            registerBlock("wealthy_deepslate_iron_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_DEEPSLATE_IRON_ORE =
            registerBlock("pristine_deepslate_iron_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    /*!Nether Ores!*/
    //Nether Quartz Ores
    public static final RegistryObject<Block> SCANTY_NETHER_QUARTZ_ORE =
            registerBlock("scanty_nether_quartz_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_NETHER_QUARTZ_ORE =
            registerBlock("reduced_nether_quartz_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_NETHER_QUARTZ_ORE =
            registerBlock("poor_nether_quartz_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_NETHER_QUARTZ_ORE =
            registerBlock("enriched_nether_quartz_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_NETHER_QUARTZ_ORE =
            registerBlock("wealthy_nether_quartz_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_NETHER_QUARTZ_ORE =
            registerBlock("pristine_nether_quartz_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    //Ancient Debris Ore
    public static final RegistryObject<Block> SCANTY_ANCIENT_DEBRIS_ORE =
            registerBlock("scanty_ancient_debris_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_ANCIENT_DEBRIS_ORE =
            registerBlock("reduced_ancient_debris_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_ANCIENT_DEBRIS_ORE =
            registerBlock("poor_ancient_debris_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_ANCIENT_DEBRIS_ORE =
            registerBlock("enriched_ancient_debris_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_ANCIENT_DEBRIS_ORE =
            registerBlock("wealthy_ancient_debris_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_ANCIENT_DEBRIS_ORE =
            registerBlock("pristine_ancient_debris_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);

    /*Nether Gold Ores
    public static final RegistryObject<Block> SCANTY_NETHER_GOLD_ORE = registerBlock("scanty_nether_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> REDUCED_NETHER_GOLD_ORE = registerBlock("reduced_nether_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> POOR_NETHER_GOLD_ORE = registerBlock("poor_nether_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> ENRICHED_NETHER_GOLD_ORE = registerBlock("enriched_nether_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> WEALTHY_NETHER_GOLD_ORE = registerBlock("wealthy_nether_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);
    public static final RegistryObject<Block> PRISTINE_NETHER_GOLD_ORE = registerBlock("pristine_nether_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OVERWHELMINGORES_BLOCKS_TAB);*/

    private static <T extends Block> RegistryObject<T>
    registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {

       RegistryObject<T> toReturn = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn, tab);
       return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
