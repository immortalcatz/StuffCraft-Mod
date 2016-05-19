package dr_detonation.stuffcraft.entity.nautilus;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Nautilus extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer ShellBase;
    ModelRenderer ShellBack;
    ModelRenderer ShellTop;
    ModelRenderer ShellFront;
  
  public Nautilus()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 14, 0);
      Body.addBox(-1F, -1F, -1F, 2, 2, 2);
      Body.setRotationPoint(0F, 23F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      ShellBase = new ModelRenderer(this, 0, 0);
      ShellBase.addBox(-1.5F, 0F, -1.5F, 3, 3, 3);
      ShellBase.setRotationPoint(0F, 21F, 2F);
      ShellBase.setTextureSize(64, 32);
      ShellBase.mirror = true;
      setRotation(ShellBase, 0F, 0F, 0F);
      ShellBack = new ModelRenderer(this, 0, 8);
      ShellBack.addBox(-1F, -2.533333F, -1F, 2, 6, 2);
      ShellBack.setRotationPoint(0F, 21.4F, 4F);
      ShellBack.setTextureSize(64, 32);
      ShellBack.mirror = true;
      setRotation(ShellBack, 0F, 0F, 0F);
      ShellTop = new ModelRenderer(this, 0, 19);
      ShellTop.addBox(-1F, -1F, -1.5F, 2, 2, 3);
      ShellTop.setRotationPoint(0F, 20F, 2F);
      ShellTop.setTextureSize(64, 32);
      ShellTop.mirror = true;
      setRotation(ShellTop, 0F, 0F, 0F);
      ShellFront = new ModelRenderer(this, 24, 0);
      ShellFront.addBox(-0.5F, -1F, -0.5F, 1, 2, 1);
      ShellFront.setRotationPoint(0F, 20.26667F, 0F);
      ShellFront.setTextureSize(64, 32);
      ShellFront.mirror = true;
      setRotation(ShellFront, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    ShellBase.render(f5);
    ShellBack.render(f5);
    ShellTop.render(f5);
    ShellFront.render(f5);
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
