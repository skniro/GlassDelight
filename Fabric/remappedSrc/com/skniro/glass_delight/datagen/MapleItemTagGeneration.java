package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import java.util.concurrent.CompletableFuture;

import static com.skniro.glass_delight.datagen.MapleItemTagGeneration.ModItemTags.C_CHERRY_LOGS;
import static net.minecraft.tags.ItemTags.*;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, Registries.ITEM, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "maple_logs"));
        public static final TagKey<Item> C_CHERRY_LOGS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "cherry_logs"));
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        tag(FENCES)
                .add(Item.byBlock(MapleBlocks.GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.WHITE_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.ORANGE_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.YELLOW_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.LIME_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.PINK_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.GRAY_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.CYAN_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.PURPLE_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.BLUE_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.BROWN_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.GREEN_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.RED_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.BLACK_STAINED_GLASS_FENCE))
                .add(Item.byBlock(MapleBlocks.WHITE_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.ORANGE_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.MAGENTA_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.YELLOW_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.LIME_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.PINK_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.GRAY_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.CYAN_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.PURPLE_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.BLUE_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.BROWN_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.GREEN_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.RED_CONCRETE_FENCE))
                .add(Item.byBlock(MapleBlocks.BLACK_CONCRETE_FENCE))
                .setReplace(false);

    }


}
