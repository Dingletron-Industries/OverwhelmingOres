package industries.dingletron.overwhelmingores.blocks.emerald;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class PristineEmeraldOre extends Block {

    public PristineEmeraldOre() {
        super(Properties
                .create(Material.ROCK)
                .hardnessAndResistance(5.0f, 6.9f)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .harvestLevel(3)
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch != 0 ? 0 : new Random().nextInt(10)*(fortune + 1);
    }

}