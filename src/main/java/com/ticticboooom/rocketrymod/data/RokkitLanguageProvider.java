package com.ticticboooom.rocketrymod.data;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.init.BlockTypes;
import com.ticticboooom.rocketrymod.init.ItemTypes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class RokkitLanguageProvider extends LanguageProvider {
    public RokkitLanguageProvider(DataGenerator gen, String locale) {
        super(gen, RokkitMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        // Items
        this.addItem(ItemTypes.BASIC_PROCESSOR, "Basic Processor");
        this.addItem(ItemTypes.GOOD_PROCESSOR, "Good Processor");

        this.addItem(ItemTypes.COPPER_INGOT, "Copper Ingot");
        this.addItem(ItemTypes.NICKEL_INGOT, "Nickel Ingot");
        this.addItem(ItemTypes.SILVER_INGOT, "Silver Ingot");

        // Blocks
        this.addBlock(BlockTypes.COPPER_ORE, "Copper Ore");
        this.addBlock(BlockTypes.NICKEL_ORE, "Nickel Ore");
        this.addBlock(BlockTypes.SILVER_ORE, "Silver Ore");

        this.add("itemGroup.rokkitmod_items", "Rokkit Items");
        this.add("itemGroup.rokkitmod_blocks", "Rokkit Blocks");
    }
}
