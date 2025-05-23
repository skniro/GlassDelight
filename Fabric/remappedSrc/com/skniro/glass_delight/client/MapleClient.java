package com.skniro.glass_delight.client;

import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        RenderType renderLayer2 = RenderType.cutoutMipped();


        RenderType renderLayer3 = RenderType.cutout();



        RenderType renderLayer4 = RenderType.translucent();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_WALL, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_FENCE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_FENCE_GATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_PRESSURE_PLATE, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_BUTTON, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_WALL, renderLayer4);

    }
}
