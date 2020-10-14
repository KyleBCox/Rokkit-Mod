package com.ticticboooom.rocketrymod.setup;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.data.RokkitBlockStateProvider;
import com.ticticboooom.rocketrymod.data.RokkitItemModelProvider;
import com.ticticboooom.rocketrymod.data.RokkitLanguageProvider;
import com.ticticboooom.rocketrymod.data.RokkitLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = RokkitMod.MOD_ID)
public class DataGeneration {
    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent event) {
        final DataGenerator gen = event.getGenerator();
        final ExistingFileHelper efh = event.getExistingFileHelper();
        if (event.includeClient()) {
            gen.addProvider(new RokkitLanguageProvider(gen, "en_us"));
            gen.addProvider(new RokkitItemModelProvider(gen, efh));
            gen.addProvider(new RokkitBlockStateProvider(gen, efh));
        }

        if (event.includeServer()) {
            gen.addProvider(new RokkitLootTableProvider(gen));
        }
    }
}
