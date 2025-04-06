package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


import java.util.concurrent.CompletableFuture;

import static com.skniro.glass_delight.datagen.MapleItemTagGeneration.ModItemTags.C_CHERRY_LOGS;
import static net.minecraft.registry.tag.ItemTags.*;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, RegistryKeys.ITEM, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "maple_logs"));
        public static final TagKey<Item> C_CHERRY_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "cherry_logs"));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(FENCES)
                .add(Item.fromBlock(MapleBlocks.GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.WHITE_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.ORANGE_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.YELLOW_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.LIME_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.PINK_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.GRAY_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.CYAN_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.PURPLE_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.BLUE_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.BROWN_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.GREEN_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.RED_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.BLACK_STAINED_GLASS_FENCE))
                .add(Item.fromBlock(MapleBlocks.WHITE_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.ORANGE_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.MAGENTA_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.YELLOW_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.LIME_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.PINK_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.GRAY_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.CYAN_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.PURPLE_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.BLUE_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.BROWN_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.GREEN_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.RED_CONCRETE_FENCE))
                .add(Item.fromBlock(MapleBlocks.BLACK_CONCRETE_FENCE))
                .setReplace(false);

    }


}
