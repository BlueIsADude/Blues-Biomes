package net.bluethedude.bluesbiomes.blocks;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.bluethedude.bluesbiomes.blocks.custom.ChargeberryWireBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
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
    public static final Block VOLTSTONE_STAIRS = registerBlock("voltstone_stairs",
            new StairsBlock(BBBlocks.VOLTSTONE.getDefaultState(), AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block VOLTSTONE_SLAB = registerBlock("voltstone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
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
    public static final Block POLISHED_VOLTSTONE_STAIRS = registerBlock("polished_voltstone_stairs",
            new StairsBlock(BBBlocks.POLISHED_VOLTSTONE.getDefaultState(), AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block POLISHED_VOLTSTONE_SLAB = registerBlock("polished_voltstone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block POLISHED_VOLTSTONE_WALL = registerBlock("polished_voltstone_wall",
            new WallBlock(AbstractBlock.Settings.create()
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
    public static final Block VOLTSTONE_BRICK_STAIRS = registerBlock("voltstone_brick_stairs",
            new StairsBlock(BBBlocks.VOLTSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block VOLTSTONE_BRICK_SLAB = registerBlock("voltstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            )
    );
    public static final Block VOLTSTONE_BRICK_WALL = registerBlock("voltstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
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
    public static final Block CHARGEBERRY_WIRE = registerItemlessBlock("chargeberry_wire",
            new ChargeberryWireBlock(AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .sounds(BlockSoundGroup.HONEY)
            )
    );

    public static final Block MEAT_HOOK = registerItemlessBlock("meat_hook",
            new HeavyCoreBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.IRON_GRAY)
                    .instrument(NoteBlockInstrument.SNARE)
                    .sounds(BlockSoundGroup.HEAVY_CORE)
                    .strength(10.0F, 1200.0F)
                    .pistonBehavior(PistonBehavior.NORMAL)
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
