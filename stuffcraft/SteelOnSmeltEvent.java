package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class SteelOnSmeltEvent {

	@SubscribeEvent
	public void onSmeltEvent(PlayerEvent.ItemSmeltedEvent e) {
		if (e.smelting.getItem().equals(new ItemStack(StuffCraft.steelIngot))) {
			e.player.addStat(StuffCraft.gotSteel, 1);
		}
	}
	
}
