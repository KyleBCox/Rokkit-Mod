package com.ticticboooom.rocketrymod.init;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.item.group.ItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemTypes {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RokkitMod.MOD_ID);

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> BASIC_PROCESSOR = ITEMS.register("basic_processor", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_TAB)));
    public static final RegistryObject<Item> GOOD_PROCESSOR = ITEMS.register("good_processor", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_TAB)));

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_TAB)));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_TAB)));

    public static final RegistryObject<Item> NICKEL_ORE = ITEMS.register("nickel_ore", () -> new BlockItem(BlockTypes.NICKEL_ORE.get(), new Item.Properties().group(ItemGroups.BLOCKS_TAB)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockTypes.COPPER_ORE.get(), new Item.Properties().group(ItemGroups.BLOCKS_TAB)));
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(BlockTypes.SILVER_ORE.get(), new Item.Properties().group(ItemGroups.BLOCKS_TAB)));
}
