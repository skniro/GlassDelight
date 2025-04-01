package com.skniro.glass_delight.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.glass_delight.GlassDelight;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class MapleEntityType {


    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.ENTITY, name);
        return (EntityType) Registry.register(Registries.ENTITY_TYPE, Identifier.of(GlassDelight.MOD_ID, name), builder.build(name));
    }

    public static void registerMapleEntityType() {
        GlassDelight.LOGGER.debug("Registering MapleEntityType for " + GlassDelight.MOD_ID);
    }
}
