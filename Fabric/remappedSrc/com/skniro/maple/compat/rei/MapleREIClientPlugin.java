package com.skniro.glass_delight.compat.rei;

import com.skniro.glass_delight.block.MapleBlocks;
import com.skniro.glass_delight.client.gui.screen.ingame.MapleJuicerBlockScreen;
import com.skniro.glass_delight.recipe.MapleJuicerCraftingRecipe;
import com.skniro.glass_delight.recipe.MapleRecipeType;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;

public class MapleREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new MapleJuicerCraftingCategory());
        registry.addWorkstations(MapleJuicerCraftingCategory.UID, EntryStacks.of(MapleBlocks.Maple_Juicer_Block));
    }
    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(MapleJuicerCraftingRecipe.class, MapleRecipeType.Maple_JUIER_TYPE,
                MapleJuicerCraftingDisplay::new);
    }
    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(73, 34, 22, 16), MapleJuicerBlockScreen.class,
                MapleJuicerCraftingCategory.UID);
    }
}