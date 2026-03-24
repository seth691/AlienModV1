package com.zura.alienmod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BoomStaffItem extends Item {

 //use tags


    public BoomStaffItem(Properties properties) {
        super(properties);

    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        if(!level.isClientSide) {
            level.explode(null, pos.getX(), pos.getY(), pos.getZ(), 16.0F, Level.ExplosionInteraction.BLOCK);
        }
        return InteractionResult.SUCCESS;
    }

}
