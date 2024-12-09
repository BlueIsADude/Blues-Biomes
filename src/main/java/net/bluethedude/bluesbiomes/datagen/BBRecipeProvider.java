package net.bluethedude.bluesbiomes.datagen;

import net.bluethedude.bluesbiomes.items.BBItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BBRecipeProvider extends FabricRecipeProvider {
    public BBRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BBItems.CHARGEBERRY_MUSH, 1)
                .input(BBItems.CHARGEBERRIES)
                .criterion(hasItem(BBItems.CHARGEBERRIES), conditionsFromItem(BBItems.CHARGEBERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BBItems.BLITZ_POWDER, 2)
                .input(BBItems.BLITZ_ROD)
                .criterion(hasItem(BBItems.BLITZ_ROD), conditionsFromItem(BBItems.BLITZ_ROD))
                .offerTo(exporter);

        
    }
}
