package dr_detonation.stuffcraft;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable {

	public static final float explosionPower = 0.0F;
	public static final int radius = 100;
	
	public EntityBullet(World world) {
		super(world);
	}

	public EntityBullet(World world, EntityLivingBase entity) {
		super(world, entity);
	}

	@Override
    public float getGravityVelocity() {
        return 0.005F;
    }

	@Override
	public void onImpact(MovingObjectPosition pos) {
		setDead();
	}

}
