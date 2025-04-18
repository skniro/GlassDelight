package com.skniro.glass_delight.entity;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.entity.custom.MapleChestBoatEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GlassDelight.MODID);

    public static final RegistryObject<EntityType<com.skniro.glass_delight.entity.custom.MapleBoatEntity>> Maple_BOAT =
            ENTITY_TYPES.register("maple_boat", () -> EntityType.Builder.<com.skniro.glass_delight.entity.custom.MapleBoatEntity>of(com.skniro.glass_delight.entity.custom.MapleBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("maple_boat"));
    public static final RegistryObject<EntityType<MapleChestBoatEntity>> Maple_CHEST_BOAT =
            ENTITY_TYPES.register("maple_chest_boat", () -> EntityType.Builder.<MapleChestBoatEntity>of(MapleChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("maple_chest_boat"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}