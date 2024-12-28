package net.bluethedude.bluesbiomes.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ElectrifiedEffect extends StatusEffect {
    public ElectrifiedEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getMovement().horizontalLengthSquared() == 0) {
            entity.damage(entity.getDamageSources().lightningBolt(), 0.25F);
        } else {
            entity.damage(entity.getDamageSources().lightningBolt(), 1.0F);
        }
        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i =  15 >> amplifier;
        return i > 0 ? duration % i == 0 : true;
    }
}
