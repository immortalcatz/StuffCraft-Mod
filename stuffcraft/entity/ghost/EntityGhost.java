package dr_detonation.stuffcraft.entity.ghost;

import cpw.mods.fml.common.registry.EntityRegistry;
import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityGhost {
	
	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		createEntity(EntityGhostMob.class, "Ghost", 0x000000, 0xF5F5F5);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, StuffCraft.instance, 26, 1, true);
		EntityRegistry.addSpawn(entityClass, 6, 0, 1, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.beach, BiomeGenBase.coldTaiga, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.hell, BiomeGenBase.mesa, BiomeGenBase.swampland});
		createEgg(randomId, solidColor, spotColor);
	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
	
}
