package com.skniro.glass_delight.datagen;

import com.skniro.glass_delight.GlassDelight;
import com.skniro.glass_delight.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class MapleSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public MapleSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(GlassDelight.Maple_Group,"枫");

        //Glass
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS,"白色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB,"白色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB,"橘色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS,"橘色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB,"品红色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS,"品红色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,"淡蓝色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,"淡蓝色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB,"黄色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS,"黄色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_SLAB,"黄绿色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS,"黄绿色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_SLAB,"粉红色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS,"粉红色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB,"灰色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS,"灰色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,"淡灰色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,"淡灰色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB,"青色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS,"青色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB,"紫色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS,"紫色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB,"蓝色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS,"蓝色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB,"棕色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS,"棕色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB,"绿色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS,"绿色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_SLAB,"红色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_STAIRS,"红色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB,"黑色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS,"黑色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.GLASS_SLAB,"玻璃台阶");
        translationBuilder.add(MapleBlocks.GLASS_STAIRS,"玻璃楼梯");

        //Concrete
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_SLAB,"白色混凝土台阶");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_STAIRS,"白色混凝土楼梯");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_SLAB,"橙色混凝土台阶");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_STAIRS,"橙色混凝土楼梯");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_SLAB,"品红色混凝土台阶");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_STAIRS,"品红色混凝土楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB,"淡蓝色混凝土台阶");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS,"淡蓝色混凝土楼梯");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_SLAB,"黄色混凝土台阶");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_STAIRS,"黄色混凝土楼梯");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_SLAB,"黄绿色混凝土台阶");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_STAIRS,"黄绿色混凝土楼梯");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_SLAB,"枫木混凝土台阶");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_STAIRS,"枫木混凝土楼梯");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_SLAB,"灰色混凝土台阶");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_STAIRS,"灰色混凝土楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB,"淡灰色混凝土台阶");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS,"淡灰色混凝土楼梯");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_SLAB,"青色混凝土台阶");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_STAIRS,"青色混凝土楼梯");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_SLAB,"紫色混凝土台阶");;
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_STAIRS,"紫色混凝土楼梯");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_SLAB,"蓝色混凝土台阶");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_STAIRS,"蓝色混凝土楼梯");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_SLAB,"棕色混凝土台阶");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_STAIRS,"棕色混凝土楼梯");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_SLAB,"绿色混凝土台阶");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_STAIRS,"绿色混凝土楼梯");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_SLAB,"红色混凝土台阶");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_STAIRS,"红色混凝土楼梯");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_SLAB,"黑色混凝土台阶");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_STAIRS,"黑色混凝土楼梯");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/glass_delight/lang/zh_cn.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
