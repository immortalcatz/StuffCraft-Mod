package dr_detonation.stuffcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCheeseOre extends Block {

	public BlockCheeseOre(Material material) {
		super(material);
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return StuffCraft.cheese;
	}
	
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(5);
		
	}

}
