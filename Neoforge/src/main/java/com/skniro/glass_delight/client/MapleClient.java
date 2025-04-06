package com.skniro.glass_delight.client;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.MapleBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = GlassDelight.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MapleClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderType renderLayer4 = RenderType.translucent();
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_WALL.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_FENCE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_FENCE_GATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_PRESSURE_PLATE.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_BUTTON.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_WALL.get(), renderLayer4);
    }
}
