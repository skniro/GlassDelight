package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.server.recipe.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataOutput generator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(generator, registryLookup);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.WHITE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.ORANGE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.YELLOW_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.LIME_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.PINK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.CYAN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.PURPLE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.BROWN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.GREEN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GREEN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.RED_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.has(Blocks.RED_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.BLACK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLACK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.WHITE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.ORANGE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.YELLOW_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.LIME_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.PINK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.CYAN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.PURPLE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.BROWN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.GREEN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GREEN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.RED_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.has(Blocks.RED_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.BLACK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLACK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.GREEN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.RED_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .define('#', Blocks.BLACK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.GREEN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.RED_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Blocks.BLACK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS))
                .save(exporter);

        //Fence gate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.GLASS)
                .define('P', Blocks.GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .define('P', Blocks.WHITE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .define('P', Blocks.ORANGE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .define('P', Blocks.MAGENTA_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .define('P', Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .define('P', Blocks.YELLOW_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .define('P', Blocks.LIME_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .define('P', Blocks.PINK_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .define('P', Blocks.GRAY_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .define('P', Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .define('P', Blocks.CYAN_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .define('P', Blocks.PURPLE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .define('P', Blocks.BLUE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .define('P', Blocks.BROWN_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.GLASS)
                .define('P', Blocks.GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .define('P', Blocks.WHITE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .define('P', Blocks.ORANGE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .define('P', Blocks.MAGENTA_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .define('P', Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .define('P', Blocks.YELLOW_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .define('P', Blocks.LIME_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .define('P', Blocks.PINK_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .define('P', Blocks.GRAY_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .define('P', Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .define('P', Blocks.CYAN_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .define('P', Blocks.PURPLE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .define('P', Blocks.BLUE_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .define('P', Blocks.BROWN_STAINED_GLASS_PANE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.WHITE_CONCRETE)
                .define('P', Blocks.WHITE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.ORANGE_CONCRETE)
                .define('P', Blocks.ORANGE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .define('P', Blocks.MAGENTA_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .define('P', Blocks.LIGHT_BLUE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.YELLOW_CONCRETE)
                .define('P', Blocks.YELLOW_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.LIME_CONCRETE)
                .define('P', Blocks.LIME_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.PINK_CONCRETE)
                .define('P', Blocks.PINK_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.GRAY_CONCRETE)
                .define('P', Blocks.GRAY_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .define('P', Blocks.LIGHT_GRAY_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.CYAN_CONCRETE)
                .define('P', Blocks.CYAN_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.PURPLE_CONCRETE)
                .define('P', Blocks.PURPLE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.BLUE_CONCRETE)
                .define('P', Blocks.BLUE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .define('#', Blocks.BROWN_CONCRETE)
                .define('P', Blocks.BROWN_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.WHITE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.ORANGE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.YELLOW_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.LIME_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.PINK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.CYAN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.PURPLE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.BROWN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.GREEN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GREEN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.RED_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.has(Blocks.RED_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.BLACK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLACK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.GREEN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.RED_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.BLACK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.GREEN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.RED_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.BLACK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.WHITE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.ORANGE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.YELLOW_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.LIME_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.PINK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.CYAN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.PURPLE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.BROWN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.GREEN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GREEN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.RED_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.has(Blocks.RED_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .define('#', Blocks.BLACK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLACK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS),
                        FabricRecipeProvider.has(Blocks.GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.WHITE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.ORANGE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.MAGENTA_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.YELLOW_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.LIME_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.PINK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.CYAN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.PURPLE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.BLUE_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.BROWN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.GREEN_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.RED_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.BLACK_STAINED_GLASS)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.WHITE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.ORANGE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.YELLOW_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.LIME_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.PINK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.CYAN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.PURPLE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.BLUE_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.BROWN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.GREEN_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GREEN_CONCRETE))
                .save(exporter);


            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.RED_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.has(Blocks.RED_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_BUTTON, 1)
                .pattern("#")
                .define('#', Blocks.BLACK_CONCRETE)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLACK_CONCRETE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.WHITE_CONCRETE)
                .define('P', Items.WHITE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.WHITE_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.WHITE_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.WHITE_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.ORANGE_CONCRETE)
                .define('P', Items.ORANGE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.ORANGE_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.ORANGE_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.MAGENTA_CONCRETE)
                .define('P', Items.MAGENTA_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.MAGENTA_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.MAGENTA_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                .define('P', Items.LIGHT_BLUE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.LIGHT_BLUE_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.LIGHT_BLUE_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.YELLOW_CONCRETE)
                .define('P', Items.YELLOW_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.YELLOW_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.YELLOW_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.LIME_CONCRETE)
                .define('P', Items.LIME_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIME_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.LIME_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.LIME_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.PINK_CONCRETE)
                .define('P', Items.PINK_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PINK_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.PINK_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.PINK_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.GRAY_CONCRETE)
                .define('P', Items.GRAY_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GRAY_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.GRAY_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.GRAY_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                .define('P', Items.LIGHT_GRAY_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.LIGHT_GRAY_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.LIGHT_GRAY_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.CYAN_CONCRETE)
                .define('P', Items.CYAN_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.CYAN_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.CYAN_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.CYAN_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.PURPLE_CONCRETE)
                .define('P', Items.PURPLE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.PURPLE_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.PURPLE_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.BLUE_CONCRETE)
                .define('P', Items.BLUE_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLUE_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.BLUE_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.BLUE_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.BROWN_CONCRETE)
                .define('P', Items.BROWN_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BROWN_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.BROWN_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.BROWN_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.GREEN_CONCRETE)
                .define('P', Items.GREEN_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.has(Blocks.GREEN_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.GREEN_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.GREEN_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.RED_CONCRETE)
                .define('P', Items.RED_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.has(Blocks.RED_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.RED_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.RED_CONCRETE_POWDER))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .define('#', Blocks.BLACK_CONCRETE)
                .define('P', Items.BLACK_CONCRETE_POWDER)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.has(Blocks.BLACK_CONCRETE))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.BLACK_CONCRETE_POWDER),
                        FabricRecipeProvider.has(Items.BLACK_CONCRETE_POWDER))
                .save(exporter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID,"cutting/glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GLASS), FabricRecipeProvider.has(Blocks.GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID,"cutting/white_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.WHITE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIME_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PINK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.CYAN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLUE_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BROWN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.has(Blocks.GREEN_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.has(Blocks.RED_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_stained_glass_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.has(Blocks.BLACK_STAINED_GLASS)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_stained_glass_fence_gate"));

// 混凝土 Stonecutting Recipes
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.WHITE_CONCRETE), FabricRecipeProvider.has(Blocks.WHITE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/white_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.has(Blocks.ORANGE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/orange_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.has(Blocks.MAGENTA_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/magenta_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_blue_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.has(Blocks.YELLOW_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/yellow_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIME_CONCRETE), FabricRecipeProvider.has(Blocks.LIME_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/lime_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PINK_CONCRETE), FabricRecipeProvider.has(Blocks.PINK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/pink_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/gray_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/light_gray_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.CYAN_CONCRETE), FabricRecipeProvider.has(Blocks.CYAN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/cyan_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.has(Blocks.PURPLE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/purple_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLUE_CONCRETE), FabricRecipeProvider.has(Blocks.BLUE_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/blue_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BROWN_CONCRETE), FabricRecipeProvider.has(Blocks.BROWN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/brown_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.GREEN_CONCRETE), FabricRecipeProvider.has(Blocks.GREEN_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/green_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.RED_CONCRETE), FabricRecipeProvider.has(Blocks.RED_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/red_concrete_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_WALL, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_pressure_plate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_BUTTON, 2) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_button"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_FENCE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_FENCE_GATE, 1) .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BLACK_CONCRETE), FabricRecipeProvider.has(Blocks.BLACK_CONCRETE)).save(exporter, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, "cutting/black_concrete_fence_gate"));
    }
}
