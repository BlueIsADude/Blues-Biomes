package net.bluethedude.bluesbiomes.sounds;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class BBSounds {
    public static final SoundEvent SICKLE_CHARGED = registerSoundEvent("sickle_charged");
    public static final SoundEvent SICKLE_DECAY = registerSoundEvent("sickle_decay");
    public static final SoundEvent SICKLE_SHOCK = registerSoundEvent("sickle_shock");
    public static final SoundEvent SICKLE_SHOCK_STORM = registerSoundEvent("sickle_shock_storm");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(BluesBiomes.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerBBSounds() {
        BluesBiomes.LOGGER.info("Registering Mod Sounds for " + BluesBiomes.MOD_ID);
    }
}
