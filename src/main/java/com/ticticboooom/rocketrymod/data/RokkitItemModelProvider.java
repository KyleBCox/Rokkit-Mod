package com.ticticboooom.rocketrymod.data;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.init.BlockTypes;
import com.ticticboooom.rocketrymod.init.ItemTypes;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RokkitItemModelProvider extends ItemModelProvider {
    public RokkitItemModelProvider(DataGenerator generator,  ExistingFileHelper existingFileHelper) {
        super(generator, RokkitMod.MOD_ID, existingFileHelper);
    }


    private ResourceLocation getItemLoc(Item item) {
        final ResourceLocation name = item.getRegistryName();
        assert name != null;
        return this.getTextureLoc("item/", name);
    }

    private ResourceLocation getBlockLoc(Block block) {
        final ResourceLocation name = block.getRegistryName();
        assert name != null;
        return this.getTextureLoc("block/", name);
    }

    private void registerBasicItemModel(Item item) {
        this.registerItemModel(item, "item/generated", this.getItemLoc(item));
    }

    private ResourceLocation getTextureLoc(String root, ResourceLocation name) {
        return new ResourceLocation(name.getNamespace(), root + name.getPath());
    }
    private void registerItemModel(Item item, String parent, ResourceLocation texture) {
        this.getBuilder(item.getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(parent)).texture("layer0", texture);
    }

    private void registerBlockItem(Item item) {
        assert item instanceof BlockItem;
        final BlockItem blockItem = (BlockItem) item;
        final Block block = blockItem.getBlock();
        this.getBuilder(item.getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(this.getBlockLoc(block)));
    }

    @Override
    protected void registerModels() {
        this.registerBasicItemModel(ItemTypes.BASIC_PROCESSOR.get());
        this.registerBasicItemModel(ItemTypes.GOOD_PROCESSOR.get());
        this.registerBasicItemModel(ItemTypes.NICKEL_INGOT.get());
        this.registerBasicItemModel(ItemTypes.COPPER_INGOT.get());
        this.registerBasicItemModel(ItemTypes.SILVER_INGOT.get());

        // Block Items
        this.registerBlockItem(ItemTypes.NICKEL_ORE.get());
        this.registerBlockItem(ItemTypes.COPPER_ORE.get());
        this.registerBlockItem(ItemTypes.SILVER_ORE.get());


    }
}
