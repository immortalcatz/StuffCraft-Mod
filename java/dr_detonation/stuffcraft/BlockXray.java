package dr_detonation.stuffcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockXray extends Block {

	public IIcon bottom;
	public IIcon top;
	public IIcon front;
	public IIcon back;
	public IIcon left;
	public IIcon right;
	
	public BlockXray(Material material) {
		super(material);
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		bottom = icon.registerIcon("sc:xrayend");
		top = icon.registerIcon("sc:xrayend");
		front = icon.registerIcon("sc:xrayside");
		back = icon.registerIcon("sc:xrayside");
		left = icon.registerIcon("sc:xrayside");
		right = icon.registerIcon("sc:xrayside");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 0) {
			return bottom;
		} else if (side == 1) {
			return top;
		} else if (side == 2) {
			return front;
		} else if (side == 3) {
			return back;
		} else if (side == 4) {
			return left;
		} else if (side == 5) {
			return right;
		}
		return null;	
	}
	
}
