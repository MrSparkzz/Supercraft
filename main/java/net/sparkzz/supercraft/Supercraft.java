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
			return Items.icon;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Blocks.registerBlocks();

		Items.registerItems();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		removeRecipes();

		Crafting.brewingRecipes();
		Crafting.shapedRecipes();
		Crafting.shapelessRecipes();
		Crafting.smeltingRecipes();
	}

	private void removeRecipes() {
		Crafting.removeRecipe(Item.getItemById(267)); // iron sword
		Crafting.removeRecipe(Item.getItemById(268)); // wooden sword
		Crafting.removeRecipe(Item.getItemById(272)); // stone sword
		Crafting.removeRecipe(Item.getItemById(276)); // diamond sword
		Crafting.removeRecipe(Item.getItemById(283)); // golden sword
	}
}