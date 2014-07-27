package net.sparkzz.supercraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.sparkzz.supercraft.Supercraft;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Blocks {

	public static Block hyperdiamond_ore = new HyperdiamondOre();

	public static void registerBlocks() {
		registerBlock(hyperdiamond_ore, "hyperdiamondOre");
	}

	public static void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
}