package dr_detonation.stuffcraft;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentNVision extends Enchantment {

	public EnchantmentNVision(int id, int rarity, EnumEnchantmentType type) {
		super(id, rarity, type);
	}
	
	public int getMinEnchantability(int min) {
		return 5 + (min - 1) * 10;
	}
	
	public int getMaxEnchantability(int max) {
		return this.getMinEnchantability(max) + 20;
	}

	public int getMaxLevel() {
		return 1;
	}

}
