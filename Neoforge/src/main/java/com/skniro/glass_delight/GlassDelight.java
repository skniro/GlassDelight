package com.skniro.glass_delight;

import com.mojang.logging.LogUtils;
import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.item.MapleCreativeModeTabs;
import com.skniro.glass_delight.item.MapleItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GlassDelight.MODID)
public class GlassDelight {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "glass_delight";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public GlassDelight(IEventBus modEventBus) {

        // Register the commonSetup method for modloading

        // Register the Deferred Register to the mod event bus so blocks get registered
        MapleBlocks.registerMapleBlocks(modEventBus);


        //MapleBlockEntityType.registerBlockEntityType(modEventBus);

        // Register the Deferred Register to the mod event bus so items get registered
        MapleItems.registerModItems(modEventBus);
        MapleCreativeModeTabs.registerMapleCreativeModeTabs(modEventBus);

        //MapleSignBlocks.registerMapleSignBlocks(modEventBus);

        //MapleBlockEntities.registerMapleBlockEntities(modEventBus);
        //MapleEntityType.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
/*            WoodType.register(MapleWoodTypes.MAPLE);
            WoodType.register(MapleWoodTypes.GINKGO);
            Sheets.addWoodType(MapleWoodTypes.MAPLE);
            Sheets.addWoodType(MapleWoodTypes.GINKGO);
            EntityRenderers.register(MapleEntityType.Maple_BOAT.get(), pContext -> new MapleBoatRenderer(pContext, false));
            EntityRenderers.register(MapleEntityType.Maple_CHEST_BOAT.get(), pContext -> new MapleBoatRenderer(pContext, true));*/
        }
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ParticleFactoryRegistry {

        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
/*            event.registerLayerDefinition(MapleModelLayers.Maple_BOAT_LAYER, BoatModel::createBodyModel);
            event.registerLayerDefinition(MapleModelLayers.Maple_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
            event.registerLayerDefinition(MapleModelLayers.Ginkgo_BOAT_LAYER, BoatModel::createBodyModel);
            event.registerLayerDefinition(MapleModelLayers.Ginkgo_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);*/
        }
    }
}
