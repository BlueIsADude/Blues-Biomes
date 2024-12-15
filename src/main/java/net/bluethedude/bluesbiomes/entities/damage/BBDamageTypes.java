package net.bluethedude.bluesbiomes.entities.damage;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
public class BBDamageTypes {
    public static final RegistryKey<DamageType> ELECTROCUTION = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(BluesBiomes.MOD_ID, "electrocution"));

    public static DamageSource of(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key));
    }

    public static void registerBBDamageTypes() {
        BluesBiomes.LOGGER.info("Registering Mod Damage Types for " + BluesBiomes.MOD_ID);
    }
}
