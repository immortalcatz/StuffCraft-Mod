package dr_detonation.stuffcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCopperOre extends Block {

	public BlockCopperOre(Material material) {
		super(material);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return StuffCraft.copperIngot;	
	}

}
