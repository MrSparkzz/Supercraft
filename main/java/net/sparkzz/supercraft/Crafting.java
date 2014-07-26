package net.sparkzz.supercraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Crafting {

	public static void brewingRecipes() {

	}

	public static void shapedRecipes() {
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block), new Object[] {
				"x x", " y ", "x x", 'x', Items.apple, 'y', Items.potato
		});
	}

	public static void shapelessRecipes() {

	}

	public static void smeltingRecipes() {

	}
}