package com.skniro.glass_delight.block.init;

import com.skniro.glass_delight.block.entity.MapleSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MapleStandingSignBlock extends StandingSignBlock {
    public MapleStandingSignBlock(Properties p_56990_, WoodType p_56991_) {
        super(p_56991_, p_56990_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MapleSignBlockEntity(pPos, pState);
    }
}