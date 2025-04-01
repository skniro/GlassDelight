package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.block.MapleSignBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.skniro.glass_delight.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.registry.tag.BlockTags.*;


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
/*        getOrCreateTagBuilder(SAPLINGS)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        getOrCreateTagBuilder(C_SAPLING)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        getOrCreateTagBuilder(C_MAPLE_LOGS)
                .add(MapleBlocks.MAPLE_LOG);
        getOrCreateTagBuilder(C_CHERRY_LOGS)
                .add(MapleBlocks.CHERRY_LOG);
        getOrCreateTagBuilder(FENCES)
                .add(MapleBlocks.MAPLE_FENCE)
                .add(MapleBlocks.CHERRY_FENCE)
                .add(MapleBlocks.BAMBOO_FENCE);
        getOrCreateTagBuilder(CEILING_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_HANGING_SIGN);
        getOrCreateTagBuilder(WALL_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_WALL_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_WALL_HANGING_SIGN);*/
    }
}
