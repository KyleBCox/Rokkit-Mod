package com.ticticboooom.rocketrymod.worldgen;

import com.ticticboooom.rocketrymod.RokkitMod;
import com.ticticboooom.rocketrymod.init.BlockTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = RokkitMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Ores {

//    public static final ConfiguredFeature<?, ?> COPPER_ORE =
    @SubscribeEvent
    public static void generateOres(BiomeLoadingEvent event) {
        Biome.Category category = event.getCategory();
        if (category == Biome.Category.THEEND || category == Biome.Category.NETHER) {
            return;
        }

        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, register("copper_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockTypes.COPPER_ORE.get().getDefaultState(), 9)))
                .func_242733_d(64)
                .func_242728_a()
                .func_242731_b(20));

        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, register("nickel_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockTypes.NICKEL_ORE.get().getDefaultState(), 9)))
                .func_242733_d(64)
                .func_242728_a()
                .func_242731_b(20));

        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockTypes.SILVER_ORE.get().getDefaultState(), 9)))
                .func_242733_d(32)
                .func_242728_a()
                .func_242731_b(20));
    }

    private static ConfiguredFeature<?, ?> register(final String name, final ConfiguredFeature<?, ?> feature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, RokkitMod.MOD_ID + ":" + name, feature);
    }
}
