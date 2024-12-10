package net.bluethedude.bluesbiomes.blocks.custom;

import net.bluethedude.bluesbiomes.blocks.BBBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class ChargeberryWireBlock extends RedstoneWireBlock {
    public ChargeberryWireBlock(Settings settings) {
        super(settings);
    }

    protected static boolean connectsTo(BlockState state) {
        return connectsTo(state, null);
    }

    protected static boolean connectsTo(BlockState state, @Nullable Direction dir) {
        if (state.isOf(BBBlocks.CHARGEBERRY_WIRE)) {
            return true;
        } else if (state.isOf(Blocks.REPEATER)) {
            Direction direction = state.get(RepeaterBlock.FACING);
            return direction == dir || direction.getOpposite() == dir;
        } else {
            return state.isOf(Blocks.OBSERVER) ? dir == state.get(ObserverBlock.FACING) : state.emitsRedstonePower() && dir != null;
        }
    }
}
