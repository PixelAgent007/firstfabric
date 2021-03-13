package org.pixel.firstfabric.registry;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.pixel.firstfabric.Main;
import org.pixel.firstfabric.registry.enchants.CantTouchThisEnchantment;
import org.pixel.firstfabric.registry.enchants.OneHitEnchantment;
import org.pixel.firstfabric.registry.enchants.TntEnchantment;
import org.pixel.firstfabric.registry.enchants.YeetEnchantment;
import org.pixel.firstfabric.registry.items.EnderSwordItem;
import org.pixel.firstfabric.registry.items.SnowBlasterItem;
import org.pixel.firstfabric.registry.materials.EnchantedEnderPearlItem;
import org.pixel.firstfabric.registry.materials.EnderMaterial;

public class ModItems {

    public static final Enchantment TNT = new TntEnchantment(
            Enchantment.Rarity.UNCOMMON,
            EnchantmentTarget.BOW,
            new EquipmentSlot[]{
                    EquipmentSlot.MAINHAND
            }
    );

    public static final Enchantment ONEHIT = new OneHitEnchantment(
            Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON,
            new EquipmentSlot[]{
                    EquipmentSlot.MAINHAND
            }
    );

    public static final Enchantment INVINCIBLE = new CantTouchThisEnchantment(
            Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.ARMOR_CHEST,
            new EquipmentSlot[]{
                    EquipmentSlot.CHEST
            }
    );

    public static final Enchantment YEET = new YeetEnchantment(
            Enchantment.Rarity.RARE,
            EnchantmentTarget.WEAPON,
            new EquipmentSlot[]{
                    EquipmentSlot.MAINHAND
            }
    );

    public static ToolItem ENDER_SWORD = new EnderSwordItem(
            EnderMaterial.INSTANCE,
            6,
            -2.4F,
            new Item.Settings().group(ItemGroup.COMBAT)
    );

    public static final Item EPEARl = new EnchantedEnderPearlItem(
      new Item.Settings()
                    .rarity(Rarity.UNCOMMON)
                    .maxCount(16)
    );

    public static final Item SNOW_BLASTER = new SnowBlasterItem(
            new Item.Settings()
                    .rarity(Rarity.UNCOMMON)
                    .maxCount(1)
    );

    public static void registerItems() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "explosive_strike"), TNT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "one_punch"), ONEHIT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "invincible"), INVINCIBLE);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, "yeet"), YEET);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ender_sword"), ENDER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "snow_blaster"), SNOW_BLASTER);
    }
}
