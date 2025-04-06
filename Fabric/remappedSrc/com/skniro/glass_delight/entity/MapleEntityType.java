package com.skniro.glass_delight.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.glass_delight.GlassDelight;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class MapleEntityType {


    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        Type<?> type = Util.fetchChoiceType(References.ENTITY, name);
        return (EntityType) Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GlassDelight.MOD_ID, name), builder.build(name));
    }

    public static void registerMapleEntityType() {
        GlassDelight.LOGGER.debug("Registering MapleEntityType for " + GlassDelight.MOD_ID);
    }
}
