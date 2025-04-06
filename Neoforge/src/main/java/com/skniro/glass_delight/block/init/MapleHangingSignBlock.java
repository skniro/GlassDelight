package com.skniro.glass_delight.block.init;

import com.skniro.glass_delight.block.entity.MapleHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
public class MapleHangingSignBlock extends CeilingHangingSignBlock {
    public MapleHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pType, pProperties);
    }
/*    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MapleHangingSignBlockEntity(pPos, pState);
    }*/
}