package com.skniro.glass_delight;

import com.skniro.glass_delight.block.MapleBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GlassDelight implements ModInitializer {
    public static final String MOD_ID = "glass_delight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final RegistryKey<ItemGroup> Maple_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "glass_delight_group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, Maple_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(Blocks.GLASS))
                .displayName(Text.translatable("itemGroup.glass_delight.glass_delight_group"))
                .build()); // build() no longer registers by itself
        GlassDelightContent.registerItem();
        GlassDelightContent.registerBlock();
        GlassDelightContent.CreativeTab();
        GlassDelightContent.registerBlockEntityType();
    }

}
