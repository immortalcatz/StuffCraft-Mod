package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class CopperOnMineEvent {

	@SubscribeEvent
	public void onMineCopper(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(StuffCraft.copperIngot))) {
			e.player.addStat(StuffCraft.mineCopper, 1);
		}
	}
	
}
