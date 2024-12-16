package net.bluethedude.bluesbiomes.fluid;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BBFluids {

    public static FlowableFluid FLOWING_PLASMA = Registry.register(Registries.FLUID,
            Identifier.of(BluesBiomes.MOD_ID, "flowing_plasma"), new PlasmaFluid.Flowing());
    public static FlowableFluid PLASMA = Registry.register(Registries.FLUID,
            Identifier.of(BluesBiomes.MOD_ID, "plasma"), new PlasmaFluid());


    public static void registerBBFluids() {
        BluesBiomes.LOGGER.info("Registering Mod fluids for " + BluesBiomes.MOD_ID);
    }
}
