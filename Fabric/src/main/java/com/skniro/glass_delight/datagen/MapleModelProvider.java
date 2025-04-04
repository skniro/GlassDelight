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
        white.pressurePlate(MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
        white.button(MapleBlocks.WHITE_STAINED_GLASS_BUTTON);
        white.fence(MapleBlocks.WHITE_STAINED_GLASS_FENCE);
        white.fenceGate(MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
        white.wall(MapleBlocks.WHITE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool orange = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS);
        orange.slab(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        orange.stairs(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
        orange.pressurePlate(MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE);
        orange.button(MapleBlocks.ORANGE_STAINED_GLASS_BUTTON);
        orange.fence(MapleBlocks.ORANGE_STAINED_GLASS_FENCE);
        orange.fenceGate(MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE);
        orange.wall(MapleBlocks.ORANGE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool magenta = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS);
        magenta.slab(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        magenta.stairs(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        magenta.pressurePlate(MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
        magenta.button(MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON);
        magenta.fence(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE);
        magenta.fenceGate(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE);
        magenta.wall(MapleBlocks.MAGENTA_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlue = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS);
        lightBlue.slab(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        lightBlue.stairs(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        lightBlue.pressurePlate(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
        lightBlue.button(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON);
        lightBlue.fence(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
        lightBlue.fenceGate(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE);
        lightBlue.wall(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool yellow = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS);
        yellow.slab(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        yellow.stairs(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
        yellow.pressurePlate(MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE);
        yellow.button(MapleBlocks.YELLOW_STAINED_GLASS_BUTTON);
        yellow.fence(MapleBlocks.YELLOW_STAINED_GLASS_FENCE);
        yellow.fenceGate(MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE);
        yellow.wall(MapleBlocks.YELLOW_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool lime = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS);
        lime.slab(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        lime.stairs(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
        lime.pressurePlate(MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE);
        lime.button(MapleBlocks.LIME_STAINED_GLASS_BUTTON);
        lime.fence(MapleBlocks.LIME_STAINED_GLASS_FENCE);
        lime.fenceGate(MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE);
        lime.wall(MapleBlocks.LIME_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool pink = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS);
        pink.slab(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        pink.stairs(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
        pink.pressurePlate(MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE);
        pink.button(MapleBlocks.PINK_STAINED_GLASS_BUTTON);
        pink.fence(MapleBlocks.PINK_STAINED_GLASS_FENCE);
        pink.fenceGate(MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE);
        pink.wall(MapleBlocks.PINK_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool gray = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS);
        gray.slab(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        gray.stairs(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
        gray.pressurePlate(MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE);
        gray.button(MapleBlocks.GRAY_STAINED_GLASS_BUTTON);
        gray.fence(MapleBlocks.GRAY_STAINED_GLASS_FENCE);
        gray.fenceGate(MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE);
        gray.wall(MapleBlocks.GRAY_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGray = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS);
        lightGray.slab(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        lightGray.stairs(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        lightGray.pressurePlate(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
        lightGray.button(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON);
        lightGray.fence(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
        lightGray.fenceGate(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE);
        lightGray.wall(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool cyan = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS);
        cyan.slab(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        cyan.stairs(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
        cyan.pressurePlate(MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE);
        cyan.button(MapleBlocks.CYAN_STAINED_GLASS_BUTTON);
        cyan.fence(MapleBlocks.CYAN_STAINED_GLASS_FENCE);
        cyan.fenceGate(MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE);
        cyan.wall(MapleBlocks.CYAN_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool purple = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS);
        purple.slab(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        purple.stairs(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
        purple.pressurePlate(MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE);
        purple.button(MapleBlocks.PURPLE_STAINED_GLASS_BUTTON);
        purple.fence(MapleBlocks.PURPLE_STAINED_GLASS_FENCE);
        purple.fenceGate(MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE);
        purple.wall(MapleBlocks.PURPLE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool blue = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS);
        blue.slab(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        blue.stairs(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
        blue.pressurePlate(MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE);
        blue.button(MapleBlocks.BLUE_STAINED_GLASS_BUTTON);
        blue.fence(MapleBlocks.BLUE_STAINED_GLASS_FENCE);
        blue.fenceGate(MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE);
        blue.wall(MapleBlocks.BLUE_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool brown = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS);
        brown.slab(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        brown.stairs(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
        brown.pressurePlate(MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE);
        brown.button(MapleBlocks.BROWN_STAINED_GLASS_BUTTON);
        brown.fence(MapleBlocks.BROWN_STAINED_GLASS_FENCE);
        brown.fenceGate(MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE);
        brown.wall(MapleBlocks.BROWN_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool green = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS);
        green.slab(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        green.stairs(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
        green.pressurePlate(MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE);
        green.button(MapleBlocks.GREEN_STAINED_GLASS_BUTTON);
        green.fence(MapleBlocks.GREEN_STAINED_GLASS_FENCE);
        green.fenceGate(MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE);
        green.wall(MapleBlocks.GREEN_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool red = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS);
        red.slab(MapleBlocks.RED_STAINED_GLASS_SLAB);
        red.stairs(MapleBlocks.RED_STAINED_GLASS_STAIRS);
        red.pressurePlate(MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE);
        red.button(MapleBlocks.RED_STAINED_GLASS_BUTTON);
        red.fence(MapleBlocks.RED_STAINED_GLASS_FENCE);
        red.fenceGate(MapleBlocks.RED_STAINED_GLASS_FENCE_GATE);
        red.wall(MapleBlocks.RED_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool black = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS);
        black.slab(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        black.stairs(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
        black.pressurePlate(MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE);
        black.button(MapleBlocks.BLACK_STAINED_GLASS_BUTTON);
        black.fence(MapleBlocks.BLACK_STAINED_GLASS_FENCE);
        black.fenceGate(MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE);
        black.wall(MapleBlocks.BLACK_STAINED_GLASS_WALL);

        BlockStateModelGenerator.BlockTexturePool glass = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GLASS);
        glass.slab(MapleBlocks.GLASS_SLAB);
        glass.stairs(MapleBlocks.GLASS_STAIRS);

        //Concrete
        BlockStateModelGenerator.BlockTexturePool whiteConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        whiteConcrete.slab(MapleBlocks.WHITE_CONCRETE_SLAB);
        whiteConcrete.stairs(MapleBlocks.WHITE_CONCRETE_STAIRS);
        whiteConcrete.pressurePlate(MapleBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        whiteConcrete.button(MapleBlocks.WHITE_CONCRETE_BUTTON);
        whiteConcrete.fence(MapleBlocks.WHITE_CONCRETE_FENCE);
        whiteConcrete.fenceGate(MapleBlocks.WHITE_CONCRETE_FENCE_GATE);
        whiteConcrete.wall(MapleBlocks.WHITE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool orangeConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orangeConcrete.slab(MapleBlocks.ORANGE_CONCRETE_SLAB);
        orangeConcrete.stairs(MapleBlocks.ORANGE_CONCRETE_STAIRS);
        orangeConcrete.pressurePlate(MapleBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        orangeConcrete.button(MapleBlocks.ORANGE_CONCRETE_BUTTON);
        orangeConcrete.fence(MapleBlocks.ORANGE_CONCRETE_FENCE);
        orangeConcrete.fenceGate(MapleBlocks.ORANGE_CONCRETE_FENCE_GATE);
        orangeConcrete.wall(MapleBlocks.ORANGE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool magentaConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magentaConcrete.slab(MapleBlocks.MAGENTA_CONCRETE_SLAB);
        magentaConcrete.stairs(MapleBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaConcrete.pressurePlate(MapleBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        magentaConcrete.button(MapleBlocks.MAGENTA_CONCRETE_BUTTON);
        magentaConcrete.fence(MapleBlocks.MAGENTA_CONCRETE_FENCE);
        magentaConcrete.fenceGate(MapleBlocks.MAGENTA_CONCRETE_FENCE_GATE);
        magentaConcrete.wall(MapleBlocks.MAGENTA_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlueConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        lightBlueConcrete.slab(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBlueConcrete.stairs(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBlueConcrete.pressurePlate(MapleBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        lightBlueConcrete.button(MapleBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        lightBlueConcrete.fence(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        lightBlueConcrete.fenceGate(MapleBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE);
        lightBlueConcrete.wall(MapleBlocks.LIGHT_BLUE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool yellowConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellowConcrete.slab(MapleBlocks.YELLOW_CONCRETE_SLAB);
        yellowConcrete.stairs(MapleBlocks.YELLOW_CONCRETE_STAIRS);
        yellowConcrete.pressurePlate(MapleBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        yellowConcrete.button(MapleBlocks.YELLOW_CONCRETE_BUTTON);
        yellowConcrete.fence(MapleBlocks.YELLOW_CONCRETE_FENCE);
        yellowConcrete.fenceGate(MapleBlocks.YELLOW_CONCRETE_FENCE_GATE);
        yellowConcrete.wall(MapleBlocks.YELLOW_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool limeConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        limeConcrete.slab(MapleBlocks.LIME_CONCRETE_SLAB);
        limeConcrete.stairs(MapleBlocks.LIME_CONCRETE_STAIRS);
        limeConcrete.pressurePlate(MapleBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        limeConcrete.button(MapleBlocks.LIME_CONCRETE_BUTTON);
        limeConcrete.fence(MapleBlocks.LIME_CONCRETE_FENCE);
        limeConcrete.fenceGate(MapleBlocks.LIME_CONCRETE_FENCE_GATE);
        limeConcrete.wall(MapleBlocks.LIME_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool pinkConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pinkConcrete.slab(MapleBlocks.PINK_CONCRETE_SLAB);
        pinkConcrete.stairs(MapleBlocks.PINK_CONCRETE_STAIRS);
        pinkConcrete.pressurePlate(MapleBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        pinkConcrete.button(MapleBlocks.PINK_CONCRETE_BUTTON);
        pinkConcrete.fence(MapleBlocks.PINK_CONCRETE_FENCE);
        pinkConcrete.fenceGate(MapleBlocks.PINK_CONCRETE_FENCE_GATE);
        pinkConcrete.wall(MapleBlocks.PINK_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool grayConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        grayConcrete.slab(MapleBlocks.GRAY_CONCRETE_SLAB);
        grayConcrete.stairs(MapleBlocks.GRAY_CONCRETE_STAIRS);
        grayConcrete.pressurePlate(MapleBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        grayConcrete.button(MapleBlocks.GRAY_CONCRETE_BUTTON);
        grayConcrete.fence(MapleBlocks.GRAY_CONCRETE_FENCE);
        grayConcrete.fenceGate(MapleBlocks.GRAY_CONCRETE_FENCE_GATE);
        grayConcrete.wall(MapleBlocks.GRAY_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGrayConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        lightGrayConcrete.slab(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayConcrete.stairs(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayConcrete.pressurePlate(MapleBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        lightGrayConcrete.button(MapleBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        lightGrayConcrete.fence(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        lightGrayConcrete.fenceGate(MapleBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE);
        lightGrayConcrete.wall(MapleBlocks.LIGHT_GRAY_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool cyanConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyanConcrete.slab(MapleBlocks.CYAN_CONCRETE_SLAB);
        cyanConcrete.stairs(MapleBlocks.CYAN_CONCRETE_STAIRS);
        cyanConcrete.pressurePlate(MapleBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        cyanConcrete.button(MapleBlocks.CYAN_CONCRETE_BUTTON);
        cyanConcrete.fence(MapleBlocks.CYAN_CONCRETE_FENCE);
        cyanConcrete.fenceGate(MapleBlocks.CYAN_CONCRETE_FENCE_GATE);
        cyanConcrete.wall(MapleBlocks.CYAN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool purpleConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purpleConcrete.slab(MapleBlocks.PURPLE_CONCRETE_SLAB);
        purpleConcrete.stairs(MapleBlocks.PURPLE_CONCRETE_STAIRS);
        purpleConcrete.pressurePlate(MapleBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        purpleConcrete.button(MapleBlocks.PURPLE_CONCRETE_BUTTON);
        purpleConcrete.fence(MapleBlocks.PURPLE_CONCRETE_FENCE);
        purpleConcrete.fenceGate(MapleBlocks.PURPLE_CONCRETE_FENCE_GATE);
        purpleConcrete.wall(MapleBlocks.PURPLE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool blueConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        blueConcrete.slab(MapleBlocks.BLUE_CONCRETE_SLAB);
        blueConcrete.stairs(MapleBlocks.BLUE_CONCRETE_STAIRS);
        blueConcrete.pressurePlate(MapleBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        blueConcrete.button(MapleBlocks.BLUE_CONCRETE_BUTTON);
        blueConcrete.fence(MapleBlocks.BLUE_CONCRETE_FENCE);
        blueConcrete.fenceGate(MapleBlocks.BLUE_CONCRETE_FENCE_GATE);
        blueConcrete.wall(MapleBlocks.BLUE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool brownConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brownConcrete.slab(MapleBlocks.BROWN_CONCRETE_SLAB);
        brownConcrete.stairs(MapleBlocks.BROWN_CONCRETE_STAIRS);
        brownConcrete.pressurePlate(MapleBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        brownConcrete.button(MapleBlocks.BROWN_CONCRETE_BUTTON);
        brownConcrete.fence(MapleBlocks.BROWN_CONCRETE_FENCE);
        brownConcrete.fenceGate(MapleBlocks.BROWN_CONCRETE_FENCE_GATE);
        brownConcrete.wall(MapleBlocks.BROWN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool greenConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        greenConcrete.slab(MapleBlocks.GREEN_CONCRETE_SLAB);
        greenConcrete.stairs(MapleBlocks.GREEN_CONCRETE_STAIRS);
        greenConcrete.pressurePlate(MapleBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        greenConcrete.button(MapleBlocks.GREEN_CONCRETE_BUTTON);
        greenConcrete.fence(MapleBlocks.GREEN_CONCRETE_FENCE);
        greenConcrete.fenceGate(MapleBlocks.GREEN_CONCRETE_FENCE_GATE);
        greenConcrete.wall(MapleBlocks.GREEN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool redConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        redConcrete.slab(MapleBlocks.RED_CONCRETE_SLAB);
        redConcrete.stairs(MapleBlocks.RED_CONCRETE_STAIRS);
        redConcrete.pressurePlate(MapleBlocks.RED_CONCRETE_PRESSURE_PLATE);
        redConcrete.button(MapleBlocks.RED_CONCRETE_BUTTON);
        redConcrete.fence(MapleBlocks.RED_CONCRETE_FENCE);
        redConcrete.fenceGate(MapleBlocks.RED_CONCRETE_FENCE_GATE);
        redConcrete.wall(MapleBlocks.RED_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool blackConcrete = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        blackConcrete.slab(MapleBlocks.BLACK_CONCRETE_SLAB);
        blackConcrete.stairs(MapleBlocks.BLACK_CONCRETE_STAIRS);
        blackConcrete.pressurePlate(MapleBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        blackConcrete.button(MapleBlocks.BLACK_CONCRETE_BUTTON);
        blackConcrete.fence(MapleBlocks.BLACK_CONCRETE_FENCE);
        blackConcrete.fenceGate(MapleBlocks.BLACK_CONCRETE_FENCE_GATE);
        blackConcrete.wall(MapleBlocks.BLACK_CONCRETE_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
