package com.skniro.glass_delight.block;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.entity.MapleWoodTypes;
import com.skniro.glass_delight.block.init.*;
import com.skniro.glass_delight.item.MapleCreativeModeTabs;
import com.skniro.glass_delight.item.MapleItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class MapleBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlassDelight.MODID);

    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GLASS_SLAB = registerBlock("glass_slab",
            ()-> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GLASS_STAIRS = registerBlock("glass_stairs",
            ()-> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)), MapleCreativeModeTabs.Maple_Group);

    //Concrete
    public static final RegistryObject<Block>  WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            ()-> new StairBlock(WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(WHITE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            ()-> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            ()-> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            ()-> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            ()-> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            ()-> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            ()-> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            ()-> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            ()-> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            ()-> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            ()-> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            ()-> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            ()-> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            ()-> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            ()-> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            ()-> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);


    //Fence and Fence Gate
    public static final RegistryObject<Block>  GLASS_FENCE = registerBlock("glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GLASS_FENCE_GATE = registerBlock("glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_FENCE = registerBlock("white_stained_glass_fence",
                ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.WHITE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_FENCE_GATE = registerBlock("white_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.WHITE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_FENCE = registerBlock("orange_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.ORANGE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_FENCE_GATE = registerBlock("orange_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.ORANGE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_FENCE = registerBlock("magenta_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.MAGENTA_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_FENCE_GATE = registerBlock("magenta_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.MAGENTA_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock("light_blue_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("light_blue_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_FENCE = registerBlock("yellow_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.YELLOW_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_FENCE_GATE = registerBlock("yellow_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.YELLOW_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIME_STAINED_GLASS_FENCE = registerBlock("lime_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.LIME_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_STAINED_GLASS_FENCE_GATE = registerBlock("lime_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.LIME_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PINK_STAINED_GLASS_FENCE = registerBlock("pink_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.PINK_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_STAINED_GLASS_FENCE_GATE = registerBlock("pink_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.PINK_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_FENCE = registerBlock("gray_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.GRAY_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("gray_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.GRAY_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock("light_gray_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("light_gray_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_FENCE = registerBlock("cyan_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.CYAN_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_FENCE_GATE = registerBlock("cyan_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.CYAN_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_FENCE = registerBlock("purple_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.PURPLE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_FENCE_GATE = registerBlock("purple_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.PURPLE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_FENCE = registerBlock("blue_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.BLUE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("blue_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.BLUE_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_FENCE = registerBlock("brown_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.BROWN_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_FENCE_GATE = registerBlock("brown_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.BROWN_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_FENCE = registerBlock("green_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.GREEN_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_FENCE_GATE = registerBlock("green_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.GREEN_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  RED_STAINED_GLASS_FENCE = registerBlock("red_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.RED_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_STAINED_GLASS_FENCE_GATE = registerBlock("red_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.RED_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_FENCE = registerBlock("black_stained_glass_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(Blocks.BLACK_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_FENCE_GATE = registerBlock("black_stained_glass_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.BLACK_STAINED_GLASS.defaultMapColor()).strength(0.3F).noOcclusion().sound(SoundType.GLASS)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.WHITE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(WHITE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.ORANGE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.MAGENTA_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.LIGHT_BLUE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.YELLOW_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.LIME_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.PINK_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GRAY_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.LIGHT_GRAY_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.CYAN_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.PURPLE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.BLUE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.BROWN_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.GREEN_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.RED_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate",
            ()-> new FenceGateBlock(MapleWoodTypes.BLACK_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);


    //Button
    public static final RegistryObject<Block>  GLASS_BUTTON = registerBlock("glass_button",
            ()-> woodenButton(MapleBlockSetType.GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_BUTTON = registerBlock("white_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.WHITE_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_BUTTON = registerBlock("orange_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.ORANGE_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_BUTTON = registerBlock("magenta_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.MAGENTA_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_BUTTON = registerBlock("light_blue_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.LIGHT_BLUE_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_BUTTON = registerBlock("yellow_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.YELLOW_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_STAINED_GLASS_BUTTON = registerBlock("lime_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.LIME_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_STAINED_GLASS_BUTTON = registerBlock("pink_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.PINK_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_BUTTON = registerBlock("gray_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.GRAY_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_BUTTON = registerBlock("light_gray_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.LIGHT_GRAY_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_BUTTON = registerBlock("cyan_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.CYAN_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_BUTTON = registerBlock("purple_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.PURPLE_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_BUTTON = registerBlock("blue_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.BLUE_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_BUTTON = registerBlock("brown_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.BROWN_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_BUTTON = registerBlock("green_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.GREEN_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_STAINED_GLASS_BUTTON = registerBlock("red_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.RED_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_BUTTON = registerBlock("black_stained_glass_button",
            ()-> woodenButton(MapleBlockSetType.BLACK_STAINED_GLASS), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            ()-> woodenButton(MapleBlockSetType.WHITE_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            ()-> woodenButton(MapleBlockSetType.ORANGE_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            ()-> woodenButton(MapleBlockSetType.MAGENTA_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            ()-> woodenButton(MapleBlockSetType.LIGHT_BLUE_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            ()-> woodenButton(MapleBlockSetType.YELLOW_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            ()-> woodenButton(MapleBlockSetType.LIME_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            ()-> woodenButton(MapleBlockSetType.PINK_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            ()-> woodenButton(MapleBlockSetType.GRAY_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            ()-> woodenButton(MapleBlockSetType.LIGHT_GRAY_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            ()-> woodenButton(MapleBlockSetType.CYAN_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            ()-> woodenButton(MapleBlockSetType.PURPLE_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            ()-> woodenButton(MapleBlockSetType.BLUE_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            ()-> woodenButton(MapleBlockSetType.BROWN_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            ()-> woodenButton(MapleBlockSetType.GREEN_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            ()-> woodenButton(MapleBlockSetType.RED_CONCRETE), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            ()-> woodenButton(MapleBlockSetType.BLACK_CONCRETE), MapleCreativeModeTabs.Maple_Group);


    //Pressure Plate
    public static final RegistryObject<Block>  GLASS_PRESSURE_PLATE = registerBlock("glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.WHITE_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("white_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.WHITE_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.WHITE_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("orange_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.ORANGE_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.ORANGE_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_PRESSURE_PLATE = registerBlock("magenta_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.MAGENTA_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.MAGENTA_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_blue_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.LIGHT_BLUE_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_PRESSURE_PLATE = registerBlock("yellow_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.YELLOW_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.YELLOW_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_STAINED_GLASS_PRESSURE_PLATE = registerBlock("lime_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.LIME_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.LIME_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("pink_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.PINK_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.PINK_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("gray_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.GRAY_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.GRAY_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_gray_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.LIGHT_GRAY_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("cyan_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.CYAN_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.CYAN_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("purple_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.PURPLE_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.PURPLE_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("blue_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.BLUE_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.BLUE_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("brown_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.BROWN_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.BROWN_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("green_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.GREEN_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.GREEN_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_STAINED_GLASS_PRESSURE_PLATE = registerBlock("red_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.RED_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.RED_STAINED_GLASS.defaultMapColor())
                    .noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("black_stained_glass_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.BLACK_STAINED_GLASS, BlockBehaviour.Properties.of().mapColor(Blocks.BLACK_STAINED_GLASS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("whiteconcrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.ORANGE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(WHITE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.ORANGE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.MAGENTA_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.LIGHT_BLUE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.YELLOW_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.LIME_CONCRETE, BlockBehaviour.Properties.ofFullCopy(LIME_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.PINK_CONCRETE, BlockBehaviour.Properties.ofFullCopy(PINK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.GRAY_CONCRETE, BlockBehaviour.Properties.ofFullCopy(GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.LIGHT_GRAY_CONCRETE, BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.CYAN_CONCRETE, BlockBehaviour.Properties.ofFullCopy(CYAN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.PURPLE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(PURPLE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.BLUE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.BROWN_CONCRETE, BlockBehaviour.Properties.ofFullCopy(BROWN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.GREEN_CONCRETE, BlockBehaviour.Properties.ofFullCopy(GREEN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.RED_CONCRETE, BlockBehaviour.Properties.ofFullCopy(RED_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate",
            ()-> new PressurePlateBlock(MapleBlockSetType.BLACK_CONCRETE, BlockBehaviour.Properties.ofFullCopy(BLACK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);

    //Wall
    public static final RegistryObject<Block>  GLASS_WALL = registerBlock("glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.MAGENTA_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_BLUE_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.YELLOW_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIME_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.PINK_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GRAY_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_GRAY_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CYAN_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.PURPLE_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLUE_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BROWN_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GREEN_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.RED_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLACK_STAINED_GLASS).forceSolidOn()), MapleCreativeModeTabs.Maple_Group);

    public static final RegistryObject<Block>  WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(WHITE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)), MapleCreativeModeTabs.Maple_Group);
    public static final RegistryObject<Block>  BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)), MapleCreativeModeTabs.Maple_Group);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,  RegistryObject<CreativeModeTab> tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            RegistryObject<CreativeModeTab> tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),  new Item.Properties()));
    }

    private static Block woodenButton(BlockSetType p_278239_) {
        return new ButtonBlock(p_278239_, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }


    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
