package net.bluethedude.bluesbiomes.datagen;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BBBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BBBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BBBlocks.VOLTSTONE)
                .add(BBBlocks.VOLTSTONE_STAIRS)
                .add(BBBlocks.VOLTSTONE_SLAB)
                .add(BBBlocks.POLISHED_VOLTSTONE)
                .add(BBBlocks.POLISHED_VOLTSTONE_STAIRS)
                .add(BBBlocks.POLISHED_VOLTSTONE_SLAB)
                .add(BBBlocks.POLISHED_VOLTSTONE_WALL)
                .add(BBBlocks.VOLTSTONE_BRICKS)
                .add(BBBlocks.VOLTSTONE_BRICK_STAIRS)
                .add(BBBlocks.VOLTSTONE_BRICK_SLAB)
                .add(BBBlocks.VOLTSTONE_BRICK_WALL)
                .add(BBBlocks.CHISELED_VOLTSTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(BBBlocks.VOLTSTONE_STAIRS)
                .add(BBBlocks.POLISHED_VOLTSTONE_STAIRS)
                .add(BBBlocks.VOLTSTONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(BBBlocks.VOLTSTONE_SLAB)
                .add(BBBlocks.POLISHED_VOLTSTONE_SLAB)
                .add(BBBlocks.VOLTSTONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BBBlocks.POLISHED_VOLTSTONE_WALL)
                .add(BBBlocks.VOLTSTONE_BRICK_WALL);
    }
}
