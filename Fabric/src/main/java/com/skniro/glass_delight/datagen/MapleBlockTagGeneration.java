package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.block.MapleSignBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.skniro.glass_delight.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.registry.tag.BlockTags.*;
import static net.minecraft.registry.tag.ItemTags.FENCES;


public class MapleBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public MapleBlockTagGeneration(FabricDataOutput dataGenerator,CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "plaster"));

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.FENCES)
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

        getOrCreateTagBuilder(WALLS)
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
