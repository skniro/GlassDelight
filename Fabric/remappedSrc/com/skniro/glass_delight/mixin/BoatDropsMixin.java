package com.skniro.glass_delight.mixin;

import com.skniro.glass_delight.entity.MapleBoatType;
import net.minecraft.world.entity.vehicle.Boat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

@Mixin(Boat.class)
public class BoatDropsMixin {
/*    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.CHERRY) {
            ci.setReturnValue(MapleItems.CHERRY_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.BAMBOO) {
            ci.setReturnValue(MapleItems.BAMBOO_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == MapleBoatType.MAPLE) {
            ci.setReturnValue(MapleItems.MAPLE_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == MapleBoatType.GINKGO) {
            ci.setReturnValue(MapleItems.GINKGO_BOAT);
        }
    }*/

/*    @Inject(method = "getMountedHeightOffset",at =@At("HEAD"),cancellable = true)
    public void MountedHeightOffset(CallbackInfoReturnable<Double> cir){
        cir.setReturnValue(((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.BAMBOO ? 0.25D : -0.1D);
    }*/
}
