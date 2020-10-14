package com.ticticboooom.rocketrymod.item.group;

import com.ticticboooom.rocketrymod.init.ItemTypes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static final ItemGroup ITEMS_TAB = new ItemGroup("rokkitmod_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemTypes.BASIC_PROCESSOR.get(), 1);
        }
    };
    public static final ItemGroup BLOCKS_TAB = new ItemGroup("rokkitmod_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemTypes.NICKEL_ORE.get(), 1);
        }
    };
}
