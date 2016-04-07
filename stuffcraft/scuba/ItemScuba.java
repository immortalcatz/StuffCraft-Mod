package dr_detonation.stuffcraft.scuba;

import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemScuba extends ItemArmor {

	public ItemScuba(ArmorMaterial material, int render, int type) {
		super(material, render, type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "sc:textures/models/armor/scuba.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (stack.getItem() == StuffCraft.scuba) {
			int j = EnchantmentHelper.getEnchantmentLevel(StuffCraft.scubaMask.effectId, stack);
			if (j > 0) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 50, j - 1));
			}
		}
	}
	
}
