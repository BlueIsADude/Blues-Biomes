package net.bluethedude.bluesbiomes;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.bluethedude.bluesbiomes.items.BBItemGroups;
import net.bluethedude.bluesbiomes.items.BBItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BluesBiomes implements ModInitializer {
	public static final String MOD_ID = "bluesbiomes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BBItemGroups.registerBBItemGroups();

		BBItems.registerBBItems();
		BBBlocks.registerBBBlocks();
	}
}