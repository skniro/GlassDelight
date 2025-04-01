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
        translationBuilder.add(GlassDelight.Maple_Group,"Maple");

        //Glass
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS,"White Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB,"White Stained Glass Slab");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB,"Orange Stained Glass Slab");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS,"Orange Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB,"Magenta Stained Glass Slab");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS,"Magenta Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,"Light Blue Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,"Light Blue Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB,"Yellow Stained Glass Slab");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS,"Yellow Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_SLAB,"Lime Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS,"Lime Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_SLAB,"Pink Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS,"Pink Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB,"Gray Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS,"Gray Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,"Light Gray Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,"Light Gray Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB,"Cyan Stained Glass Slab");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS,"Cyan Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB,"Purple Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS,"Purple Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB,"Blue Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS,"Blue Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB,"Brown Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS,"Brown Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB,"Green Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS,"Green Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_SLAB,"Red Stained Glass Slab");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_STAIRS,"Red Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB,"Black Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS,"Black Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GLASS_SLAB,"Glass Slab");
        translationBuilder.add(MapleBlocks.GLASS_STAIRS,"Glass Stairs");

        //Concrete
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_SLAB,"White Concrete Slab");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_STAIRS,"White Concrete Stairs");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_SLAB,"Orange Concrete Slab");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_STAIRS,"Orange Concrete Stairs");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_SLAB,"Magenta Concrete Slab");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_STAIRS,"Magenta Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB,"Light Blue Concrete Slab");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS,"Light Blue Concrete Stairs");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_SLAB,"Yellow Concrete Slab");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_STAIRS,"Yellow Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_SLAB,"Lime Concrete Slab");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_STAIRS,"Lime Concrete Stairs");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_SLAB,"Pink Concrete Slab");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_STAIRS,"Pink Concrete Stairs");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_SLAB,"Gray Concrete Slab");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_STAIRS,"Gray Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB,"Light Gray Concrete Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS,"Light Gray Concrete Stairs");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_SLAB,"Cyan Concrete Slab");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_STAIRS,"Cyan Concrete Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_SLAB,"Purple Concrete Slab");;
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_STAIRS,"Purple Concrete Stairs");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_SLAB,"Blue Concrete Slab");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_STAIRS,"Blue Concrete Stairs");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_SLAB,"Brown Concrete Slab");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_STAIRS,"Brown Concrete Stairs");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_SLAB,"Green Concrete Slab");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_STAIRS,"Green Concrete Stairs");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_SLAB,"Red Concrete Slab");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_STAIRS,"Red Concrete Stairs");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_SLAB,"Black Concrete Slab");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_STAIRS,"Black Concrete Stairs");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/glass_delight/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
