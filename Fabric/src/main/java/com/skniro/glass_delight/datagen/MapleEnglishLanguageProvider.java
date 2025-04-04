package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {



        //ITEM GROUP
        translationBuilder.add(GlassDelight.Maple_Group,"GlassDelight");

        //Glass
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS, "White Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB, "White Stained Glass Slab");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_FENCE, "White Stained Glass Fence");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE, "White Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, "White Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_BUTTON, "White Stained Glass Button");

        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, "Orange Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB, "Orange Stained Glass Slab");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_FENCE, "Orange Stained Glass Fence");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, "Orange Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, "Orange Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_BUTTON, "Orange Stained Glass Button");

        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, "Magenta Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, "Magenta Stained Glass Slab");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE, "Magenta Stained Glass Fence");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, "Magenta Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, "Magenta Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON, "Magenta Stained Glass Button");

        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, "Light Blue Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, "Light Blue Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, "Light Blue Stained Glass Fence");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, "Light Blue Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, "Light Blue Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, "Light Blue Stained Glass Button");

        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, "Yellow Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB, "Yellow Stained Glass Slab");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_FENCE, "Yellow Stained Glass Fence");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, "Yellow Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, "Yellow Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_BUTTON, "Yellow Stained Glass Button");

        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS, "Lime Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_SLAB, "Lime Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_FENCE, "Lime Stained Glass Fence");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE, "Lime Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, "Lime Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_BUTTON, "Lime Stained Glass Button");

        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS, "Pink Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_SLAB, "Pink Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_FENCE, "Pink Stained Glass Fence");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE, "Pink Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, "Pink Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_BUTTON, "Pink Stained Glass Button");

        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS, "Gray Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB, "Gray Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_FENCE, "Gray Stained Glass Fence");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE, "Gray Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, "Gray Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_BUTTON, "Gray Stained Glass Button");

        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, "Light Gray Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, "Light Gray Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, "Light Gray Stained Glass Fence");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, "Light Gray Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, "Light Gray Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, "Light Gray Stained Glass Button");

        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS, "Cyan Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB, "Cyan Stained Glass Slab");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_FENCE, "Cyan Stained Glass Fence");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE, "Cyan Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, "Cyan Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_BUTTON, "Cyan Stained Glass Button");

        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, "Purple Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB, "Purple Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_FENCE, "Purple Stained Glass Fence");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, "Purple Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, "Purple Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_BUTTON, "Purple Stained Glass Button");

        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS, "Blue Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB, "Blue Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_FENCE, "Blue Stained Glass Fence");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE, "Blue Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, "Blue Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_BUTTON, "Blue Stained Glass Button");

        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS, "Brown Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB, "Brown Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_FENCE, "Brown Stained Glass Fence");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE, "Brown Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, "Brown Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_BUTTON, "Brown Stained Glass Button");

        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS, "Green Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB, "Green Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_FENCE, "Green Stained Glass Fence");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE, "Green Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, "Green Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_BUTTON, "Green Stained Glass Button");

        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_STAIRS, "Red Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_SLAB, "Red Stained Glass Slab");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_FENCE, "Red Stained Glass Fence");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_FENCE_GATE, "Red Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, "Red Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_BUTTON, "Red Stained Glass Button");

        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS, "Black Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB, "Black Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_FENCE, "Black Stained Glass Fence");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE, "Black Stained Glass Fence Gate");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, "Black Stained Glass Pressure Plate");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_BUTTON, "Black Stained Glass Button");

        translationBuilder.add(MapleBlocks.GLASS_SLAB,"Glass Slab");
        translationBuilder.add(MapleBlocks.GLASS_STAIRS,"Glass Stairs");

        //Concrete
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_STAIRS, "White Concrete Stairs");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_SLAB, "White Concrete Slab");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_FENCE, "White Concrete Fence");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_FENCE_GATE, "White Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE, "White Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_BUTTON, "White Concrete Button");

        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_STAIRS, "Orange Concrete Stairs");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_SLAB, "Orange Concrete Slab");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_FENCE, "Orange Concrete Fence");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_FENCE_GATE, "Orange Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, "Orange Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_BUTTON, "Orange Concrete Button");

        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_STAIRS, "Magenta Concrete Stairs");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_SLAB, "Magenta Concrete Slab");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_FENCE, "Magenta Concrete Fence");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE, "Magenta Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, "Magenta Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_BUTTON, "Magenta Concrete Button");

        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, "Light Blue Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, "Light Blue Concrete Slab");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE, "Light Blue Concrete Fence");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, "Light Blue Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, "Light Blue Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON, "Light Blue Concrete Button");

        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_STAIRS, "Yellow Concrete Stairs");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_SLAB, "Yellow Concrete Slab");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_FENCE, "Yellow Concrete Fence");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_FENCE_GATE, "Yellow Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, "Yellow Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_BUTTON, "Yellow Concrete Button");

        translationBuilder.add(MapleBlocks.LIME_CONCRETE_STAIRS, "Lime Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_SLAB, "Lime Concrete Slab");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_FENCE, "Lime Concrete Fence");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_FENCE_GATE, "Lime Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE, "Lime Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_BUTTON, "Lime Concrete Button");

        translationBuilder.add(MapleBlocks.PINK_CONCRETE_STAIRS, "Pink Concrete Stairs");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_SLAB, "Pink Concrete Slab");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_FENCE, "Pink Concrete Fence");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_FENCE_GATE, "Pink Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE, "Pink Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_BUTTON, "Pink Concrete Button");

        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_STAIRS, "Gray Concrete Stairs");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_SLAB, "Gray Concrete Slab");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_FENCE, "Gray Concrete Fence");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_FENCE_GATE, "Gray Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE, "Gray Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_BUTTON, "Gray Concrete Button");

        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, "Light Gray Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, "Light Gray Concrete Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE, "Light Gray Concrete Fence");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, "Light Gray Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, "Light Gray Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON, "Light Gray Concrete Button");

        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_STAIRS, "Cyan Concrete Stairs");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_SLAB, "Cyan Concrete Slab");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_FENCE, "Cyan Concrete Fence");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_FENCE_GATE, "Cyan Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE, "Cyan Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_BUTTON, "Cyan Concrete Button");

        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_STAIRS, "Purple Concrete Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_SLAB, "Purple Concrete Slab");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_FENCE, "Purple Concrete Fence");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_FENCE_GATE, "Purple Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, "Purple Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_BUTTON, "Purple Concrete Button");

        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_STAIRS, "Blue Concrete Stairs");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_SLAB, "Blue Concrete Slab");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_FENCE, "Blue Concrete Fence");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_FENCE_GATE, "Blue Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE, "Blue Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_BUTTON, "Blue Concrete Button");

        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_STAIRS, "Brown Concrete Stairs");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_SLAB, "Brown Concrete Slab");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_FENCE, "Brown Concrete Fence");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_FENCE_GATE, "Brown Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE, "Brown Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_BUTTON, "Brown Concrete Button");

        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_STAIRS, "Green Concrete Stairs");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_SLAB, "Green Concrete Slab");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_FENCE, "Green Concrete Fence");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_FENCE_GATE, "Green Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE, "Green Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_BUTTON, "Green Concrete Button");

        translationBuilder.add(MapleBlocks.RED_CONCRETE_STAIRS, "Red Concrete Stairs");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_SLAB, "Red Concrete Slab");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_FENCE, "Red Concrete Fence");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_FENCE_GATE, "Red Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_PRESSURE_PLATE, "Red Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_BUTTON, "Red Concrete Button");

        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_STAIRS, "Black Concrete Stairs");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_SLAB, "Black Concrete Slab");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_FENCE, "Black Concrete Fence");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_FENCE_GATE, "Black Concrete Fence Gate");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE, "Black Concrete Pressure Plate");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_BUTTON, "Black Concrete Button");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/glass_delight/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
