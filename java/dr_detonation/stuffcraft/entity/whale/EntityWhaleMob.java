package dr_detonation.stuffcraft.entity.whale;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.world.World;

public class EntityWhaleMob extends EntityWaterMob {

	public EntityWhaleMob(World world) {
		super(world);
		this.setSize(10.0F, 3.4F);
		this.tasks.addTask(0, new EntityAILookIdle(this));
		this.tasks.addTask(1, new EntityAIWander(this, 2.2D));
		this.tasks.addTask(2, new EntityAISwimming(this));
	}

	@Override
	public boolean isAIEnabled() {
		return true;
	}
	
	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(4D);
	}

}
