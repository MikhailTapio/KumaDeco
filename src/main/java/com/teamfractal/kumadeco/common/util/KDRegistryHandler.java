package com.teamfractal.kumadeco.common.util;

import com.teamfractal.kumadeco.KumaDeco;
import com.teamfractal.kumadeco.common.block.init.KDBlocks;
import com.teamfractal.kumadeco.common.item.init.KDItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class KDRegistryHandler {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, KumaDeco.MODID);
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, KumaDeco.MODID);

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        KDBlocks.register();
        KDItems.register();

        Items.register(eventBus);
        Blocks.register(eventBus);
    }
}
