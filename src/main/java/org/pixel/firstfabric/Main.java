package org.pixel.firstfabric;

import net.fabricmc.api.ModInitializer;
import org.pixel.firstfabric.registry.ModItems;

public class Main implements ModInitializer {

    public static final String MOD_ID = "firstmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
