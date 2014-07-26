package net.sparkzz.supercraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Blocks {

	public static Block hyperdiamond_ore = new HyperdiamondOre(Material.rock).setCreativeTab(CreativeTabs.tabBlock).setBlockName("hyperdiamondOre");

	public static void registerBlocks() {
		registerBlock(hyperdiamond_ore, "Hyperdiamond Ore");
	}

	public static void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
}