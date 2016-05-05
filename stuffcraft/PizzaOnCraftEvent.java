package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class PizzaOnCraftEvent {

	@SubscribeEvent
	public void onCraftEvent(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(StuffCraft.pizza)) {
			e.player.addStat(StuffCraft.toldYa, 1);
		}
	}
	
}