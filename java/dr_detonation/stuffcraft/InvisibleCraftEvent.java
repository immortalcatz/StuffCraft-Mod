package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class InvisibleCraftEvent {

	@SubscribeEvent
	public void onCraftEvent(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(StuffCraft.kevlarHelmet)) {
			e.player.addStat(StuffCraft.invisible, 1);
		}
	}
	
}
