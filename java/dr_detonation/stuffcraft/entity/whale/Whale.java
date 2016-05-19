package dr_detonation.stuffcraft.entity.whale;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Whale extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer TailStart;
    ModelRenderer Tail;
  
  public Whale()
  {
    textureWidth = 1024;
    textureHeight = 512;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-40F, -30F, -100F, 80, 60, 200);
      Body.setRotationPoint(0F, 38F, 0F);
      Body.setTextureSize(1024, 512);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      TailStart = new ModelRenderer(this, 591, 0);
      TailStart.addBox(-20F, -10F, -50F, 40, 20, 120);
      TailStart.setRotationPoint(0F, 38F, 105F);
      TailStart.setTextureSize(1024, 512);
      TailStart.mirror = true;
      setRotation(TailStart, -0.1047198F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 300);
      Tail.addBox(-60F, -5F, -20F, 120, 10, 40);
      Tail.setRotationPoint(0F, 44F, 184F);
      Tail.setTextureSize(1024, 512);
      Tail.mirror = true;
      setRotation(Tail, -0.0698132F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    TailStart.render(f5);
    Tail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
