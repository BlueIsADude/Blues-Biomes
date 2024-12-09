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
        addDrop(BBBlocks.VOLTSTONE_STAIRS);
        addDrop(BBBlocks.VOLTSTONE_SLAB, slabDrops(BBBlocks.VOLTSTONE_SLAB));
        addDrop(BBBlocks.POLISHED_VOLTSTONE);
        addDrop(BBBlocks.POLISHED_VOLTSTONE_STAIRS);
        addDrop(BBBlocks.POLISHED_VOLTSTONE_SLAB, slabDrops(BBBlocks.POLISHED_VOLTSTONE_SLAB));
        addDrop(BBBlocks.POLISHED_VOLTSTONE_WALL);
        addDrop(BBBlocks.VOLTSTONE_BRICKS);
        addDrop(BBBlocks.VOLTSTONE_BRICK_STAIRS);
        addDrop(BBBlocks.VOLTSTONE_BRICK_SLAB, slabDrops(BBBlocks.VOLTSTONE_BRICK_SLAB));
        addDrop(BBBlocks.VOLTSTONE_BRICK_WALL);
        addDrop(BBBlocks.CHISELED_VOLTSTONE_BRICKS);
    }
}
