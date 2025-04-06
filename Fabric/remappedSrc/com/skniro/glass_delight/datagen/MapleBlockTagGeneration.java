package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.block.MapleSignBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

import static com.skniro.glass_delight.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.tags.BlockTags.*;
import static net.minecraft.tags.ItemTags.FENCES;


public class MapleBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public MapleBlockTagGeneration(FabricDataOutput dataGenerator,CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "plaster"));

    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        tag(BlockTags.FENCES)
                .add(MapleBlocks.GLASS_FENCE)
                .add(MapleBlocks.WHITE_STAINED_GLASS_FENCE)
                .add(MapleBlocks.ORANGE_STAINED_GLASS_FENCE)
                .add(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE)
                .add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE)
                .add(MapleBlocks.YELLOW_STAINED_GLASS_FENCE)
                .add(MapleBlocks.LIME_STAINED_GLASS_FENCE)
                .add(MapleBlocks.PINK_STAINED_GLASS_FENCE)
                .add(MapleBlocks.GRAY_STAINED_GLASS_FENCE)
                .add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE)
                .add(MapleBlocks.CYAN_STAINED_GLASS_FENCE)
                .add(MapleBlocks.PURPLE_STAINED_GLASS_FENCE)
                .add(MapleBlocks.BLUE_STAINED_GLASS_FENCE)
                .add(MapleBlocks.BROWN_STAINED_GLASS_FENCE)
                .add(MapleBlocks.GREEN_STAINED_GLASS_FENCE)
                .add(MapleBlocks.RED_STAINED_GLASS_FENCE)
                .add(MapleBlocks.BLACK_STAINED_GLASS_FENCE)
                .add(MapleBlocks.WHITE_CONCRETE_FENCE)
                .add(MapleBlocks.ORANGE_CONCRETE_FENCE)
                .add(MapleBlocks.MAGENTA_CONCRETE_FENCE)
                .add(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE)
                .add(MapleBlocks.YELLOW_CONCRETE_FENCE)
                .add(MapleBlocks.LIME_CONCRETE_FENCE)
                .add(MapleBlocks.PINK_CONCRETE_FENCE)
                .add(MapleBlocks.GRAY_CONCRETE_FENCE)
                .add(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE)
                .add(MapleBlocks.CYAN_CONCRETE_FENCE)
                .add(MapleBlocks.PURPLE_CONCRETE_FENCE)
                .add(MapleBlocks.BLUE_CONCRETE_FENCE)
                .add(MapleBlocks.BROWN_CONCRETE_FENCE)
                .add(MapleBlocks.GREEN_CONCRETE_FENCE)
                .add(MapleBlocks.RED_CONCRETE_FENCE)
                .add(MapleBlocks.BLACK_CONCRETE_FENCE)
                .setReplace(false);

        tag(WALLS)
                .add(MapleBlocks.GLASS_WALL)
                .add(MapleBlocks.WHITE_STAINED_GLASS_WALL)
                .add(MapleBlocks.ORANGE_STAINED_GLASS_WALL)
                .add(MapleBlocks.MAGENTA_STAINED_GLASS_WALL)
                .add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL)
                .add(MapleBlocks.YELLOW_STAINED_GLASS_WALL)
                .add(MapleBlocks.LIME_STAINED_GLASS_WALL)
                .add(MapleBlocks.PINK_STAINED_GLASS_WALL)
                .add(MapleBlocks.GRAY_STAINED_GLASS_WALL)
                .add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL)
                .add(MapleBlocks.CYAN_STAINED_GLASS_WALL)
                .add(MapleBlocks.PURPLE_STAINED_GLASS_WALL)
                .add(MapleBlocks.BLUE_STAINED_GLASS_WALL)
                .add(MapleBlocks.BROWN_STAINED_GLASS_WALL)
                .add(MapleBlocks.GREEN_STAINED_GLASS_WALL)
                .add(MapleBlocks.RED_STAINED_GLASS_WALL)
                .add(MapleBlocks.BLACK_STAINED_GLASS_WALL)
                .add(MapleBlocks.WHITE_CONCRETE_WALL)
                .add(MapleBlocks.ORANGE_CONCRETE_WALL)
                .add(MapleBlocks.MAGENTA_CONCRETE_WALL)
                .add(MapleBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(MapleBlocks.YELLOW_CONCRETE_WALL)
                .add(MapleBlocks.LIME_CONCRETE_WALL)
                .add(MapleBlocks.PINK_CONCRETE_WALL)
                .add(MapleBlocks.GRAY_CONCRETE_WALL)
                .add(MapleBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(MapleBlocks.CYAN_CONCRETE_WALL)
                .add(MapleBlocks.PURPLE_CONCRETE_WALL)
                .add(MapleBlocks.BLUE_CONCRETE_WALL)
                .add(MapleBlocks.BROWN_CONCRETE_WALL)
                .add(MapleBlocks.GREEN_CONCRETE_WALL)
                .add(MapleBlocks.RED_CONCRETE_WALL)
                .add(MapleBlocks.BLACK_CONCRETE_WALL)
                .setReplace(false);
    }
}
