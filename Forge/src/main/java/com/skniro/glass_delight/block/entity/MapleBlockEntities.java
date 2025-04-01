package com.skniro.glass_delight.block.entity;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.MapleSignBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class MapleBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GlassDelight.MODID);

/*
    public static final Supplier<BlockEntityType<MapleSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(MapleSignBlockEntity::new,
                            MapleSignBlocks.BAMBOO_SIGN.get(),
                            MapleSignBlocks.BAMBOO_WALL_SIGN.get(),
                            MapleSignBlocks.Maple_SIGN.get(),
                            MapleSignBlocks.Maple_WALL_SIGN.get(),
                            MapleSignBlocks.CHERRY_SIGN.get(),
                            MapleSignBlocks.CHERRY_WALL_SIGN.get(),
                            MapleSignBlocks.GINKGO_SIGN.get(),
                            MapleSignBlocks.GINKGO_WALL_SIGN.get()).build(null));

    public static final Supplier<BlockEntityType<MapleHangingSignBlockEntity>> Maple_HANGING_SIGN =
            BLOCK_ENTITIES.register("maple_hanging_sign", () ->
                    BlockEntityType.Builder.of(MapleHangingSignBlockEntity::new,
                            MapleSignBlocks.Maple_HANGING_SIGN.get(),
                            MapleSignBlocks.Maple_WALL_HANGING_SIGN.get(),
                            MapleSignBlocks.GINKGO_HANGING_SIGN.get(),
                            MapleSignBlocks.GINKGO_WALL_HANGING_SIGN.get()
                            ).build(null));
*/


    public static void registerMapleBlockEntities(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
