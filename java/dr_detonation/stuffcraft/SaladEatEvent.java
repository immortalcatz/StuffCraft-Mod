package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class SaladEatEvent {

	@SubscribeEvent
	public void eatEvent(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(StuffCraft.salad)) {
			e.player.addStat(StuffCraft.eatGreen, 1);
		}
	}
	
}
