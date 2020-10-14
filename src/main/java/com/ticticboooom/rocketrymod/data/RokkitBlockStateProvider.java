package com.ticticboooom.rocketrymod.data;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.init.BlockTypes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RokkitBlockStateProvider extends BlockStateProvider {

    public RokkitBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, RokkitMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(BlockTypes.COPPER_ORE.get());
        this.simpleBlock(BlockTypes.NICKEL_ORE.get());
        this.simpleBlock(BlockTypes.SILVER_ORE.get());
    }
}
