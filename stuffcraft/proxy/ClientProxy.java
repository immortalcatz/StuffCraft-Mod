package dr_detonation.stuffcraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import dr_detonation.stuffcraft.StuffCraft;
import dr_detonation.stuffcraft.entity.bee.Bee;
import dr_detonation.stuffcraft.entity.bee.EntityBeeMob;
import dr_detonation.stuffcraft.entity.bee.RenderBeeMob;
import dr_detonation.stuffcraft.entity.ghost.EntityGhostMob;
import dr_detonation.stuffcraft.entity.ghost.Ghost;
import dr_detonation.stuffcraft.entity.ghost.RenderGhostMob;
import dr_detonation.stuffcraft.entity.nautilus.EntityNautilusMob;
import dr_detonation.stuffcraft.entity.nautilus.Nautilus;
import dr_detonation.stuffcraft.entity.nautilus.RenderNautilusMob;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityGhostMob.class, new RenderGhostMob(new Ghost(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityNautilusMob.class, new RenderNautilusMob(new Nautilus(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBeeMob.class, new RenderBeeMob(new Bee(), 0));
	}	
}
