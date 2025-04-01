package com.skniro.glass_delight.item;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.MapleBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.skniro.glass_delight.block.MapleBlocks.MAPLE_LOG;
import static com.skniro.glass_delight.item.MapleItems.MapleSyrup;

public class MapleCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GlassDelight.MODID);

    public static final RegistryObject<CreativeModeTab> Maple_Group = CREATIVE_MODE_TABS.register("maple_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MAPLE_LOG.get()))
                    .title(Component.translatable("itemGroup.maple.maple_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MapleBlocks.MAPLE_LOG.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(MapleBlocks.MAPLE_WOOD.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(MapleBlocks.MAPLE_SAPLING.get());
                        pOutput.accept(MapleBlocks.RED_MAPLE_SAPLING.get());
                        pOutput.accept(MapleBlocks.SAKURA_SAPLING.get());
                        pOutput.accept(MapleBlocks.SAKURA_CARPET.get());
                        pOutput.accept(MapleBlocks.MAPLE_LEAVES.get());
                        pOutput.accept(MapleBlocks.Maple_CARPET.get());
                        pOutput.accept(MapleBlocks.SAKURA_LEAVES.get());
                        pOutput.accept(MapleBlocks.MAPLE_PLANKS.get());
                        pOutput.accept(MapleBlocks.RED_MAPLE_LEAVES.get());
                        pOutput.accept(MapleBlocks.RED_MAPLE_CARPET.get());
                        pOutput.accept(MapleBlocks.MAPLE_BUTTON.get());
                        pOutput.accept(MapleBlocks.MAPLE_STAIRS.get());
                        pOutput.accept(MapleBlocks.MAPLE_SLAB.get());
                        pOutput.accept(MapleBlocks.MAPLE_FENCE.get());
                        pOutput.accept(MapleBlocks.MAPLE_FENCE_GATE.get());
                        pOutput.accept(MapleBlocks.MAPLE_TRAPDOOR.get());
                        pOutput.accept(MapleBlocks.MAPLE_PRESSURE_PLATE.get());
                        pOutput.accept(MapleBlocks.WHITE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.WHITE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.ORANGE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.YELLOW_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIME_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.LIME_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.PINK_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.PINK_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.GRAY_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.GRAY_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.CYAN_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.CYAN_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.PURPLE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.BLUE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.BLUE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.BROWN_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.BROWN_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.GREEN_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.GREEN_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.RED_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.RED_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.BLACK_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.BLACK_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.GLASS_STAIRS.get());

                        pOutput.accept(MapleBlocks.WHITE_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.WHITE_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.ORANGE_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.ORANGE_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.MAGENTA_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.MAGENTA_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.YELLOW_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.YELLOW_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIME_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.LIME_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.PINK_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.PINK_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.GRAY_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.GRAY_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.CYAN_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.CYAN_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.PURPLE_CONCRETE_SLAB.get());;
                        pOutput.accept(MapleBlocks.PURPLE_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.BLUE_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.BLUE_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.BROWN_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.BROWN_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.GREEN_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.GREEN_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.RED_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.RED_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.BLACK_CONCRETE_SLAB.get());
                        pOutput.accept(MapleBlocks.BLACK_CONCRETE_STAIRS.get());
                        pOutput.accept(MapleBlocks.Maple_Juicer_Block.get());
                    })
                    .build());


    public static void registerMapleCreativeModeTabs(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
