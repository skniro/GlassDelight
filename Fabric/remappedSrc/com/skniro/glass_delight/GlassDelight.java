package com.skniro.glass_delight;

import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GlassDelight implements ModInitializer {
    public static final String MOD_ID = "glass_delight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ResourceKey<CreativeModeTab> Maple_Group = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "maple_group"));

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Maple_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MapleBlocks.BLACK_CONCRETE_SLAB))
                .title(Component.translatable("itemGroup.maple.maple_group"))
                .build()); // build() no longer registers by itself
        GlassDelightContent.registerItem();
        GlassDelightContent.registerBlock();
        GlassDelightContent.CreativeTab();
        GlassDelightContent.registerBlockEntityType();
    }

}
