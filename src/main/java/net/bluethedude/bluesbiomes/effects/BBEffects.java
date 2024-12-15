package net.bluethedude.bluesbiomes.effects;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class BBEffects {
    public static final RegistryEntry<StatusEffect> ELECTRIFIED = registerStatusEffect("electrified",
            new ElectrifiedEffect(StatusEffectCategory.HARMFUL, 0x46f1ca));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(BluesBiomes.MOD_ID, name), statusEffect);
    }

    public static void registerBBEffects() {
        BluesBiomes.LOGGER.info("Registering Mod Effects for " + BluesBiomes.MOD_ID);
    }
}
