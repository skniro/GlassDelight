package com.skniro.glass_delight.block;

import com.skniro.glass_delight.Maple;
import com.skniro.glass_delight.block.init.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MapleFurnitureBlocks {

    // OAK Cushion Blocks
    public static final Block CUSHION_OAK_WHITE = registerBlock("oak_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_ORANGE = registerBlock("oak_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_MAGENTA = registerBlock("oak_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_LIGHT_BLUE = registerBlock("oak_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_YELLOW = registerBlock("oak_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_LIME = registerBlock("oak_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_PINK = registerBlock("oak_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_GRAY = registerBlock("oak_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_LIGHT_GRAY = registerBlock("oak_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_CYAN = registerBlock("oak_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_PURPLE = registerBlock("oak_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_BLUE = registerBlock("oak_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_BROWN = registerBlock("oak_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_GREEN = registerBlock("oak_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_RED = registerBlock("oak_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_OAK_BLACK = registerBlock("oak_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), Maple.Maple_Group);


    // SPRUCE Cushion Blocks
    public static final Block CUSHION_SPRUCE_WHITE = registerBlock("spruce_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_ORANGE = registerBlock("spruce_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_MAGENTA = registerBlock("spruce_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_LIGHT_BLUE = registerBlock("spruce_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_YELLOW = registerBlock("spruce_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_LIME = registerBlock("spruce_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_PINK = registerBlock("spruce_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_GRAY = registerBlock("spruce_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_LIGHT_GRAY = registerBlock("spruce_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_CYAN = registerBlock("spruce_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_PURPLE = registerBlock("spruce_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_BLUE = registerBlock("spruce_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_BROWN = registerBlock("spruce_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_GREEN = registerBlock("spruce_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_RED = registerBlock("spruce_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_SPRUCE_BLACK = registerBlock("spruce_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), Maple.Maple_Group);

    // BIRCH Cushion Blocks
    public static final Block CUSHION_BIRCH_WHITE = registerBlock("birch_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_ORANGE = registerBlock("birch_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_MAGENTA = registerBlock("birch_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_LIGHT_BLUE = registerBlock("birch_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_YELLOW = registerBlock("birch_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_LIME = registerBlock("birch_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_PINK = registerBlock("birch_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_GRAY = registerBlock("birch_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_LIGHT_GRAY = registerBlock("birch_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_CYAN = registerBlock("birch_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_PURPLE = registerBlock("birch_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_BLUE = registerBlock("birch_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_BROWN = registerBlock("birch_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_GREEN = registerBlock("birch_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_RED = registerBlock("birch_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BIRCH_BLACK = registerBlock("birch_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), Maple.Maple_Group);

    // JUNGLE Cushion Blocks
    public static final Block CUSHION_JUNGLE_WHITE = registerBlock("jungle_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_ORANGE = registerBlock("jungle_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_MAGENTA = registerBlock("jungle_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_LIGHT_BLUE = registerBlock("jungle_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_YELLOW = registerBlock("jungle_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_LIME = registerBlock("jungle_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_PINK = registerBlock("jungle_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_GRAY = registerBlock("jungle_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_LIGHT_GRAY = registerBlock("jungle_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_CYAN = registerBlock("jungle_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_PURPLE = registerBlock("jungle_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_BLUE = registerBlock("jungle_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_BROWN = registerBlock("jungle_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_GREEN = registerBlock("jungle_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_RED = registerBlock("jungle_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_JUNGLE_BLACK = registerBlock("jungle_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), Maple.Maple_Group);

    // ACACIA Cushion Blocks
    public static final Block CUSHION_ACACIA_WHITE = registerBlock("acacia_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_ORANGE = registerBlock("acacia_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_MAGENTA = registerBlock("acacia_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_LIGHT_BLUE = registerBlock("acacia_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_YELLOW = registerBlock("acacia_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_LIME = registerBlock("acacia_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_PINK = registerBlock("acacia_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_GRAY = registerBlock("acacia_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_LIGHT_GRAY = registerBlock("acacia_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_CYAN = registerBlock("acacia_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_PURPLE = registerBlock("acacia_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_BLUE = registerBlock("acacia_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_BROWN = registerBlock("acacia_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_GREEN = registerBlock("acacia_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_RED = registerBlock("acacia_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_ACACIA_BLACK = registerBlock("acacia_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), Maple.Maple_Group);

    // DARK OAK Cushion Blocks
    public static final Block CUSHION_DARK_OAK_WHITE = registerBlock("dark_oak_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_ORANGE = registerBlock("dark_oak_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_MAGENTA = registerBlock("dark_oak_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_LIGHT_BLUE = registerBlock("dark_oak_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_YELLOW = registerBlock("dark_oak_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_LIME = registerBlock("dark_oak_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_PINK = registerBlock("dark_oak_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_GRAY = registerBlock("dark_oak_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_LIGHT_GRAY = registerBlock("dark_oak_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_CYAN = registerBlock("dark_oak_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_PURPLE = registerBlock("dark_oak_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_BLUE = registerBlock("dark_oak_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_BROWN = registerBlock("dark_oak_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_GREEN = registerBlock("dark_oak_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_RED = registerBlock("dark_oak_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_DARK_OAK_BLACK = registerBlock("dark_oak_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), Maple.Maple_Group);


    // CRIMSON Cushion Blocks
    public static final Block CUSHION_CRIMSON_WHITE = registerBlock("crimson_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_ORANGE = registerBlock("crimson_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_MAGENTA = registerBlock("crimson_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_LIGHT_BLUE = registerBlock("crimson_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_YELLOW = registerBlock("crimson_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_LIME = registerBlock("crimson_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_PINK = registerBlock("crimson_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_GRAY = registerBlock("crimson_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_LIGHT_GRAY = registerBlock("crimson_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_CYAN = registerBlock("crimson_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_PURPLE = registerBlock("crimson_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_BLUE = registerBlock("crimson_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_BROWN = registerBlock("crimson_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_GREEN = registerBlock("crimson_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_RED = registerBlock("crimson_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CRIMSON_BLACK = registerBlock("crimson_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), Maple.Maple_Group);

    // WARPED Cushion Blocks
    public static final Block CUSHION_WARPED_WHITE = registerBlock("warped_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_ORANGE = registerBlock("warped_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_MAGENTA = registerBlock("warped_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_LIGHT_BLUE = registerBlock("warped_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_YELLOW = registerBlock("warped_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_LIME = registerBlock("warped_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_PINK = registerBlock("warped_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_GRAY = registerBlock("warped_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_LIGHT_GRAY = registerBlock("warped_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_CYAN = registerBlock("warped_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_PURPLE = registerBlock("warped_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_BLUE = registerBlock("warped_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_BROWN = registerBlock("warped_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_GREEN = registerBlock("warped_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_RED = registerBlock("warped_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_WARPED_BLACK = registerBlock("warped_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), Maple.Maple_Group);

    // MANGROVE Cushion Blocks
    public static final Block CUSHION_MANGROVE_WHITE = registerBlock("mangrove_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_ORANGE = registerBlock("mangrove_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_MAGENTA = registerBlock("mangrove_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_LIGHT_BLUE = registerBlock("mangrove_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_YELLOW = registerBlock("mangrove_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_LIME = registerBlock("mangrove_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_PINK = registerBlock("mangrove_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_GRAY = registerBlock("mangrove_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_LIGHT_GRAY = registerBlock("mangrove_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_CYAN = registerBlock("mangrove_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_PURPLE = registerBlock("mangrove_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_BLUE = registerBlock("mangrove_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_BROWN = registerBlock("mangrove_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_GREEN = registerBlock("mangrove_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_RED = registerBlock("mangrove_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MANGROVE_BLACK = registerBlock("mangrove_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), Maple.Maple_Group);

    // Maple Cushion Blocks
    public static final Block CUSHION_MAPLE_WHITE = registerBlock("maple_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_ORANGE = registerBlock("maple_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_MAGENTA = registerBlock("maple_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_LIGHT_BLUE = registerBlock("maple_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_YELLOW = registerBlock("maple_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_LIME = registerBlock("maple_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_PINK = registerBlock("maple_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_GRAY = registerBlock("maple_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_LIGHT_GRAY = registerBlock("maple_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_CYAN = registerBlock("maple_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_PURPLE = registerBlock("maple_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_BLUE = registerBlock("maple_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_BROWN = registerBlock("maple_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_GREEN = registerBlock("maple_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_RED = registerBlock("maple_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_MAPLE_BLACK = registerBlock("maple_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.MAPLE_PLANKS)), Maple.Maple_Group);

    // CHERRY Cushion Blocks
    public static final Block CUSHION_CHERRY_WHITE = registerBlock("cherry_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_ORANGE = registerBlock("cherry_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_MAGENTA = registerBlock("cherry_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_LIGHT_BLUE = registerBlock("cherry_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_YELLOW = registerBlock("cherry_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_LIME = registerBlock("cherry_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_PINK = registerBlock("cherry_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_GRAY = registerBlock("cherry_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_LIGHT_GRAY = registerBlock("cherry_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_CYAN = registerBlock("cherry_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_PURPLE = registerBlock("cherry_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_BLUE = registerBlock("cherry_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_BROWN = registerBlock("cherry_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_GREEN = registerBlock("cherry_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_RED = registerBlock("cherry_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_CHERRY_BLACK = registerBlock("cherry_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), Maple.Maple_Group);

    // GINKGO Cushion Blocks
    public static final Block CUSHION_GINKGO_WHITE = registerBlock("ginkgo_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_ORANGE = registerBlock("ginkgo_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_MAGENTA = registerBlock("ginkgo_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_LIGHT_BLUE = registerBlock("ginkgo_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_YELLOW = registerBlock("ginkgo_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_LIME = registerBlock("ginkgo_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_PINK = registerBlock("ginkgo_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_GRAY = registerBlock("ginkgo_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_LIGHT_GRAY = registerBlock("ginkgo_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_CYAN = registerBlock("ginkgo_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_PURPLE = registerBlock("ginkgo_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_BLUE = registerBlock("ginkgo_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_BROWN = registerBlock("ginkgo_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_GREEN = registerBlock("ginkgo_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_RED = registerBlock("ginkgo_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_GINKGO_BLACK = registerBlock("ginkgo_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(MapleBlocks.GINKGO_PLANKS)), Maple.Maple_Group);

    // BAMBOO Cushion Blocks
    public static final Block CUSHION_BAMBOO_WHITE = registerBlock("bamboo_white_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_ORANGE = registerBlock("bamboo_orange_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_MAGENTA = registerBlock("bamboo_magenta_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_LIGHT_BLUE = registerBlock("bamboo_light_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_YELLOW = registerBlock("bamboo_yellow_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_LIME = registerBlock("bamboo_lime_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_PINK = registerBlock("bamboo_pink_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_GRAY = registerBlock("bamboo_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_LIGHT_GRAY = registerBlock("bamboo_light_gray_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_CYAN = registerBlock("bamboo_cyan_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_PURPLE = registerBlock("bamboo_purple_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_BLUE = registerBlock("bamboo_blue_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_BROWN = registerBlock("bamboo_brown_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_GREEN = registerBlock("bamboo_green_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_RED = registerBlock("bamboo_red_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block CUSHION_BAMBOO_BLACK = registerBlock("bamboo_black_cushion", new CushionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), Maple.Maple_Group);


    // Table Blocks
    public static final Block TABLE_OAK = registerBlock("oak_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_SPRUCE = registerBlock("spruce_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_BIRCH = registerBlock("birch_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_JUNGLE = registerBlock("jungle_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_ACACIA = registerBlock("acacia_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_DARK_OAK = registerBlock("dark_oak_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_CRIMSON = registerBlock("crimson_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_WARPED = registerBlock("warped_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_MANGROVE = registerBlock("mangrove_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_BAMBOO = registerBlock("bamboo_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_CHERRY = registerBlock("cherry_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_MAPLE = registerBlock("maple_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block TABLE_GINKGO = registerBlock("ginkgo_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);

    //Window
    public static final Block Window_Wood_GINKGO = registerBlock("ginkgo_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion(), MapleBlockSetType.GINKGO), Maple.Maple_Group);
    public static final Block Window_Wood_MAPLE = registerBlock("maple_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion(), MapleBlockSetType.MAPLE), Maple.Maple_Group);
    public static final Block Window_WOOD_OAK = registerBlock("oak_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion(), BlockSetType.OAK), Maple.Maple_Group);
    public static final Block Window_WOOD_BIRCH = registerBlock("birch_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion(), BlockSetType.BIRCH), Maple.Maple_Group);
    public static final Block Window_WOOD_SPRUCE = registerBlock("spruce_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion(), BlockSetType.SPRUCE), Maple.Maple_Group);
    public static final Block Window_WOOD_JUNGLE = registerBlock("jungle_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion(), BlockSetType.JUNGLE), Maple.Maple_Group);
    public static final Block Window_WOOD_DARK_OAK = registerBlock("dark_oak_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion(), BlockSetType.DARK_OAK), Maple.Maple_Group);
    public static final Block Window_WOOD_ACACIA = registerBlock("acacia_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion(), BlockSetType.ACACIA), Maple.Maple_Group);
    public static final Block Window_WOOD_MANGROVE = registerBlock("mangrove_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion(), BlockSetType.MANGROVE), Maple.Maple_Group);
    public static final Block Window_WOOD_CHERRY = registerBlock("cherry_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY), Maple.Maple_Group);
    public static final Block Window_WOOD_CRIMSON = registerBlock("crimson_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion(), BlockSetType.CRIMSON), Maple.Maple_Group);
    public static final Block Window_WOOD_WARPED = registerBlock("warped_wood_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion(), BlockSetType.WARPED), Maple.Maple_Group);
    public static final Block Window_PLANK_OAK = registerBlock("oak_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion(), BlockSetType.OAK), Maple.Maple_Group);
    public static final Block Window_PLANK_BIRCH = registerBlock("birch_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion(), BlockSetType.BIRCH), Maple.Maple_Group);
    public static final Block Window_PLANK_SPRUCE = registerBlock("spruce_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion(), BlockSetType.SPRUCE), Maple.Maple_Group);
    public static final Block Window_PLANK_JUNGLE = registerBlock("jungle_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion(), BlockSetType.JUNGLE), Maple.Maple_Group);
    public static final Block Window_PLANK_DARK_OAK = registerBlock("dark_oak_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion(), BlockSetType.DARK_OAK), Maple.Maple_Group);
    public static final Block Window_PLANK_ACACIA = registerBlock("acacia_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion(), BlockSetType.ACACIA), Maple.Maple_Group);
    public static final Block Window_PLANK_MANGROVE = registerBlock("mangrove_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion(), BlockSetType.MANGROVE), Maple.Maple_Group);
    public static final Block Window_PLANK_CHERRY = registerBlock("cherry_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY), Maple.Maple_Group);
    public static final Block Window_PLANK_CRIMSON = registerBlock("crimson_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion(), BlockSetType.CRIMSON), Maple.Maple_Group);
    public static final Block Window_PLANK_WARPED = registerBlock("warped_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion(), BlockSetType.WARPED), Maple.Maple_Group);
    public static final Block Window_PLANK_GINKGO = registerBlock("ginkgo_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion(), MapleBlockSetType.GINKGO), Maple.Maple_Group);
    public static final Block Window_PLANK_MAPLE = registerBlock("maple_plank_window", new WindowBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion(), MapleBlockSetType.MAPLE), Maple.Maple_Group);

    // Coffee Table Blocks
    public static final Block Coffee_Table_Wood_GINKGO = registerBlock("ginkgo_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_Wood_MAPLE = registerBlock("maple_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_OAK = registerBlock("oak_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_BIRCH = registerBlock("birch_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_SPRUCE = registerBlock("spruce_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_JUNGLE = registerBlock("jungle_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_DARK_OAK = registerBlock("dark_oak_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_ACACIA = registerBlock("acacia_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_MANGROVE = registerBlock("mangrove_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_BAMBOO = registerBlock("bamboo_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_CHERRY = registerBlock("cherry_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_CRIMSON = registerBlock("crimson_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_WOOD_WARPED = registerBlock("warped_wood_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_OAK = registerBlock("oak_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_BIRCH = registerBlock("birch_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_SPRUCE = registerBlock("spruce_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_JUNGLE = registerBlock("jungle_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_DARK_OAK = registerBlock("dark_oak_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_ACACIA = registerBlock("acacia_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_MANGROVE = registerBlock("mangrove_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_BAMBOO = registerBlock("bamboo_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_CHERRY = registerBlock("cherry_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_CRIMSON = registerBlock("crimson_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_WARPED = registerBlock("warped_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_GINKGO = registerBlock("ginkgo_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Coffee_Table_PLANK_MAPLE = registerBlock("maple_plank_coffee_table", new TableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);

    //Chair
    public static final Block Chair_Wood_GINKGO = registerBlock("ginkgo_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_Wood_MAPLE = registerBlock("maple_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_OAK = registerBlock("oak_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_BIRCH = registerBlock("birch_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_SPRUCE = registerBlock("spruce_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_JUNGLE = registerBlock("jungle_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_DARK_OAK = registerBlock("dark_oak_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_ACACIA = registerBlock("acacia_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_MANGROVE = registerBlock("mangrove_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_BAMBOO = registerBlock("bamboo_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_CHERRY = registerBlock("cherry_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_CRIMSON = registerBlock("crimson_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_WOOD_WARPED = registerBlock("warped_wood_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_OAK = registerBlock("oak_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_BIRCH = registerBlock("birch_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_SPRUCE = registerBlock("spruce_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_JUNGLE = registerBlock("jungle_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_DARK_OAK = registerBlock("dark_oak_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_ACACIA = registerBlock("acacia_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_MANGROVE = registerBlock("mangrove_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_BAMBOO = registerBlock("bamboo_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_CHERRY = registerBlock("cherry_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_CRIMSON = registerBlock("crimson_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_WARPED = registerBlock("warped_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_GINKGO = registerBlock("ginkgo_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block Chair_PLANK_MAPLE = registerBlock("maple_plank_chair", new ChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);

    //End Table
    public static final Block END_TABLE_OAK = registerBlock("oak_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_SPRUCE = registerBlock("spruce_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_BIRCH = registerBlock("birch_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_JUNGLE = registerBlock("jungle_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_ACACIA = registerBlock("acacia_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_DARK_OAK = registerBlock("dark_oak_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_CRIMSON = registerBlock("crimson_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_WARPED = registerBlock("warped_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_MANGROVE = registerBlock("mangrove_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_BAMBOO = registerBlock("bamboo_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_CHERRY = registerBlock("cherry_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_MAPLE = registerBlock("maple_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);
    public static final Block END_TABLE_GINKGO = registerBlock("ginkgo_end_table", new EndTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()), Maple.Maple_Group);


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name),
                new BlockItem(block, new Item.Properties()));
    }

    public static void registerCushionBlocks() {
        Maple.LOGGER.debug("Registering Cushion Blocks for " + Maple.MOD_ID);
    }
}
