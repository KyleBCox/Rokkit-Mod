package com.ticticboooom.rocketrymod.data.loot;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.init.BlockTypes;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.stream.Collectors;

public class RokkitBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {
        this.registerDropSelfLootTable(BlockTypes.COPPER_ORE.get());
        this.registerDropSelfLootTable(BlockTypes.NICKEL_ORE.get());
        this.registerDropSelfLootTable(BlockTypes.SILVER_ORE.get());
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(it -> Objects.equals(it.getRegistryName().getNamespace(), RokkitMod.MOD_ID)).collect(Collectors.toSet());
    }

}
