package dr_detonation.stuffcraft.entity.bee;

import java.util.Random;

import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBeeMob extends EntityFlying {

	private Random rand;
	
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
	
	protected Item getDropItemId() {
		return StuffCraft.honeycomb;
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		this.dropItem(StuffCraft.honeycomb, 1 + rand.nextInt(2));
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2D);
	}

}
