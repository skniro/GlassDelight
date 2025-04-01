package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class MapleModelProvider extends FabricModelProvider {
    public MapleModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool white = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_STAINED_GLASS);
        white.slab(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
        white.stairs(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool orange = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS);
        orange.slab(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        orange.stairs(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool magenta = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS);
        magenta.slab(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        magenta.stairs(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_blue = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS);
        light_blue.slab(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        light_blue.stairs(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool yellow = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS);
        yellow.slab(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        yellow.stairs(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool lime = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS);
        lime.slab(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        lime.stairs(MapleBlocks.LIME_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool pink = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS);
        pink.slab(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        pink.stairs(MapleBlocks.PINK_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gray = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS);
        gray.slab(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        gray.stairs(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_gray = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS);
        light_gray.slab(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        light_gray.stairs(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cyan = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS);
        cyan.slab(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        cyan.stairs(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool purple = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS);
        purple.slab(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        purple.stairs(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool blue = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS);
        blue.slab(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        blue.stairs(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool brown = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS);
        brown.slab(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        brown.stairs(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool green = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS);
        green.slab(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        green.stairs(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool red = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS);
        red.slab(MapleBlocks.RED_STAINED_GLASS_SLAB);
        red.stairs(MapleBlocks.RED_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool black = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS);
        black.slab(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        black.stairs(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool glass = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GLASS);
        glass.slab(MapleBlocks.GLASS_SLAB);
        glass.stairs(MapleBlocks.GLASS_STAIRS);

        //Concrete
        BlockStateModelGenerator.BlockTexturePool white1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        white1.slab(MapleBlocks.WHITE_CONCRETE_SLAB);
        white1.stairs(MapleBlocks.WHITE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool orange1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orange1.slab(MapleBlocks.ORANGE_CONCRETE_SLAB);
        orange1.stairs(MapleBlocks.ORANGE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool magenta1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magenta1.slab(MapleBlocks.MAGENTA_CONCRETE_SLAB);
        magenta1.stairs(MapleBlocks.MAGENTA_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_blue1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        light_blue1.slab(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        light_blue1.stairs(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool yellow1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellow1.slab(MapleBlocks.YELLOW_CONCRETE_SLAB);
        yellow1.stairs(MapleBlocks.YELLOW_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool lime1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        lime1.slab(MapleBlocks.LIME_CONCRETE_SLAB);
        lime1.stairs(MapleBlocks.LIME_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool pink1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pink1.slab(MapleBlocks.PINK_CONCRETE_SLAB);
        pink1.stairs(MapleBlocks.PINK_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gray1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        gray1.slab(MapleBlocks.GRAY_CONCRETE_SLAB);
        gray1.stairs(MapleBlocks.GRAY_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_gray1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        light_gray1.slab(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        light_gray1.stairs(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cyan1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyan1.slab(MapleBlocks.CYAN_CONCRETE_SLAB);
        cyan1.stairs(MapleBlocks.CYAN_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool purple1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purple1.slab(MapleBlocks.PURPLE_CONCRETE_SLAB);
        purple1.stairs(MapleBlocks.PURPLE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool blue1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        blue1.slab(MapleBlocks.BLUE_CONCRETE_SLAB);
        blue1.stairs(MapleBlocks.BLUE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool brown1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brown1.slab(MapleBlocks.BROWN_CONCRETE_SLAB);
        brown1.stairs(MapleBlocks.BROWN_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool green1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        green1.slab(MapleBlocks.GREEN_CONCRETE_SLAB);
        green1.stairs(MapleBlocks.GREEN_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool red1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        red1.slab(MapleBlocks.RED_CONCRETE_SLAB);
        red1.stairs(MapleBlocks.RED_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool black1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        black1.slab(MapleBlocks.BLACK_CONCRETE_SLAB);
        black1.stairs(MapleBlocks.BLACK_CONCRETE_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
