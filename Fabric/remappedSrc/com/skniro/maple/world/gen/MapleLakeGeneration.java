package com.skniro.glass_delight.world.gen;

import com.skniro.glass_delight.world.biome.MapleBiomeKeys;
import com.skniro.glass_delight.world.feature.MaplePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;

public class MapleLakeGeneration {
    public static void generateHotSpringLake() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Sakura),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS, MaplePlacedFeatures.LAKE_HOT_SPRING_SURFACE);
    }
}
