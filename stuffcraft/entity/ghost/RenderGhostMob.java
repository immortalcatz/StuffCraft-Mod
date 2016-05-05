package dr_detonation.stuffcraft.entity.ghost;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGhostMob extends RenderLiving {

	private static final ResourceLocation mobTexture = new ResourceLocation("sc:textures/entity/Ghost.png");
	
	public RenderGhostMob(ModelBase model, float par1) {
		super(model, par1);
	}

	protected ResourceLocation getEntityTexture(EntityGhostMob entity) {
		return mobTexture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityGhostMob)entity);
	}

}
