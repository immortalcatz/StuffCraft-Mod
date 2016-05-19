package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class NautilusOnKillEvent {

	@SubscribeEvent
	public void onKillEvent(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().equals(new ItemStack(StuffCraft.nautilusShell))) {
			e.player.addStat(StuffCraft.shell, 1);
		}
	}
	
}
