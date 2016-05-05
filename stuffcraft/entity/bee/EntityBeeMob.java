package dr_detonation.stuffcraft.entity.bee;

import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.world.World;

public class EntityBeeMob extends EntityFlying {

	public EntityBeeMob(World world) {
		super(world);
		this.setSize(0.5F, 0.5F);
		this.tasks.addTask(0, new EntityAILookIdle(this));
		this.isAirBorne = true;
	}
	
	@Override
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2D);
	}

}
