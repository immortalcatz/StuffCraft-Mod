package dr_detonation.stuffcraft.entity.bee;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBeeMob extends RenderLiving {

	private static final ResourceLocation mobTexture = new ResourceLocation("sc:textures/entity/Bee.png");
	
	public RenderBeeMob(ModelBase modelBase, float par1) {
		super(modelBase, par1);
	}
	
	protected ResourceLocation getEntityTexture(EntityBeeMob entity) {
		return mobTexture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityBeeMob)entity);
	}

}
