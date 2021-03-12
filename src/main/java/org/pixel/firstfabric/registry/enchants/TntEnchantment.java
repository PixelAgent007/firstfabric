package org.pixel.firstfabric.registry.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class TntEnchantment extends Enchantment {

    public TntEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot[] equipmentSlots) {
        super(weight, target, equipmentSlots);
    }

    @Override
    public int getMinPower(int level) {
        return 8;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity player, Entity target, int level) {
        if(target instanceof LivingEntity) {
             World world = target.getEntityWorld();
             Double x = target.getX();
             Double y = target.getY();
             Double z = target.getZ();

             world.createExplosion(target, x, y, z, level, Explosion.DestructionType.NONE);
        }
    }


}
