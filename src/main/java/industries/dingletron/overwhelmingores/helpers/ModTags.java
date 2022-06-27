package industries.dingletron.overwhelmingores.helpers;

import industries.dingletron.overwhelmingores.OverwhelmingOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_COAL = mod("ores/coal");
        public static final ITag.INamedTag<Block> ORES_IRON = mod("ores/iron");
        public static final ITag.INamedTag<Block> ORES_GOLD = mod("ores/gold");
        public static final ITag.INamedTag<Block> ORES_LAPIS = mod("ores/lapis");
        public static final ITag.INamedTag<Block> ORES_REDSTONE = mod("ores/redstone");
        public static final ITag.INamedTag<Block> ORES_EMERALD = mod("ores/emerald");
        public static final ITag.INamedTag<Block> ORES_DIAMOND = mod("ores/diamond");
        public static final ITag.INamedTag<Block> ORES_NETHER_QUARTZ = mod("ores/nether_quartz");
        public static final ITag.INamedTag<Block> ORES_NETHER_GOLD = mod("ores/nether_gold");
        public static final ITag.INamedTag<Block> ORES_ANCIENT_DEBRIS = mod("ores/ancient_debris");

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(OverwhelmingOres.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_COAL = mod("ores/coal");
        public static final ITag.INamedTag<Item> ORES_IRON = mod("ores/iron");
        public static final ITag.INamedTag<Item> ORES_GOLD = mod("ores/gold");
        public static final ITag.INamedTag<Item> ORES_LAPIS = mod("ores/lapis");
        public static final ITag.INamedTag<Item> ORES_REDSTONE = mod("ores/redstone");
        public static final ITag.INamedTag<Item> ORES_EMERALD = mod("ores/emerald");
        public static final ITag.INamedTag<Item> ORES_DIAMOND = mod("ores/diamond");
        public static final ITag.INamedTag<Item> ORES_NETHER_QUARTZ = mod("ores/nether_quartz");
        public static final ITag.INamedTag<Item> ORES_NETHER_GOLD = mod("ores/nether_gold");
        public static final ITag.INamedTag<Item> ORES_ANCIENT_DEBRIS = mod("ores/ancient_debris");

        public static final ITag.INamedTag<Item> TOOLS_HAMMER = mod("tools/hammer");
        public static final ITag.INamedTag<Item> BETTER_LAPIS = mod("better/lapis");
        public static final ITag.INamedTag<Item> BETTER_COAL = mod("better/coal");
        public static final ITag.INamedTag<Item> BETTER_IRON = mod("better/iron");
        public static final ITag.INamedTag<Item> BETTER_GOLD = mod("better/gold");
        public static final ITag.INamedTag<Item> BETTER_REDSTONE = mod("better/redstone");
        public static final ITag.INamedTag<Item> BETTER_EMERALD = mod("better/emerald");
        public static final ITag.INamedTag<Item> BETTER_DIAMOND = mod("better/diamond");
        public static final ITag.INamedTag<Item> BETTER_NETHER_QUARTZ = mod("better/nether_quartz");
        public static final ITag.INamedTag<Item> BETTER_NETHERITE = mod("better/netherite");

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(OverwhelmingOres.MOD_ID, path).toString());
        }

    }
}
