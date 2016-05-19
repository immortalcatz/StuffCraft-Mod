package dr_detonation.stuffcraft.entity.ghost;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityGhostMob extends EntityAnimal {

	public EntityGhostMob(World world) {
		super(world);
		this.setSize(0.7F, 1.4F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.6D));
		this.tasks.addTask(1, new EntityAIFleeSun(this, 2.8D));
		this.tasks.addTask(2, new EntityAIRestrictSun(this));
		this.tasks.addTask(3, new EntityAIPanic(this, 2.8D));
	}

	public boolean isAIEnabled() {
		return true;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(32);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6D);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
		//return new EntityGhostMob(worldObj);
	}

}
