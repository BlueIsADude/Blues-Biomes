package net.bluethedude.bluesbiomes.items;

import net.bluethedude.bluesbiomes.BluesBiomes;
import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.bluethedude.bluesbiomes.items.custom.SickleItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class BBItems {
    public static final Item BOULDER_SEED = registerItem("boulder_seed", new Item(new Item.Settings()));
    public static final Item ROASTED_BOULDER_SEED = registerItem("roasted_boulder_seed",
            new Item(new Item.Settings().food(BBFoodComponents.ROASTED_BOULDER_SEED)));
    public static final Item BOULDERWOOD_HAMMER = registerItem("boulderwood_hammer", new Item(new Item.Settings()));

    public static final Item CHARGEBERRIES = registerItem("chargeberries",
            new Item(new Item.Settings()
                    .food(BBFoodComponents.CHARGEBERRIES)
            ));
    public static final Item CHARGEBERRY_MUSH = registerItem("chargeberry_mush",
            new AliasedBlockItem(BBBlocks.CHARGEBERRY_WIRE, new Item.Settings()));
    public static final Item BLITZ_ROD = registerItem("blitz_rod", new Item(new Item.Settings()));
    public static final Item BLITZ_POWDER = registerItem("blitz_powder", new Item(new Item.Settings()));
    public static final Item PLASMA_CREAM = registerItem("plasma_cream", new Item(new Item.Settings()));
    public static final Item MEAT_HOOK = registerItem("meat_hook",
            new AliasedBlockItem(BBBlocks.MEAT_HOOK, new Item.Settings()
                    .rarity(Rarity.EPIC)
            ));
    public static final Item SICKLE = registerItem("sickle",
            new SickleItem(new Item.Settings()
                    .rarity(Rarity.EPIC)
                    .maxDamage(500)
                    .component(DataComponentTypes.TOOL, SickleItem.createToolComponent())
                    .attributeModifiers(SickleItem.createAttributeModifiers())
            ));

    public static final Item BLOPPO = registerItem("bloppo", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BluesBiomes.MOD_ID, name), item);
    }

    public static void registerBBItems() {
        BluesBiomes.LOGGER.info("Registering Mod Items for " + BluesBiomes.MOD_ID);
    }
}
