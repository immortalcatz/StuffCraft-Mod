package dr_detonation.stuffcraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import dr_detonation.stuffcraft.emerald.ItemEmeraldAxe;
import dr_detonation.stuffcraft.emerald.ItemEmeraldHoe;
import dr_detonation.stuffcraft.emerald.ItemEmeraldPickaxe;
import dr_detonation.stuffcraft.emerald.ItemEmeraldShovel;
import dr_detonation.stuffcraft.emerald.ItemEmeraldSword;
import dr_detonation.stuffcraft.kevlar.ItemKevlarArmor;
import dr_detonation.stuffcraft.silver.ItemSilverPickaxe;
import dr_detonation.stuffcraft.steel.ItemCrowbar;
import dr_detonation.stuffcraft.steel.ItemSteelArmor;
import dr_detonation.stuffcraft.steel.ItemSteelAxe;
import dr_detonation.stuffcraft.steel.ItemSteelHoe;
import dr_detonation.stuffcraft.steel.ItemSteelPickaxe;
import dr_detonation.stuffcraft.steel.ItemSteelShovel;
import dr_detonation.stuffcraft.steel.ItemSteelSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "sc", name = "StuffCraft Mod", version = "1.1")
public class StuffCraft {

	public static Item donut;
	public static Item powderedSugar;
	public static Item compressor;
	public static Item liquidOxygen;
	public static Item gatherOxygen;
	public static Item liquidCarbon;
	public static Item gatherCarbon;
	public static Item dryIce;
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldHoe;
	public static Item emeraldShovel;
	public static Item emeraldSword;
	public static Item steelIngot;
	public static Block steelBlock;
	public static Item steelPickaxe;
	public static Item steelAxe;
	public static Item steelHoe;
	public static Item steelShovel;
	public static Item steelSword;
	public static Item steelHelmet;
	public static Item steelChestplate;
	public static Item steelLeggings;
	public static Item steelBoots;
	public static Item hotdog;
	public static Item carbonIngot;
	public static Block copperOre;
	public static Item copperIngot;
	public static Block kevlarOreSurface;
	public static Block kevlarOreNether;
	public static Item kevlarIngot;
	public static Item kevlarVest;
	public static Item loom;
	public static Item kevlarFiber;
	public static Achievement achievementKevlar;
	public static Achievement bulletproof;
	public static Enchantment superSpeed;
	public static Achievement mineCopper;
	public static Item crowbar;
	public static Achievement murderStick;
	public static Achievement gotSteel;
	public static Item cup;
	public static Item iformer;
	public static Item coffeeGrounds;
	public static Item coffee;
	public static Item copperWire;
	public static Achievement wiresMeanPower;
	public static Block copperBlock;
	public static Item silverIngot;
	public static Block silverOre;
	public static Item silverPickaxe;
	public static Item silverAxe;
	public static Item silverShovel;
	public static Item silverHoe;
	public static Item silverSword;
	
