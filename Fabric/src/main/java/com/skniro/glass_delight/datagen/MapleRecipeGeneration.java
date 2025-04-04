package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataOutput generator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(generator, registryLookup);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        //Fence gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .input('P', Blocks.WHITE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .input('P', Blocks.ORANGE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .input('P', Blocks.MAGENTA_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .input('P', Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .input('P', Blocks.YELLOW_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .input('P', Blocks.LIME_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .input('P', Blocks.PINK_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .input('P', Blocks.GRAY_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .input('P', Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .input('P', Blocks.CYAN_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .input('P', Blocks.PURPLE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .input('P', Blocks.BLUE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .input('P', Blocks.BROWN_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .input('P', Blocks.WHITE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .input('P', Blocks.ORANGE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .input('P', Blocks.MAGENTA_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .input('P', Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .input('P', Blocks.YELLOW_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .input('P', Blocks.LIME_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .input('P', Blocks.PINK_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .input('P', Blocks.GRAY_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .input('P', Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .input('P', Blocks.CYAN_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .input('P', Blocks.PURPLE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .input('P', Blocks.BLUE_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .input('P', Blocks.BROWN_STAINED_GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.WHITE_CONCRETE)
                .input('P', Blocks.WHITE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.ORANGE_CONCRETE)
                .input('P', Blocks.ORANGE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .input('P', Blocks.MAGENTA_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .input('P', Blocks.LIGHT_BLUE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.YELLOW_CONCRETE)
                .input('P', Blocks.YELLOW_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.LIME_CONCRETE)
                .input('P', Blocks.LIME_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.PINK_CONCRETE)
                .input('P', Blocks.PINK_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.GRAY_CONCRETE)
                .input('P', Blocks.GRAY_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .input('P', Blocks.LIGHT_GRAY_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.CYAN_CONCRETE)
                .input('P', Blocks.CYAN_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.PURPLE_CONCRETE)
                .input('P', Blocks.PURPLE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.BLUE_CONCRETE)
                .input('P', Blocks.BLUE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE, 3)
                .pattern("#P#")
                .pattern("#P#")
                .input('#', Blocks.BROWN_CONCRETE)
                .input('P', Blocks.BROWN_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);


            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_BUTTON, 1)
                .pattern("#")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.WHITE_CONCRETE)
                .input('P', Items.WHITE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.WHITE_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.ORANGE_CONCRETE)
                .input('P', Items.ORANGE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.ORANGE_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .input('P', Items.MAGENTA_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .input('P', Items.LIGHT_BLUE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.YELLOW_CONCRETE)
                .input('P', Items.YELLOW_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.YELLOW_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.LIME_CONCRETE)
                .input('P', Items.LIME_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.LIME_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.LIME_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.PINK_CONCRETE)
                .input('P', Items.PINK_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.PINK_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.GRAY_CONCRETE)
                .input('P', Items.GRAY_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.GRAY_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.GRAY_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .input('P', Items.LIGHT_GRAY_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.CYAN_CONCRETE)
                .input('P', Items.CYAN_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.CYAN_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.CYAN_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.PURPLE_CONCRETE)
                .input('P', Items.PURPLE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.PURPLE_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.BLUE_CONCRETE)
                .input('P', Items.BLUE_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.BLUE_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.BLUE_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.BROWN_CONCRETE)
                .input('P', Items.BROWN_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.BROWN_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.GREEN_CONCRETE)
                .input('P', Items.GREEN_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.GREEN_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.GREEN_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.RED_CONCRETE)
                .input('P', Items.RED_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.RED_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.RED_CONCRETE_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_FENCE_GATE, 1)
                .pattern("P#P")
                .pattern("P#P")
                .input('#', Blocks.BLACK_CONCRETE)
                .input('P', Items.BLACK_CONCRETE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .criterion(FabricRecipeProvider.hasItem(Items.BLACK_CONCRETE_POWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.BLACK_CONCRETE_POWDER))
                .offerTo(exporter);


                        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID,"cutting/white_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_stained_glass_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_stained_glass_fence_gate"));

// 混凝土 Stonecutting Recipes
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/white_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/orange_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/magenta_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_blue_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/yellow_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/lime_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/pink_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/gray_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/light_gray_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/cyan_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/purple_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/blue_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/brown_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/green_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/red_concrete_fence_gate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_stairs"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_slab"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_WALL, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_wall"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_pressure_plate"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_BUTTON, 2) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_button"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_FENCE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_fence"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_FENCE_GATE, 1) .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, Identifier.of(GlassDelight.MOD_ID, "cutting/black_concrete_fence_gate"));
    }
}
