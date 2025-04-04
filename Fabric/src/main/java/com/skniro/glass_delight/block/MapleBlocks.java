package com.skniro.glass_delight.block;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.entity.MapleWoodTypes;
import com.skniro.glass_delight.block.init.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MapleBlocks {
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)), GlassDelight.Maple_Group);
    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS)), GlassDelight.Maple_Group);
    public static final Block GLASS_STAIRS = registerBlock("glass_stairs",
            new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLASS)), GlassDelight.Maple_Group);

    //Concrete
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)), GlassDelight.Maple_Group);


    //Fence and Fence Gate
    public static final Block GLASS_FENCE = registerBlock("glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block GLASS_FENCE_GATE = registerBlock("glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block WHITE_STAINED_GLASS_FENCE = registerBlock("white_stained_glass_fence",
                new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.WHITE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block WHITE_STAINED_GLASS_FENCE_GATE = registerBlock("white_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.WHITE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block ORANGE_STAINED_GLASS_FENCE = registerBlock("orange_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.ORANGE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_FENCE_GATE = registerBlock("orange_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.ORANGE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block MAGENTA_STAINED_GLASS_FENCE = registerBlock("magenta_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.MAGENTA_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_FENCE_GATE = registerBlock("magenta_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.MAGENTA_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock("light_blue_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("light_blue_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block YELLOW_STAINED_GLASS_FENCE = registerBlock("yellow_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.YELLOW_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_FENCE_GATE = registerBlock("yellow_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.YELLOW_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block LIME_STAINED_GLASS_FENCE = registerBlock("lime_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.LIME_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block LIME_STAINED_GLASS_FENCE_GATE = registerBlock("lime_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.LIME_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block PINK_STAINED_GLASS_FENCE = registerBlock("pink_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.PINK_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block PINK_STAINED_GLASS_FENCE_GATE = registerBlock("pink_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.PINK_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block GRAY_STAINED_GLASS_FENCE = registerBlock("gray_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.GRAY_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("gray_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.GRAY_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock("light_gray_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("light_gray_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block CYAN_STAINED_GLASS_FENCE = registerBlock("cyan_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.CYAN_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_FENCE_GATE = registerBlock("cyan_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.CYAN_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block PURPLE_STAINED_GLASS_FENCE = registerBlock("purple_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.PURPLE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_FENCE_GATE = registerBlock("purple_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.PURPLE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block BLUE_STAINED_GLASS_FENCE = registerBlock("blue_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.BLUE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("blue_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.BLUE_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block BROWN_STAINED_GLASS_FENCE = registerBlock("brown_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.BROWN_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_FENCE_GATE = registerBlock("brown_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.BROWN_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block GREEN_STAINED_GLASS_FENCE = registerBlock("green_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.GREEN_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_FENCE_GATE = registerBlock("green_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.GREEN_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block RED_STAINED_GLASS_FENCE = registerBlock("red_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.RED_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block RED_STAINED_GLASS_FENCE_GATE = registerBlock("red_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.RED_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block BLACK_STAINED_GLASS_FENCE = registerBlock("black_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(Blocks.BLACK_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_FENCE_GATE = registerBlock("black_stained_glass_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GLASS, AbstractBlock.Settings.create().mapColor(Blocks.BLACK_STAINED_GLASS.getDefaultMapColor()).strength(0.3F).nonOpaque().sounds(BlockSoundGroup.GLASS)), GlassDelight.Maple_Group);

    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.WHITE_CONCRETE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.ORANGE_CONCRETE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.MAGENTA_CONCRETE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.LIGHT_BLUE_CONCRETE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.YELLOW_CONCRETE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.LIME_CONCRETE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.PINK_CONCRETE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GRAY_CONCRETE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.LIGHT_GRAY_CONCRETE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.CYAN_CONCRETE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.PURPLE_CONCRETE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.BLUE_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.BROWN_CONCRETE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.GREEN_CONCRETE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.RED_CONCRETE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate",
            new FenceGateBlock(MapleWoodTypes.BLACK_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)), GlassDelight.Maple_Group);


    //Button
    public static final Block WHITE_STAINED_GLASS_BUTTON = registerBlock("white_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.WHITE_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_BUTTON = registerBlock("orange_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.ORANGE_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_BUTTON = registerBlock("magenta_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.MAGENTA_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_BUTTON = registerBlock("light_blue_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.LIGHT_BLUE_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_BUTTON = registerBlock("yellow_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.YELLOW_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block LIME_STAINED_GLASS_BUTTON = registerBlock("lime_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.LIME_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block PINK_STAINED_GLASS_BUTTON = registerBlock("pink_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.PINK_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_BUTTON = registerBlock("gray_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.GRAY_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_BUTTON = registerBlock("light_gray_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.LIGHT_GRAY_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_BUTTON = registerBlock("cyan_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.CYAN_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_BUTTON = registerBlock("purple_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.PURPLE_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_BUTTON = registerBlock("blue_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.BLUE_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_BUTTON = registerBlock("brown_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.BROWN_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_BUTTON = registerBlock("green_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.GREEN_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block RED_STAINED_GLASS_BUTTON = registerBlock("red_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.RED_STAINED_GLASS), GlassDelight.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_BUTTON = registerBlock("black_stained_glass_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.BLACK_STAINED_GLASS), GlassDelight.Maple_Group);

    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.WHITE_CONCRETE), GlassDelight.Maple_Group);
    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.ORANGE_CONCRETE), GlassDelight.Maple_Group);
    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.MAGENTA_CONCRETE), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.LIGHT_BLUE_CONCRETE), GlassDelight.Maple_Group);
    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.YELLOW_CONCRETE), GlassDelight.Maple_Group);
    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.LIME_CONCRETE), GlassDelight.Maple_Group);
    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.PINK_CONCRETE), GlassDelight.Maple_Group);
    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.GRAY_CONCRETE), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.LIGHT_GRAY_CONCRETE), GlassDelight.Maple_Group);
    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.CYAN_CONCRETE), GlassDelight.Maple_Group);
    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.PURPLE_CONCRETE), GlassDelight.Maple_Group);
    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.BLUE_CONCRETE), GlassDelight.Maple_Group);
    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.BROWN_CONCRETE), GlassDelight.Maple_Group);
    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.GREEN_CONCRETE), GlassDelight.Maple_Group);
    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.RED_CONCRETE), GlassDelight.Maple_Group);
    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            Blocks.createWoodenButtonBlock(MapleBlockSetType.BLACK_CONCRETE), GlassDelight.Maple_Group);


    //Pressure Plate
    public static final Block WHITE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("white_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.WHITE_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.WHITE_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("orange_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.ORANGE_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.ORANGE_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_PRESSURE_PLATE = registerBlock("magenta_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.MAGENTA_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.MAGENTA_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_blue_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.LIGHT_BLUE_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_PRESSURE_PLATE = registerBlock("yellow_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.YELLOW_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.YELLOW_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block LIME_STAINED_GLASS_PRESSURE_PLATE = registerBlock("lime_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.LIME_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.LIME_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block PINK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("pink_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.PINK_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.PINK_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("gray_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.GRAY_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.GRAY_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_gray_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.LIGHT_GRAY_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("cyan_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.CYAN_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.CYAN_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("purple_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.PURPLE_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.PURPLE_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("blue_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.BLUE_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.BLUE_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("brown_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.BROWN_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.BROWN_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("green_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.GREEN_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.GREEN_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block RED_STAINED_GLASS_PRESSURE_PLATE = registerBlock("red_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.RED_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.RED_STAINED_GLASS.getDefaultMapColor())
                    .noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("black_stained_glass_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.BLACK_STAINED_GLASS, AbstractBlock.Settings.create().mapColor(Blocks.BLACK_STAINED_GLASS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY)), GlassDelight.Maple_Group);

    public static final Block WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("whiteconcrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.ORANGE_CONCRETE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.ORANGE_CONCRETE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.MAGENTA_CONCRETE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.LIGHT_BLUE_CONCRETE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.YELLOW_CONCRETE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), GlassDelight.Maple_Group);

    public static final Block LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.LIME_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.PINK_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.GRAY_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.LIGHT_GRAY_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.CYAN_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.PURPLE_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.BLUE_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.BROWN_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.GREEN_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.RED_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    public static final Block BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate",
            new PressurePlateBlock(MapleBlockSetType.BLACK_CONCRETE, AbstractBlock.Settings.copy(WHITE_CONCRETE_PRESSURE_PLATE)), GlassDelight.Maple_Group);

    //Wall
    public static final Block WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.WHITE_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.ORANGE_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.MAGENTA_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.LIGHT_BLUE_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.YELLOW_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.LIME_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.PINK_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.GRAY_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.LIGHT_GRAY_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.CYAN_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.PURPLE_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.BLUE_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.BROWN_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.GREEN_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.RED_STAINED_GLASS).solid()), GlassDelight.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copyShallow(Blocks.BLACK_STAINED_GLASS).solid()), GlassDelight.Maple_Group);

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)), GlassDelight.Maple_Group);
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)), GlassDelight.Maple_Group);


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(GlassDelight.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, Identifier.of(GlassDelight.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, Identifier.of(GlassDelight.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static PillarBlock createBambooBlock(MapColor topMapColor, MapColor sideMapColor, BlockSoundGroup soundGroup) {
        return new PillarBlock(AbstractBlock.Settings.create().mapColor(sideMapColor).strength(2.0f).sounds(soundGroup));
    }

    public static void registerMapleBlocks() {
        GlassDelight.LOGGER.debug("Registering ModBlocks for " + GlassDelight.MOD_ID);
    }

}
