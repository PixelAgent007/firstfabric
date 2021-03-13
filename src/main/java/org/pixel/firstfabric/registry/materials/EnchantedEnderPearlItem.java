package org.pixel.firstfabric.registry.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedEnderPearlItem extends Item {
    public EnchantedEnderPearlItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
