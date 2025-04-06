package com.skniro.glass_delight.block.init;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
public record MapleBlockSetType(String name, SoundType soundType, SoundEvent doorClose, SoundEvent doorOpen, SoundEvent trapdoorClose, SoundEvent trapdoorOpen, SoundEvent pressurePlateClickOff, SoundEvent pressurePlateClickOn, SoundEvent buttonClickOff, SoundEvent buttonClickOn) {
    private static final Set<net.minecraft.world.level.block.state.properties.BlockSetType> VALUES = new ObjectArraySet<net.minecraft.world.level.block.state.properties.BlockSetType>();
    public static final BlockSetType GLASS = register(new BlockSetType("glass"));
    public static final BlockSetType WHITE_STAINED_GLASS = register(new BlockSetType("white_stained_glass"));
    public static final BlockSetType ORANGE_STAINED_GLASS = register(new BlockSetType("orange_stained_glass"));
    public static final BlockSetType MAGENTA_STAINED_GLASS = register(new BlockSetType("magenta_stained_glass"));
    public static final BlockSetType LIGHT_BLUE_STAINED_GLASS = register(new BlockSetType("light_blue_stained_glass"));
    public static final BlockSetType YELLOW_STAINED_GLASS = register(new BlockSetType("yellow_stained_glass"));
    public static final BlockSetType LIME_STAINED_GLASS = register(new BlockSetType("lime_stained_glass"));
    public static final BlockSetType PINK_STAINED_GLASS = register(new BlockSetType("pink_stained_glass"));
    public static final BlockSetType GRAY_STAINED_GLASS = register(new BlockSetType("gray_stained_glass"));
    public static final BlockSetType LIGHT_GRAY_STAINED_GLASS = register(new BlockSetType("light_gray_stained_glass"));
    public static final BlockSetType CYAN_STAINED_GLASS = register(new BlockSetType("cyan_stained_glass"));
    public static final BlockSetType PURPLE_STAINED_GLASS = register(new BlockSetType("purple_stained_glass"));
    public static final BlockSetType BLUE_STAINED_GLASS = register(new BlockSetType("blue_stained_glass"));
    public static final BlockSetType BROWN_STAINED_GLASS = register(new BlockSetType("brown_stained_glass"));
    public static final BlockSetType GREEN_STAINED_GLASS = register(new BlockSetType("green_stained_glass"));
    public static final BlockSetType RED_STAINED_GLASS = register(new BlockSetType("red_stained_glass"));
    public static final BlockSetType BLACK_STAINED_GLASS = register(new BlockSetType("black_stained_glass"));
    public static final BlockSetType WHITE_CONCRETE = register(new BlockSetType("white_concrete"));
    public static final BlockSetType ORANGE_CONCRETE = register(new BlockSetType("orange_concrete"));
    public static final BlockSetType MAGENTA_CONCRETE = register(new BlockSetType("magenta_concrete"));
    public static final BlockSetType LIGHT_BLUE_CONCRETE = register(new BlockSetType("light_blue_concrete"));
    public static final BlockSetType YELLOW_CONCRETE = register(new BlockSetType("yellow_concrete"));
    public static final BlockSetType LIME_CONCRETE = register(new BlockSetType("lime_concrete"));
    public static final BlockSetType PINK_CONCRETE = register(new BlockSetType("pink_concrete"));
    public static final BlockSetType GRAY_CONCRETE = register(new BlockSetType("gray_concrete"));
    public static final BlockSetType LIGHT_GRAY_CONCRETE = register(new BlockSetType("light_gray_concrete"));
    public static final BlockSetType CYAN_CONCRETE = register(new BlockSetType("cyan_concrete"));
    public static final BlockSetType PURPLE_CONCRETE = register(new BlockSetType("purple_concrete"));
    public static final BlockSetType BLUE_CONCRETE = register(new BlockSetType("blue_concrete"));
    public static final BlockSetType BROWN_CONCRETE = register(new BlockSetType("brown_concrete"));
    public static final BlockSetType GREEN_CONCRETE = register(new BlockSetType("green_concrete"));
    public static final BlockSetType RED_CONCRETE = register(new BlockSetType("red_concrete"));
    public static final BlockSetType BLACK_CONCRETE = register(new BlockSetType("black_concrete"));

    public MapleBlockSetType(String name) {
        this(name, SoundType.WOOD, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON);
    }

    private static BlockSetType register(BlockSetType blockSetType) {
        VALUES.add(blockSetType);
        return blockSetType;
    }

    public static Stream<BlockSetType> stream() {
        return VALUES.stream();
    }
}
