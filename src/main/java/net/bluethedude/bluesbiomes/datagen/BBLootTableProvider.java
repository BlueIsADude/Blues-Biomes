package net.bluethedude.bluesbiomes.datagen;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BBLootTableProvider extends FabricBlockLootTableProvider {
    public BBLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BBBlocks.VOLTSTONE);
        addDrop(BBBlocks.POLISHED_VOLTSTONE);
        addDrop(BBBlocks.VOLTSTONE_BRICKS);
        addDrop(BBBlocks.CHISELED_VOLTSTONE_BRICKS);
    }
}
