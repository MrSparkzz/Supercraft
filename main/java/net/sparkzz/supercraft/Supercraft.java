package net.sparkzz.supercraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sparkzz.supercraft.block.Blocks;
import net.sparkzz.supercraft.item.Items;

/**
 * Created by Brendon on 7/22/2014.
 */

@Mod(modid = Supercraft.MODID, version = Supercraft.VERSION)
public class Supercraft {

	public static final String MODID = "supercraft";
	public static final String VERSION = "2.0";

	public static CreativeTabs tabSupercraft = new CreativeTabs("tabSupercraft") {

		@Override
		public Item getTabIconItem() {
			return Items.hyperdiamond;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Blocks.registerBlocks();

		Crafting.brewingRecipes();
		Crafting.shapedRecipes();
		Crafting.shapelessRecipes();
		Crafting.smeltingRecipes();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}
}