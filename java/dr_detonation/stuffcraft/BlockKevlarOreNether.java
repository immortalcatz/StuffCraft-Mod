package dr_detonation.stuffcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockKevlarOreNether extends Block {

	protected BlockKevlarOreNether(Material material) {
		super(material);
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return StuffCraft.kevlarIngot;
	}

}
