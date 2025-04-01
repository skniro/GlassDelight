package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.block.MapleSignBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class MapleLootTableGenerator extends FabricBlockLootTableProvider {
    public MapleLootTableGenerator(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, registryLookup);
    }
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void generate() {
        //Glass Block
        addDropWithSilkTouch(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.RED_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.RED_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.GLASS_STAIRS);
    }
}
