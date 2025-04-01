package com.skniro.glass_delight.client.renderer;

import com.skniro.glass_delight.entity.furniture.ChairEntity;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ChairRenderer extends EntityRenderer<ChairEntity> {

    public ChairRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public ResourceLocation getTexture(ChairEntity entity) {
        return null;
    }
    @Override
    public boolean shouldRender(ChairEntity livingEntity, Frustum camera, double camX, double camY, double camZ) {
        return true;
    }


}