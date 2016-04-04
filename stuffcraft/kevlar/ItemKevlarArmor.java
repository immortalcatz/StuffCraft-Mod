package dr_detonation.stuffcraft.kevlar;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemKevlarArmor extends ItemArmor {

	public ItemKevlarArmor(ArmorMaterial material, int render, int type) {
		super(material, render, type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "sc:textures/models/armor/kevlararmorone.png";
	}
	
}
