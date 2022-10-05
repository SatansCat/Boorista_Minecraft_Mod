package com.satcat.boorista.items;

import com.satcat.boorista.Boorista;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Boorista.MOD_ID);

    public static final RegistryObject<Item> ANCIENTCHOCOLATE = ITEMS.register("ancient_chocolate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOORISTA_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
