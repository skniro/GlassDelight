package com.skniro.glass_delight.block.init;

import com.skniro.glass_delight.block.entity.MapleSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MapleWallSignBlock extends WallSignBlock {
    public MapleWallSignBlock(Properties p_58068_, WoodType p_58069_) {
        super(p_58069_, p_58068_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MapleSignBlockEntity(pPos, pState);
    }
}