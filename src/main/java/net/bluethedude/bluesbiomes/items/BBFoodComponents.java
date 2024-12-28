package net.bluethedude.bluesbiomes.items;

import net.bluethedude.bluesbiomes.effects.BBEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class BBFoodComponents {
    public static final FoodComponent ROASTED_BOULDER_SEED = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 80, 2), 0.15f)
            .build();
    public static final FoodComponent CHARGEBERRIES = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(BBEffects.ELECTRIFIED, 40, 0), 0.15f)
            .build();
}
