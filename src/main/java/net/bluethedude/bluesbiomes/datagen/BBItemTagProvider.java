package net.bluethedude.bluesbiomes.datagen;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.bluethedude.bluesbiomes.items.BBItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BBItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public BBItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(BBBlocks.VOLTSTONE_STAIRS.asItem())
                .add(BBBlocks.POLISHED_VOLTSTONE_STAIRS.asItem())
                .add(BBBlocks.VOLTSTONE_BRICK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(BBBlocks.VOLTSTONE_SLAB.asItem())
                .add(BBBlocks.POLISHED_VOLTSTONE_SLAB.asItem())
                .add(BBBlocks.VOLTSTONE_BRICK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(BBBlocks.POLISHED_VOLTSTONE_WALL.asItem())
                .add(BBBlocks.VOLTSTONE_BRICK_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(BBItems.SICKLE);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(BBItems.SICKLE);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(BBItems.SICKLE);
    }
}
