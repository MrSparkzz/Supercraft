package net.sparkzz.supercraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Blocks {

	public static Block hyperdiamond_ore = new GenericOre("hyperdiamondOre").setBlockHarvestLevel("pickaxe", 3).setTextureName("hyperdiamond_ore").setHardness(8.0f).setResistance(12.5f);
	public static Block ruby_ore = new GenericOre("rubyOre").setBlockHarvestLevel("pickaxe", 2).setTextureName("ruby_ore").setHardness(3.0f).setResistance(5.0f);
	public static Block sapphire_ore = new GenericOre("sapphireOre").setBlockHarvestLevel("pickaxe", 2).setTextureName("sapphire_ore").setHardness(3.0f).setResistance(5.0f);

	public static void registerBlocks() {
		registerBlock(hyperdiamond_ore, "hyperdiamondOre");
		registerBlock(ruby_ore, "rubyOre");
		registerBlock(sapphire_ore, "sapphireOre");
	}

	public static void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
}