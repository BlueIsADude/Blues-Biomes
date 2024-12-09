package net.bluethedude.bluesbiomes;

import net.bluethedude.bluesbiomes.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BluesBiomesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BBBlockTagProvider::new);
		pack.addProvider(BBItemTagProvider::new);
		pack.addProvider(BBLootTableProvider::new);
		pack.addProvider(BBModelProvider::new);
		pack.addProvider(BBRecipeProvider::new);
	}
}
