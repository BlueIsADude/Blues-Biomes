package net.bluethedude.bluesbiomes.datagen;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.bluethedude.bluesbiomes.items.BBItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class BBModelProvider extends FabricModelProvider {
    public BBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerMirrorable(BBBlocks.VOLTSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(BBBlocks.POLISHED_VOLTSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(BBBlocks.VOLTSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BBBlocks.CHISELED_VOLTSTONE_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(BBItems.BOULDER_SEED, Models.GENERATED);
        itemModelGenerator.register(BBItems.ROASTED_BOULDER_SEED, Models.GENERATED);
        itemModelGenerator.register(BBItems.BOULDERWOOD_HAMMER, Models.HANDHELD_MACE);

        itemModelGenerator.register(BBItems.CHARGEBERRIES, Models.GENERATED);
        itemModelGenerator.register(BBItems.CHARGEBERRY_MUSH, Models.GENERATED);
        itemModelGenerator.register(BBItems.BLITZ_ROD, Models.HANDHELD);
        itemModelGenerator.register(BBItems.BLITZ_POWDER, Models.GENERATED);
        itemModelGenerator.register(BBItems.PLASMA_CREAM, Models.GENERATED);
        itemModelGenerator.register(BBItems.SICKLE, Models.HANDHELD);

        itemModelGenerator.register(BBItems.BLOPPO, Models.GENERATED);
    }
}