package net.bluethedude.bluesbiomes.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.bluethedude.bluesbiomes.items.BBItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @ModifyVariable(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;", ordinal = 1), name = "bl4")
    private boolean changeIfToDoSweeping(boolean original, @Local(name = "itemStack") ItemStack itemStack) {
        if (itemStack.isOf(BBItems.SICKLE)) {
            return true;
        }
        return original;
    }
}
