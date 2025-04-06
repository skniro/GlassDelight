package com.skniro.glass_delight.mixin;

import com.skniro.glass_delight.entity.MapleBoatType;
import net.minecraft.world.entity.vehicle.ChestBoat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

@Mixin(ChestBoat.class)
public class ChestBoatDropsMixin {
/*    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.CHERRY) {
            ci.setReturnValue(MapleItems.CHERRY_CHEST_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.BAMBOO) {
            ci.setReturnValue(MapleItems.BAMBOO_CHEST_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == MapleBoatType.MAPLE) {
            ci.setReturnValue(MapleItems.MAPLE_CHEST_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == MapleBoatType.GINKGO) {
            ci.setReturnValue(MapleItems.GINKGO_CHEST_BOAT);
        }
    }*/
}
