package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.world.biome.MapleBiomeKeys;
import com.skniro.glass_delight.world.feature.MapleConfiguredFeatures;
import com.skniro.glass_delight.world.feature.MaplePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class MapleDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MapleModelProvider::new);
        pack.addProvider(MapleSimplifiedChineseLanguageProvider::new);
        //pack.addProvider(MapleTraditionalChineseLanguageProvider::new);
        pack.addProvider(MapleEnglishLanguageProvider::new);
        pack.addProvider(MapleItemTagGeneration::new);
        pack.addProvider(MapleBlockTagGeneration::new);
        pack.addProvider(MapleLootTableGenerator::new);
        pack.addProvider(MapleRecipeGeneration::new);
        pack.addProvider(MapleWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, MapleConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, MaplePlacedFeatures::bootstrap);
        registryBuilder.add(Registries.BIOME, MapleBiomeKeys::bootstrap);
    }
}
