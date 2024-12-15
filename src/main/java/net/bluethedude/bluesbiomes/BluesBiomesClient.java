package net.bluethedude.bluesbiomes;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.bluethedude.bluesbiomes.blocks.custom.ChargeberryWireBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.MathHelper;

public class BluesBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.CHARGEBERRY_WIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BBBlocks.MEAT_HOOK, RenderLayer.getCutout());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            int power = state.get(ChargeberryWireBlock.POWER);
            float float_1 = (float)power / 15.0F;
            float float_2 = float_1 * 0.6F + 0.4F;
            if (power == 0) {
                float_2 = 0.3F;
            }

            float float_3 = float_1 * float_1 * 0.7F - 0.5F;
            if (float_3 < 0.0F) {
                float_3 = 0.0F;
            }

            int int_2 = MathHelper.clamp((int)(float_3 * 255.0F), 0, 255);
            int int_3 = MathHelper.clamp((int)(float_2 * 255.0F), 0, 255);
            int int_4 = MathHelper.clamp((int)(float_2 * 255.0F), 0, 255);
            return -16777216 | int_2 << 16 | int_3 << 8 | int_4;
        }, BBBlocks.CHARGEBERRY_WIRE);
    }
}
