package dr_detonation.stuffcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class KevlarOnMineEvent {

	@SubscribeEvent
	public void onMineKevlar(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(StuffCraft.kevlarIngot))) {
			e.player.addStat(StuffCraft.achievementKevlar, 1);
		}
	}
	
}
