package com.ManImDead.testmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup MOD_GROUP = new ItemGroup("testModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };

}
