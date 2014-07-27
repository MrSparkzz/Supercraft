package net.sparkzz.supercraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Blocks {

	public static Block hyperdiamond_ore = new GenericOre().setTextureName("hyperdiamond_ore").setBlockHardness(5.0f).setExplosiveResistance(8.0f).setUnlocalizedName("hyperdiamondOre");
	public static Block sapphire_ore = new GenericOre().setTextureName("sapphire_ore").setBlockHardness(3.0f).setExplosiveResistance(5.0f).setUnlocalizedName("sapphireOre");

	public static void registerBlocks() {
		registerBlock(hyperdiamond_ore, "hyperdiamondOre");
		registerBlock(sapphire_ore, "cobaltOre");
	}

	public static void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
}