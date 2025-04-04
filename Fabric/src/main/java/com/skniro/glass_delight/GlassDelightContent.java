package com.skniro.glass_delight;


import com.skniro.glass_delight.block.*;
import com.skniro.glass_delight.entity.MapleEntityType;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class GlassDelightContent {


    public static void registerItem(){
    }
    public static void registerBlock(){
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(GlassDelight.Maple_Group).register(content -> {
            content.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.LIME_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.LIME_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.LIME_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.PINK_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.PINK_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.PINK_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.RED_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.RED_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.RED_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.RED_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.RED_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_BUTTON);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_FENCE);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE);
            content.add(MapleBlocks.GLASS_SLAB);
            content.add(MapleBlocks.GLASS_STAIRS);

            content.add(MapleBlocks.WHITE_CONCRETE_SLAB);
            content.add(MapleBlocks.WHITE_CONCRETE_STAIRS);
            content.add(MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.WHITE_CONCRETE_BUTTON);
            content.add(MapleBlocks.WHITE_CONCRETE_FENCE);
            content.add(MapleBlocks.WHITE_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.ORANGE_CONCRETE_SLAB);
            content.add(MapleBlocks.ORANGE_CONCRETE_STAIRS);
            content.add(MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.ORANGE_CONCRETE_BUTTON);
            content.add(MapleBlocks.ORANGE_CONCRETE_FENCE);
            content.add(MapleBlocks.ORANGE_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.MAGENTA_CONCRETE_SLAB);
            content.add(MapleBlocks.MAGENTA_CONCRETE_STAIRS);
            content.add(MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.MAGENTA_CONCRETE_BUTTON);
            content.add(MapleBlocks.MAGENTA_CONCRETE_FENCE);
            content.add(MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            content.add(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            content.add(MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
            content.add(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE);
            content.add(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.YELLOW_CONCRETE_SLAB);
            content.add(MapleBlocks.YELLOW_CONCRETE_STAIRS);
            content.add(MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.YELLOW_CONCRETE_BUTTON);
            content.add(MapleBlocks.YELLOW_CONCRETE_FENCE);
            content.add(MapleBlocks.YELLOW_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.LIME_CONCRETE_SLAB);
            content.add(MapleBlocks.LIME_CONCRETE_STAIRS);
            content.add(MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.LIME_CONCRETE_BUTTON);
            content.add(MapleBlocks.LIME_CONCRETE_FENCE);
            content.add(MapleBlocks.LIME_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.PINK_CONCRETE_SLAB);
            content.add(MapleBlocks.PINK_CONCRETE_STAIRS);
            content.add(MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.PINK_CONCRETE_BUTTON);
            content.add(MapleBlocks.PINK_CONCRETE_FENCE);
            content.add(MapleBlocks.PINK_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.GRAY_CONCRETE_SLAB);
            content.add(MapleBlocks.GRAY_CONCRETE_STAIRS);
            content.add(MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.GRAY_CONCRETE_BUTTON);
            content.add(MapleBlocks.GRAY_CONCRETE_FENCE);
            content.add(MapleBlocks.GRAY_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            content.add(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            content.add(MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
            content.add(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE);
            content.add(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.CYAN_CONCRETE_SLAB);
            content.add(MapleBlocks.CYAN_CONCRETE_STAIRS);
            content.add(MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.CYAN_CONCRETE_BUTTON);
            content.add(MapleBlocks.CYAN_CONCRETE_FENCE);
            content.add(MapleBlocks.CYAN_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.PURPLE_CONCRETE_SLAB);
            content.add(MapleBlocks.PURPLE_CONCRETE_STAIRS);
            content.add(MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.PURPLE_CONCRETE_BUTTON);
            content.add(MapleBlocks.PURPLE_CONCRETE_FENCE);
            content.add(MapleBlocks.PURPLE_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.BLUE_CONCRETE_SLAB);
            content.add(MapleBlocks.BLUE_CONCRETE_STAIRS);
            content.add(MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.BLUE_CONCRETE_BUTTON);
            content.add(MapleBlocks.BLUE_CONCRETE_FENCE);
            content.add(MapleBlocks.BLUE_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.BROWN_CONCRETE_SLAB);
            content.add(MapleBlocks.BROWN_CONCRETE_STAIRS);
            content.add(MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.BROWN_CONCRETE_BUTTON);
            content.add(MapleBlocks.BROWN_CONCRETE_FENCE);
            content.add(MapleBlocks.BROWN_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.GREEN_CONCRETE_SLAB);
            content.add(MapleBlocks.GREEN_CONCRETE_STAIRS);
            content.add(MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.GREEN_CONCRETE_BUTTON);
            content.add(MapleBlocks.GREEN_CONCRETE_FENCE);
            content.add(MapleBlocks.GREEN_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.RED_CONCRETE_SLAB);
            content.add(MapleBlocks.RED_CONCRETE_STAIRS);
            content.add(MapleBlocks.RED_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.RED_CONCRETE_BUTTON);
            content.add(MapleBlocks.RED_CONCRETE_FENCE);
            content.add(MapleBlocks.RED_CONCRETE_FENCE_GATE);
            content.add(MapleBlocks.BLACK_CONCRETE_SLAB);
            content.add(MapleBlocks.BLACK_CONCRETE_STAIRS);
            content.add(MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
            content.add(MapleBlocks.BLACK_CONCRETE_BUTTON);
            content.add(MapleBlocks.BLACK_CONCRETE_FENCE);
            content.add(MapleBlocks.BLACK_CONCRETE_FENCE_GATE);



        });
    }

    public static void registerBlockEntityType() {
        MapleEntityType.registerMapleEntityType();
    }
}

