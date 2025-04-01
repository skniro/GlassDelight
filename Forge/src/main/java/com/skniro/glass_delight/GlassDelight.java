package com.skniro.glass_delight;

import com.mojang.logging.LogUtils;
import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.block.MapleSignBlocks;
import com.skniro.glass_delight.block.entity.MapleBlockEntities;
import com.skniro.glass_delight.block.entity.MapleBlockEntityType;
import com.skniro.glass_delight.block.entity.MapleWoodTypes;
import com.skniro.glass_delight.block.renderer.MapleJuicerEntityRenderer;
import com.skniro.glass_delight.client.boat.MapleBoatRenderer;
import com.skniro.glass_delight.client.boat.MapleModelLayers;
import com.skniro.glass_delight.client.gui.screen.ingame.MapleJuicerBlockScreen;
import com.skniro.glass_delight.client.particle.MapleCampfireSmokeParticle;
import com.skniro.glass_delight.client.particle.MapleCherryLeavesParticle;
import com.skniro.glass_delight.client.renderer.ChairRenderer;
import com.skniro.glass_delight.client.renderer.CushinoRenderer;
import com.skniro.glass_delight.entity.MapleEntityType;
import com.skniro.glass_delight.fluid.MapleFluidBlockOrItem;
import com.skniro.glass_delight.fluid.MapleFluidTypes;
import com.skniro.glass_delight.fluid.MapleFluids;
import com.skniro.glass_delight.item.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GlassDelight.MODID)
public class GlassDelight {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "maple";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public GlassDelight(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        MapleBlocks.registerMapleBlocks(modEventBus);
        MapleOreBlocks.registerMapleOreBlocks(modEventBus);
        MapleFurnitureBlocks.registerMapleBlocks(modEventBus);

        MapleBlockEntityType.registerBlockEntityType(modEventBus);

        // Register the Deferred Register to the mod event bus so items get registered
        MapleItems.registerModItems(modEventBus);
        MapleCreativeModeTabs.registerMapleCreativeModeTabs(modEventBus);

        MapleSignBlocks.registerMapleSignBlocks(modEventBus);

        MapleBlockEntities.registerMapleBlockEntities(modEventBus);
        MapleEntityType.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            WoodType.register(MapleWoodTypes.MAPLE);
            WoodType.register(MapleWoodTypes.GINKGO);
            BlockEntityRenderers.register(MapleBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
            BlockEntityRenderers.register(MapleBlockEntities.Maple_HANGING_SIGN.get(), HangingSignRenderer::new);
            Sheets.addWoodType(MapleWoodTypes.MAPLE);
            Sheets.addWoodType(MapleWoodTypes.GINKGO);
            EntityRenderers.register(MapleEntityType.Maple_BOAT.get(), pContext -> new MapleBoatRenderer(pContext, false));
            EntityRenderers.register(MapleEntityType.Maple_CHEST_BOAT.get(), pContext -> new MapleBoatRenderer(pContext, true));
            EntityRenderers.register(MapleEntityType.Cushion_ENTITY.get(), CushinoRenderer::new);
            EntityRenderers.register(MapleEntityType.CHAIR_ENTITY.get(), ChairRenderer::new);
            MenuScreens.register(MapleScreenHandlerType.Maple_JUICER.get(), MapleJuicerBlockScreen::new);
            BlockEntityRenderers.register(MapleBlockEntityType.MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE.get(), MapleJuicerEntityRenderer::new);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ParticleFactoryRegistry {
        @SubscribeEvent
        public static void onParticleFactoryRegistration(RegisterParticleProvidersEvent event) {
           event.registerSpriteSet(MapleParticleTypes.HOT_SPRING.get(), MapleCampfireSmokeParticle.CosySmokeFactory::new);

           event.registerSpriteSet(MapleParticleTypes.CHERRY_LEAVES.get(),((spriteProvider) -> {
                return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                    return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
                };
            }));

            event.registerSpriteSet(MapleParticleTypes.SAKURA_LEAVES.get(),((spriteProvider) -> {
                return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                    return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
                };
            }));
        }

        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(MapleModelLayers.Maple_BOAT_LAYER, BoatModel::createBodyModel);
            event.registerLayerDefinition(MapleModelLayers.Maple_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
            event.registerLayerDefinition(MapleModelLayers.Ginkgo_BOAT_LAYER, BoatModel::createBodyModel);
            event.registerLayerDefinition(MapleModelLayers.Ginkgo_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        }
    }
}
