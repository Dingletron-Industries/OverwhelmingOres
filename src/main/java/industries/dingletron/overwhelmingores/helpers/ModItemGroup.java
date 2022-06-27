package industries.dingletron.overwhelmingores.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModItemGroup extends ItemGroup {

    private final RegistryObject<Item> icon;

    public ModItemGroup(String label, RegistryObject<Item> icon) {
        super(label);
        this.icon = icon;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(icon.get());
    }

    // Coal
    //      Pristine...
    // Iron
    //      Pristine...
    //
    // -> Pristine Coal... Pristine Iron...
    @Override
    public void fill(NonNullList<ItemStack> items) {
        List<Item> temp = Registry.ITEM.stream().filter(item -> item.getGroup() == this).collect(Collectors.toList());
        final List<String> types = Arrays.asList(
                "Hammer", "Refined Iron", "Refined Gold", "Coal", "Iron", "Nether Gold", "Lapis", "Redstone", "Emerald",
                "Diamond", "Nether Quartz", "Gold", "Ancient Debris", "Netherite Scrap"
        );
        final List<String> correctOrder = Arrays.asList(
                "Pristine", "Wealthy", "Enriched", "Lump", "Poor", "Chunk", "Slice", "Reduced", "Tiny", "Scanty");
        final TreeMap<Integer, TreeMap<Integer, Item>> overhead = new TreeMap<>();
        for (Item item : temp) {
            final String displayName = item.getDisplayName(new ItemStack(item)).getString();
            final int typeId = IntStream.range(0, types.size())
                    .filter(i -> displayName.toLowerCase().contains(types.get(i).toLowerCase()))
                    .findFirst()
                    .orElse(-1); // Coal/Iron/Diamond etc. etc.
            final int qualityId = IntStream.range(0, correctOrder.size())
                    .filter(i -> displayName.toLowerCase().contains(correctOrder.get(i).toLowerCase()))
                    .findFirst()
                    .orElse(-1);
            final TreeMap<Integer, Item> contents = overhead.getOrDefault(typeId, new TreeMap<>()); // Coal, etc. / Unknown
            contents.put(qualityId == -1 ? contents.size() : qualityId, item);
            overhead.put(typeId, contents);
        }
        temp.clear();
        overhead.forEach((k, value) -> temp.addAll(value.values()));
        temp.stream().map(ItemStack::new).forEach(items::add);
    }

}
