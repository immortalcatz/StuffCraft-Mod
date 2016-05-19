package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OxygenOnCraftEvent {

	@SubscribeEvent
	public void onCraftEvent(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(StuffCraft.liquidOxygen)) {
			e.player.addStat(StuffCraft.breathe, 1);
		}
	}
	
}