	public static final Item.ToolMaterial silverToolMat = EnumHelper.addToolMaterial("silverToolMat", 1, 766, 3.4F, 3.5F, 18);
	public static final Item.ToolMaterial crowbarMat = EnumHelper.addToolMaterial("crowbarMat", 2, 1377, 7.5F, 9.0F, 6);
	public static final ItemArmor.ArmorMaterial kevlarArmorMat = EnumHelper.addArmorMaterial("kevlarArmorMat", 4540, new int[]{0,18,0,0}, 9);
	public static final ItemArmor.ArmorMaterial steelArmorMat = EnumHelper.addArmorMaterial("steelArmorMat", 1745, new int[]{5,11,9,5}, 11);
	public static final Item.ToolMaterial steelToolMat = EnumHelper.addToolMaterial("steelToolMat", 3, 1431, 7.875F, 6.5F, 11);
	public static final Item.ToolMaterial emeraldToolMat = EnumHelper.addToolMaterial("emeraldToolMat", 3, 1356, 8.0F, 8.0F, 17);
		
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		donut = new ItemFood(3, 4, false).setUnlocalizedName("Donut").setTextureName("sc:donut").setCreativeTab(tabStuffCraft);
		powderedSugar = new ItemPowderedSugar().setUnlocalizedName("PowderedSugar").setTextureName("sc:powderedsugar").setCreativeTab(tabStuffCraft);
		compressor = new ItemCompressor().setUnlocalizedName("Compressor").setTextureName("sc:compressor").setCreativeTab(tabStuffCraft);
		liquidOxygen = new ItemLiquidOxygen().setUnlocalizedName("LiquidOxygen").setTextureName("sc:liquidoxygen").setCreativeTab(tabStuffCraft).setContainerItem(Items.bucket);
		gatherOxygen = new ItemGather().setUnlocalizedName("GatherOxygen").setTextureName("sc:gather").setCreativeTab(tabStuffCraft);
		liquidCarbon = new ItemLiquidCarbon().setUnlocalizedName("LiquidCarbon").setTextureName("sc:liquidcarbon").setCreativeTab(tabStuffCraft).setContainerItem(Items.bucket);
		gatherCarbon = new ItemGatherCarbon().setUnlocalizedName("GatherCarbon").setTextureName("sc:gathercarbon").setCreativeTab(tabStuffCraft);
		dryIce = new ItemDryIce().setUnlocalizedName("DryIce").setTextureName("sc:dryice").setCreativeTab(tabStuffCraft);
		emeraldPickaxe = new ItemEmeraldPickaxe(emeraldToolMat).setUnlocalizedName("EmeraldPickaxe").setTextureName("sc:emeraldpickaxe").setCreativeTab(tabStuffCraft);
		emeraldAxe = new ItemEmeraldAxe(emeraldToolMat).setUnlocalizedName("EmeraldAxe").setTextureName("sc:emeraldaxe").setCreativeTab(tabStuffCraft);
		emeraldHoe = new ItemEmeraldHoe(emeraldToolMat).setUnlocalizedName("EmeraldHoe").setTextureName("sc:emeraldhoe").setCreativeTab(tabStuffCraft);
		emeraldShovel = new ItemEmeraldShovel(emeraldToolMat).setUnlocalizedName("EmeraldShovel").setTextureName("sc:emeraldshovel").setCreativeTab(tabStuffCraft);
		emeraldSword = new ItemEmeraldSword(emeraldToolMat).setUnlocalizedName("EmeraldSword").setTextureName("sc:emeraldsword").setCreativeTab(tabStuffCraft);
		steelIngot = new ItemSteelIngot().setUnlocalizedName("SteelIngot").setTextureName("sc:steelingot").setCreativeTab(tabStuffCraft);
		steelBlock = new BlockSteelBlock(Material.iron).setBlockName("SteelBlock").setBlockTextureName("sc:steelblock").setCreativeTab(tabStuffCraft);
		steelPickaxe = new ItemSteelPickaxe(steelToolMat).setUnlocalizedName("SteelPickaxe").setTextureName("sc:steelpickaxe").setCreativeTab(tabStuffCraft);
		steelAxe = new ItemSteelAxe(steelToolMat).setUnlocalizedName("SteelAxe").setTextureName("sc:steelaxe").setCreativeTab(tabStuffCraft);
		steelHoe = new ItemSteelHoe(steelToolMat).setUnlocalizedName("SteelHoe").setTextureName("sc:steelhoe").setCreativeTab(tabStuffCraft);
		steelShovel = new ItemSteelShovel(steelToolMat).setUnlocalizedName("SteelShovel").setTextureName("sc:steelshovel").setCreativeTab(tabStuffCraft);
		steelSword = new ItemSteelSword(steelToolMat).setUnlocalizedName("SteelSword").setTextureName("sc:steelsword").setCreativeTab(tabStuffCraft);
		steelHelmet = new ItemSteelArmor(steelArmorMat, 0, 0).setUnlocalizedName("SteelHelmet").setTextureName("sc:steelhelmet").setCreativeTab(tabStuffCraft);
		steelChestplate = new ItemSteelArmor(steelArmorMat, 0, 1).setUnlocalizedName("SteelChestplate").setTextureName("sc:steelchestplate").setCreativeTab(tabStuffCraft);
		steelLeggings = new ItemSteelArmor(steelArmorMat, 0, 2).setUnlocalizedName("SteelLeggings").setTextureName("sc:steelleggings").setCreativeTab(tabStuffCraft);
		steelBoots = new ItemSteelArmor(steelArmorMat, 0, 3).setUnlocalizedName("SteelBoots").setTextureName("sc:steelboots").setCreativeTab(tabStuffCraft);
		hotdog = new ItemFood(5, 5, true).setUnlocalizedName("Hotdog").setTextureName("sc:hotdog").setCreativeTab(tabStuffCraft);
		carbonIngot = new ItemCarbonIngot().setUnlocalizedName("CarbonIngot").setTextureName("sc:carboningot").setCreativeTab(tabStuffCraft);		
		copperOre = new BlockCopperOre(Material.rock).setBlockName("CopperOre").setBlockTextureName("sc:copperore").setCreativeTab(tabStuffCraft);
		copperIngot = new ItemCopperIngot().setUnlocalizedName("CopperIngot").setTextureName("sc:copperingot").setCreativeTab(tabStuffCraft);
		kevlarOreSurface = new BlockKevlarOreSurface(Material.iron).setBlockName("KevlarOreSurface").setBlockTextureName("sc:kevlaroresurface").setCreativeTab(tabStuffCraft);
		kevlarOreNether = new BlockKevlarOreNether(Material.iron).setBlockName("KevlarOreNether").setBlockTextureName("sc:kevlarorenether").setCreativeTab(tabStuffCraft);
		kevlarIngot = new ItemKevlarIngot().setUnlocalizedName("KevlarIngot").setTextureName("sc:kevlaringot").setCreativeTab(tabStuffCraft);
		kevlarVest = new ItemKevlarArmor(kevlarArmorMat, 1, 1).setUnlocalizedName("KevlarVest").setTextureName("sc:kevlarvest").setCreativeTab(tabStuffCraft);
		loom = new ItemLoom().setUnlocalizedName("Loom").setTextureName("sc:loom").setCreativeTab(tabStuffCraft);
		kevlarFiber = new ItemKevlarFiber().setUnlocalizedName("KevlarFiber").setTextureName("sc:kevlarfiber").setCreativeTab(tabStuffCraft);
		crowbar = new ItemCrowbar(crowbarMat).setUnlocalizedName("Crowbar").setTextureName("sc:crowbar").setCreativeTab(tabStuffCraft);
		cup = new ItemCup().setUnlocalizedName("Cup").setTextureName("sc:cup").setCreativeTab(tabStuffCraft);
		iformer = new ItemIFormer().setUnlocalizedName("IFormer").setTextureName("sc:iformer").setCreativeTab(tabStuffCraft);
		coffeeGrounds = new ItemCoffeeGrounds().setUnlocalizedName("CoffeeGrounds").setTextureName("sc:coffeegrounds").setCreativeTab(tabStuffCraft);
		coffee = new ItemFood(4, 6, false).setUnlocalizedName("Coffee").setTextureName("sc:cupofcoffee").setCreativeTab(tabStuffCraft).setContainerItem(cup).setPotionEffect("potioneffect.speed");
		copperWire = new ItemCopperWire().setUnlocalizedName("CopperWire").setTextureName("sc:copperwire").setCreativeTab(tabStuffCraft);
		copperBlock = new BlockCopperBlock(Material.rock).setBlockName("CopperBlock").setBlockTextureName("sc:copperblock").setCreativeTab(tabStuffCraft);
		silverIngot = new ItemSilverIngot().setUnlocalizedName("SilverIngot").setTextureName("sc:silveringot").setCreativeTab(tabStuffCraft);		
		silverOre = new BlockSilverOre(Material.rock).setBlockName("SilverOre").setBlockTextureName("sc:silverore").setCreativeTab(tabStuffCraft);
		silverPickaxe = new ItemSilverPickaxe(silverToolMat).setUnlocalizedName("SilverPickaxe").setTextureName("sc:silverpickaxe").setCreativeTab(tabStuffCraft);
		
