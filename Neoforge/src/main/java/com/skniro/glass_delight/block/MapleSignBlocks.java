package com.skniro.glass_delight.block;

import com.skniro.glass_delight.GlassDelight;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleSignBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, GlassDelight.MODID);

    /*public static final Supplier<Block> CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), WoodType.CHERRY));
    public static final Supplier<Block> CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_LOG.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(CHERRY_SIGN.get()), WoodType.CHERRY));
    public static final Supplier<Block> Maple_SIGN = registerBlockWithoutItem("maple_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), MapleWoodTypes.MAPLE));
    public static final Supplier<Block> Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(Maple_SIGN.get()), MapleWoodTypes.MAPLE));
    public static final Supplier<Block> BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0f), WoodType.BAMBOO));
    public static final Supplier<Block> BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(BAMBOO_SIGN.get()), WoodType.BAMBOO));
   public static final Supplier<Block> GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",
           ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), MapleWoodTypes.GINKGO));
    public static final Supplier<Block> GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(GINKGO_SIGN.get()), MapleWoodTypes.GINKGO));
    public static final Supplier<Block> Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",
            ()-> new MapleHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleWoodTypes.MAPLE));
    public static final Supplier<Block> GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign",
            ()-> new MapleHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleWoodTypes.GINKGO));
    public static final Supplier<Block> GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign",
            ()-> new MapleWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(GINKGO_HANGING_SIGN.get()), MapleWoodTypes.GINKGO));
    public static final Supplier<Block> Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",
            ()-> new MapleWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(Maple_HANGING_SIGN.get()), MapleWoodTypes.MAPLE));
*/
    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void registerMapleSignBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
