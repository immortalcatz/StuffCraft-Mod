package dr_detonation.stuffcraft.kevlar;

import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemKevlarArmor extends ItemArmor {

	public ItemKevlarArmor(ArmorMaterial material, int render, int type) {
		super(material, render, type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "sc:textures/models/armor/kevlararmorone.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (stack.getItem() == StuffCraft.kevlarHelmet) {
			int j = EnchantmentHelper.getEnchantmentLevel(StuffCraft.invisibility.effectId, stack);
			if (j > 0) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 50, j - 1));
			}
		}
	}
	
}
