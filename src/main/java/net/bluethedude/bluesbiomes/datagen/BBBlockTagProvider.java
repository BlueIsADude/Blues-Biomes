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
                .add(BBBlocks.POLISHED_VOLTSTONE)
                .add(BBBlocks.VOLTSTONE_BRICKS)
                .add(BBBlocks.CHISELED_VOLTSTONE_BRICKS);
    }
}
