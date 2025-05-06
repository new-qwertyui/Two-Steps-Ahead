package dev.twostepsahead.util;

import dev.twostepsahead.TwoStepsAhead;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTags("incorrect_for_enderite_tool");

        public static TagKey<Block> createTags(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TwoStepsAhead.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ENDERITE_REPAIR = createTags("enderite_repair");

        public static TagKey<Item> createTags(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TwoStepsAhead.MOD_ID, name));
        }
    }
}
