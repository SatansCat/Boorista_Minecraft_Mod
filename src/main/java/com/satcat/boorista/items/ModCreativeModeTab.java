package com.satcat.boorista.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BOORISTA_TAB = new CreativeModeTab("booristatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ANCIENTCHOCOLATE.get());
        }
    };
}
