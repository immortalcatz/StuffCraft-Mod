package dr_detonation.stuffcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockSilverOre extends Block {

	public BlockSilverOre(Material material) {
		super(material);
	}
	
	public static Item getItemDropped(int metadata, Item stack, int fortune) {
		return StuffCraft.silverIngot;
	}

}
