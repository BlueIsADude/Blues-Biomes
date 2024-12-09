package net.bluethedude.bluesbiomes.items;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BBItemGroups {

    public static final ItemGroup BLUES_BIOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BluesBiomes.MOD_ID, "blues_biomes_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(BBItems.BLOPPO))
                    .displayName(Text.translatable("itemgroup.bluesbiomes.blues_biomes_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(BBItems.BOULDER_SEED);
                        entries.add(BBItems.ROASTED_BOULDER_SEED);
                        entries.add(BBItems.BOULDERWOOD_HAMMER);

                        entries.add(BBBlocks.VOLTSTONE);
                        entries.add(BBBlocks.VOLTSTONE_STAIRS);
                        entries.add(BBBlocks.VOLTSTONE_SLAB);
                        entries.add(BBBlocks.POLISHED_VOLTSTONE);
                        entries.add(BBBlocks.POLISHED_VOLTSTONE_STAIRS);
                        entries.add(BBBlocks.POLISHED_VOLTSTONE_SLAB);
                        entries.add(BBBlocks.POLISHED_VOLTSTONE_WALL);
                        entries.add(BBBlocks.VOLTSTONE_BRICKS);
                        entries.add(BBBlocks.VOLTSTONE_BRICK_STAIRS);
                        entries.add(BBBlocks.VOLTSTONE_BRICK_SLAB);
                        entries.add(BBBlocks.VOLTSTONE_BRICK_WALL);
                        entries.add(BBBlocks.CHISELED_VOLTSTONE_BRICKS);

                        entries.add(BBItems.CHARGEBERRIES);
                        entries.add(BBItems.CHARGEBERRY_MUSH);
                        entries.add(BBItems.BLITZ_ROD);
                        entries.add(BBItems.BLITZ_POWDER);
                        entries.add(BBItems.PLASMA_CREAM);
                        entries.add(BBItems.SICKLE);
                    }).build());

    public static void registerBBItemGroups() {
        BluesBiomes.LOGGER.info("Registering Mod Item Groups for " + BluesBiomes.MOD_ID);
    }
}
