package com.skniro.glass_delight.block.entity;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.MapleBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MapleBlockEntityType {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GlassDelight.MODID);

    public static final RegistryObject<BlockEntityType<MapleJuicerBlockEntity>>  MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            BLOCK_ENTITIES.register("maple_juicer_block_entity", () -> BlockEntityType.Builder.of(
                    MapleJuicerBlockEntity::new, MapleBlocks.Maple_Juicer_Block.get()).build(null));

    public static void registerBlockEntityType(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
