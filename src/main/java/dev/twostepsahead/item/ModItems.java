package dev.twostepsahead.item;

import dev.twostepsahead.TwoStepsAhead;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TwoStepsAhead.MOD_ID, "enderite_ingot")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TwoStepsAhead.MOD_ID, name), item);
    }

    public static void registerItems() {
        TwoStepsAhead.LOGGER.info("Registering items: " + TwoStepsAhead.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ENDERITE_INGOT);
        });
        // TODO: add actual items
    }
}
