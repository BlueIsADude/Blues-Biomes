package net.bluethedude.bluesbiomes.entities.damage;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BBDamageTypes {
    public static final RegistryKey<DamageType> ELECTROCUTION = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(BluesBiomes.MOD_ID, "electrocution"));



    public static DamageSource create(World world, RegistryKey<DamageType> key, @Nullable Entity source, @Nullable Entity attacker) {
        return new DamageSource(world.getRegistryManager().getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE).getOrThrow(key), source, attacker);
    }

    public static DamageSource create(World world, RegistryKey<DamageType> key, @Nullable Entity attacker) {
        return new DamageSource(world.getRegistryManager().getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE).getOrThrow(key), attacker);
    }

    public static DamageSource create(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE).getOrThrow(key));
    }

    public static void registerBBDamageTypes() {
        BluesBiomes.LOGGER.info("Registering Mod Damage Types for " + BluesBiomes.MOD_ID);
    }
}
