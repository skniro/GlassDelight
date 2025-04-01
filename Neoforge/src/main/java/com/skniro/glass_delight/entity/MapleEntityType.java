package com.skniro.glass_delight.entity;

import com.skniro.glass_delight.Maple;
import com.skniro.glass_delight.entity.custom.MapleBoatEntity;
import com.skniro.glass_delight.entity.custom.MapleChestBoatEntity;
import com.skniro.glass_delight.entity.furniture.ChairEntity;
import com.skniro.glass_delight.entity.furniture.CushionEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Maple.MODID);

    public static final Supplier<EntityType<MapleBoatEntity>> Maple_BOAT =
            ENTITY_TYPES.register("maple_boat", () -> EntityType.Builder.<com.skniro.glass_delight.entity.custom.MapleBoatEntity>of(com.skniro.glass_delight.entity.custom.MapleBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("maple_boat"));
    public static final Supplier<EntityType<MapleChestBoatEntity>> Maple_CHEST_BOAT =
            ENTITY_TYPES.register("maple_chest_boat", () -> EntityType.Builder.<MapleChestBoatEntity>of(MapleChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("maple_chest_boat"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