		achievementKevlar = new Achievement("achievement.mineKevlar", "mineKevlar", 0, 0, new ItemStack(kevlarIngot), (Achievement)null).initIndependentStat().registerStat();
		bulletproof = new Achievement("achievement.bulletproof", "bulletproof", 2, 1, new ItemStack(kevlarVest), achievementKevlar).registerStat();
		mineCopper = new Achievement("achievement.mineCopper", "mineCopper", 4, 2, new ItemStack(copperIngot), achievementKevlar).registerStat();
		gotSteel = new Achievement("achievement.gotSteel", "gotSteel", 6, 4, new ItemStack(steelIngot), achievementKevlar).registerStat();
		murderStick = new Achievement("achievement.murderStick", "murderStick", 2, 3, new ItemStack(crowbar), gotSteel).registerStat();
		wiresMeanPower = new Achievement("achievement.wiresMeanPower", "wiresMeanPower", 7, 2, new ItemStack(copperWire), mineCopper).registerStat();
		
		superSpeed = new EnchantmentSuperSpeed(63, 5, EnumEnchantmentType.armor_feet).setName("speedBoost");
		
		GameRegistry.registerItem(silverPickaxe, "SilverPickaxe");
		GameRegistry.registerBlock(silverOre, "SilverOre");
		GameRegistry.registerItem(silverIngot, "SilverIngot");
		GameRegistry.registerBlock(copperBlock, "CopperBlock");
		GameRegistry.registerItem(copperWire, "CopperWire");
		GameRegistry.registerItem(coffee, "Coffee");
		GameRegistry.registerItem(coffeeGrounds, "CoffeeGrounds");
		GameRegistry.registerItem(iformer, "IFormer");
		GameRegistry.registerItem(cup, "Cup");
		GameRegistry.registerItem(crowbar, "Crowbar");
		GameRegistry.registerItem(kevlarFiber, "KevlarFiber");
		GameRegistry.registerItem(loom, "Loom");
		GameRegistry.registerItem(kevlarVest, "KevlarVest");
		GameRegistry.registerItem(kevlarIngot, "KevlarIngot");
		GameRegistry.registerBlock(kevlarOreNether, "KevlarOreNether");
		GameRegistry.registerBlock(kevlarOreSurface, "KevlarOreSurface");
		GameRegistry.registerItem(copperIngot, "CopperIngot");
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonIngot, carbonIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hotdog, hotdog.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBoots, steelBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelLeggings, steelLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelChestplate, steelChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHelmet, steelHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelSword, steelSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelShovel, steelShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHoe, steelHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelAxe, steelAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelPickaxe, steelPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldSword, emeraldSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldShovel, emeraldShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHoe, emeraldHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldAxe, emeraldAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dryIce, dryIce.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gatherCarbon, gatherCarbon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(liquidCarbon, liquidCarbon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gatherOxygen, gatherOxygen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(liquidOxygen, liquidOxygen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(compressor, compressor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(powderedSugar, powderedSugar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(donut, donut.getUnlocalizedName().substring(5));
		
		GameRegistry.registerWorldGenerator(new KevlarNetherOreGen(), 1);
		GameRegistry.registerWorldGenerator(new CopperOreGen(), 0);
		GameRegistry.registerWorldGenerator(new KevlarOreGen(), 0);
		
		AchievementPage.registerAchievementPage(new AchievementPage("StuffCraft", new Achievement[]{achievementKevlar, bulletproof, mineCopper, gotSteel, murderStick, wiresMeanPower}));
		
		FMLCommonHandler.instance().bus().register(new WiresOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new SteelOnSmeltEvent());
		FMLCommonHandler.instance().bus().register(new CopperOnMineEvent());
		FMLCommonHandler.instance().bus().register(new KevlarOnMineEvent());
		FMLCommonHandler.instance().bus().register(new KevlarVestOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new CrowbarOnCraftEvent());
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(silverPickaxe), new Object[]{"sss", " i ", " i ", 's', silverIngot, 'i', Items.stick});
		GameRegistry.addRecipe(new ItemStack(silverIngot), new Object[]{"s", 's', silverOre});
		GameRegistry.addRecipe(new ItemStack(copperBlock), new Object[]{"ccc", "ccc", "ccc", 'c', copperIngot});
		GameRegistry.addRecipe(new ItemStack(copperWire, 3), new Object[]{"cc", "c ", 'c', copperIngot});
		GameRegistry.addRecipe(new ItemStack(coffee), new Object[]{"cc", "bm", 'c', coffeeGrounds, 'b', Items.bucket, 'm', cup});
		GameRegistry.addRecipe(new ItemStack(coffeeGrounds, 16), new Object[]{"ic", 'i', iformer, 'c', Items.wheat_seeds});
		GameRegistry.addRecipe(new ItemStack(iformer, 4), new Object[]{"sps", "rcr", "sps", 's', steelIngot, 'c', Blocks.chest, 'r', Items.redstone, 'p', Blocks.piston});
		GameRegistry.addRecipe(new ItemStack(cup, 3), new Object[]{"s s", "s s", "sts", 's', Blocks.cobblestone, 't', steelIngot});
		GameRegistry.addRecipe(new ItemStack(crowbar), new Object[]{"  i", " i ", "i  ", 'i', steelIngot});
		GameRegistry.addRecipe(new ItemStack(kevlarVest), new Object[]{"k k", "kkk", "kkk", 'k', kevlarFiber});
		GameRegistry.addRecipe(new ItemStack(kevlarFiber, 4), new Object[]{"lk", 'l', loom, 'k', kevlarIngot});
		GameRegistry.addRecipe(new ItemStack(loom, 4), new Object[]{"sss", "ttt", 's', Items.stick, 't', Items.string});
		GameRegistry.addRecipe(new ItemStack(copperIngot), new Object[]{"c", 'c', copperOre});
		GameRegistry.addRecipe(new ItemStack(kevlarIngot), new Object[]{"k", 'k', kevlarOreSurface});
		GameRegistry.addRecipe(new ItemStack(kevlarIngot), new Object[]{"k", 'k', kevlarOreNether});
		GameRegistry.addRecipe(new ItemStack(carbonIngot, 4), new Object[]{"c", 'c', liquidCarbon});
		GameRegistry.addRecipe(new ItemStack(hotdog), new Object[]{"b", "m", "b", 'b', Items.bread, 'm', Items.cooked_beef});;
		GameRegistry.addRecipe(new ItemStack(steelBoots), new Object[]{"s s", "s s", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelLeggings), new Object[]{"sss", "s s", "s s", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelChestplate), new Object[]{"s s", "sss", "sss", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelHelmet), new Object[]{"sss", "s s", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelSword), new Object[]{"s", "s", "t", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelShovel), new Object[]{"s", "t", "t", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelHoe), new Object[]{"ss ", " t ", " t ", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelAxe), new Object[]{"ss ", "st ", " t ", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelPickaxe), new Object[]{"sss", " t ", " t ", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelBlock), new Object[]{"sss", "sss", "sss", 's', steelIngot});
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(steelIngot), 2.5F);
		GameRegistry.addRecipe(new ItemStack(emeraldSword), new Object[]{"e", "e", "s", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldShovel), new Object[]{"e", "s", "s", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldHoe), new Object[]{"ee ", " s ", " s ", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldAxe), new Object[]{"ee ", "es ", " s ", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldPickaxe), new Object[]{"eee", " s ", " s ", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(dryIce, 4), new Object[]{"ici", 'i', Blocks.ice, 'c', liquidCarbon});
		GameRegistry.addRecipe(new ItemStack(liquidCarbon), new Object[]{"g", 'g', gatherCarbon});
		GameRegistry.addRecipe(new ItemStack(gatherCarbon), new Object[]{"ccc", " b ", 'c', Items.coal, 'b', Items.bucket});
		GameRegistry.addRecipe(new ItemStack(liquidOxygen), new Object[]{"g", 'g', gatherOxygen});
		GameRegistry.addRecipe(new ItemStack(gatherOxygen), new Object[]{"cic", " b ", 'c', Items.coal, 'i', Items.iron_ingot, 'b', Items.bucket});
		GameRegistry.addRecipe(new ItemStack(Items.diamond), new Object[]{"cd", 'c', compressor, 'd', Items.coal});
		GameRegistry.addRecipe(new ItemStack(compressor, 4), new Object[]{"rpr", "p p", "rpr", 'r', Items.redstone, 'p', Blocks.piston});
		GameRegistry.addRecipe(new ItemStack(powderedSugar), new Object[]{"s", 's', Items.sugar});
		GameRegistry.addRecipe(new ItemStack(donut, 3), new Object[]{" w ", "w s", " m ", 'w', Items.wheat, 's', powderedSugar, 'm', Items.milk_bucket});
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}
	
	public static CreativeTabs tabStuffCraft = new CreativeTabs("tabStuffCraft") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(emeraldPickaxe).getItem();
		}
	};
	
}
