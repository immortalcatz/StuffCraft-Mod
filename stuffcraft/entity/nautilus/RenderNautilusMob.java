package dr_detonation.stuffcraft.entity.nautilus;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderNautilusMob extends RenderLiving {

	private static final ResourceLocation mobTexture = new ResourceLocation("sc:textures/entity/Nautilus.png");
			
	public RenderNautilusMob(ModelBase modelBase, float par1) {
		super(modelBase	, par1);
	}

	protected ResourceLocation getEntityTexture(EntityNautilusMob entity) {
		return mobTexture;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityNautilusMob)entity);
	}

}
