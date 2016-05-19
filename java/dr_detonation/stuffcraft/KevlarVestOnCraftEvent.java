package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class KevlarVestOnCraftEvent {

	@SubscribeEvent
	public void onCraftEvent(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(new ItemStack(StuffCraft.kevlarVest))) {
			e.player.addStat(StuffCraft.bulletproof, 1);
		}
	}
	
}
