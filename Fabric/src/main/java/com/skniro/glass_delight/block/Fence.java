package com.skniro.glass_delight.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.sound.BlockSoundGroup;

public class Fence {



    private static Block registerGlassFence(String color) {
        return registerBlock(color + "_stained_glass_fence",
                new FenceBlock(AbstractBlock.Settings.create()
                        .mapColor(Blocks.getRegisteredBlock(color + "_stained_glass").getDefaultMapColor())
                        .strength(0.3F)
                        .nonOpaque()
                        .sounds(BlockSoundGroup.GLASS)),
                Maple.Maple_Group);
    }

    private static Block registerGlassFenceGate(String color) {
        return registerBlock(color + "_stained_glass_fence_gate",
                new FenceGateBlock(MapleSignTypes.OAK, AbstractBlock.Settings.create()
                        .mapColor(Blocks.getRegisteredBlock(color + "_stained_glass").getDefaultMapColor())
                        .strength(0.3F)
                        .nonOpaque()
                        .sounds(BlockSoundGroup.GLASS)),
                Maple.Maple_Group);
    }


// 依次添加其他颜色


}
