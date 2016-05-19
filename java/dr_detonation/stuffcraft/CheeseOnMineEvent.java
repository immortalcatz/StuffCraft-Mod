package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class CheeseOnMineEvent {

	@SubscribeEvent
	public void onMineCheese(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(StuffCraft.cheese))) {
			e.player.addStat(StuffCraft.getCheese, 1);
		}
	}
	
}
