package dr_detonation.stuffcraft.entity.bee;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Bee extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LeftWing;
    ModelRenderer RightWing;
  
  public Bee()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-0.5F, -0.5F, -1F, 1, 1, 2);
      Body.setRotationPoint(0F, 23F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftWing = new ModelRenderer(this, 0, 10);
      LeftWing.addBox(0F, 0F, -0.5F, 2, 0, 1);
      LeftWing.setRotationPoint(0F, 23F, 0F);
      LeftWing.setTextureSize(64, 32);
      LeftWing.mirror = true;
      setRotation(LeftWing, 0F, 0F, 0F);
      RightWing = new ModelRenderer(this, 0, 14);
      RightWing.addBox(-2F, 0F, 0F, 2, 0, 1);
      RightWing.setRotationPoint(0F, 23F, -0.5F);
      RightWing.setTextureSize(64, 32);
      RightWing.mirror = true;
      setRotation(RightWing, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    LeftWing.render(f5);
    RightWing.render(f5);
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
    this.LeftWing.rotateAngleY = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.RightWing.rotateAngleY = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}
