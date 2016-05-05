package dr_detonation.stuffcraft.entity.nautilus;

import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityNautilusMob extends EntityAnimal {

	public EntityNautilusMob(World world) {
		super(world);
		this.setSize(0.6F, 0.6F);
		this.experienceValue = 5;
		this.tasks.addTask(0, new EntityAILookIdle(this));
		this.tasks.addTask(1, new EntityAIMate(this, 0.3D));
		this.tasks.addTask(2, new EntityAIPanic(this, 0.4D));
		this.tasks.addTask(3, new EntityAISwimming(this));
	}
	
	@Override
	public boolean isAIEnabled()  {
		return true;
	}
	
	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}
	
	protected Item getDropItemId() {
		return StuffCraft.nautilusShell;
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		this.dropItem(StuffCraft.nautilusShell, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(6);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

}
