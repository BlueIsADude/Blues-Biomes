package net.bluethedude.bluesbiomes.effects;

import net.bluethedude.bluesbiomes.entities.damage.BBDamageTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class ElectrifiedEffect extends StatusEffect {
    public ElectrifiedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(BBDamageTypes.of(entity.getWorld(), BBDamageTypes.ELECTROCUTION), 1);
        return super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
