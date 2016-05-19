package dr_detonation.stuffcraft.entity.whale;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderWhaleMob extends RenderLiving {

	private static final ResourceLocation mobTexture = new ResourceLocation("sc:textures/entity/Whale.png");
	
	public RenderWhaleMob(ModelBase modelBase, float par1) {
		super(modelBase, par1);
	}

	protected ResourceLocation getEntityTexture(EntityWhaleMob entity) {
		return mobTexture;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityWhaleMob)entity);
	}

}
