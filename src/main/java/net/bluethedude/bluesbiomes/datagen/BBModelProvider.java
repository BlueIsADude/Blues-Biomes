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

        BlockStateModelGenerator.BlockTexturePool voltstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(BBBlocks.VOLTSTONE);
        voltstonePool.stairs(BBBlocks.VOLTSTONE_STAIRS);
        voltstonePool.slab(BBBlocks.VOLTSTONE_SLAB);

        BlockStateModelGenerator.BlockTexturePool polishedVoltstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(BBBlocks.POLISHED_VOLTSTONE);
        polishedVoltstonePool.stairs(BBBlocks.POLISHED_VOLTSTONE_STAIRS);
        polishedVoltstonePool.slab(BBBlocks.POLISHED_VOLTSTONE_SLAB);
        polishedVoltstonePool.wall(BBBlocks.POLISHED_VOLTSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool voltstoneBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(BBBlocks.VOLTSTONE_BRICKS);
        voltstoneBrickPool.stairs(BBBlocks.VOLTSTONE_BRICK_STAIRS);
        voltstoneBrickPool.slab(BBBlocks.VOLTSTONE_BRICK_SLAB);
        voltstoneBrickPool.wall(BBBlocks.VOLTSTONE_BRICK_WALL);

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
        itemModelGenerator.register(BBItems.MEAT_HOOK, Models.HANDHELD);
        itemModelGenerator.register(BBItems.SICKLE, Models.HANDHELD_MACE);

        itemModelGenerator.register(BBItems.BLOPPO, Models.GENERATED);
    }
}
