package net.bluethedude.bluesbiomes.blocks;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BBBlocks {
    public static final Block VOLTSTONE = registerBlock("voltstone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block POLISHED_VOLTSTONE = registerBlock("polished_voltstone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block VOLTSTONE_BRICKS = registerBlock("voltstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block CHISELED_VOLTSTONE_BRICKS = registerBlock("chiseled_voltstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BluesBiomes.MOD_ID, name), block);
    }

    private static Block registerItemlessBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BluesBiomes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BluesBiomes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBBBlocks() {
        BluesBiomes.LOGGER.info("Registering Mod Blocks for " + BluesBiomes.MOD_ID);
    }
}
