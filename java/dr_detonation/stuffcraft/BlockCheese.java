package dr_detonation.stuffcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCheese extends Block {

	public BlockCheese(Material material) {
		super(material);
		this.setLightOpacity(14);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

}
