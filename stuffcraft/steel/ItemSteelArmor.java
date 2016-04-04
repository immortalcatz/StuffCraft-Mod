package dr_detonation.stuffcraft.steel;

import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSteelArmor extends ItemArmor {

	public ItemSteelArmor(ArmorMaterial material, int render, int type) {
		super(material, render, type);
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return "sc:textures/models/armor/steelarmortwo.png";
		}
		return "sc:textures/models/armor/steelarmorone.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (stack.getItem() == StuffCraft.steelBoots) {
			int j = EnchantmentHelper.getEnchantmentLevel(StuffCraft.superSpeed.effectId, stack);
			if (j > 0) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
			}
		}
	}

}
