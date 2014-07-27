package net.sparkzz.supercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.sparkzz.supercraft.Supercraft;
import net.sparkzz.supercraft.item.Items;

import java.util.Random;

/**
 * Created by Brendon on 7/27/2014.
 */
public class HyperdiamondOre extends Block {

	//TODO: change this class to GenericOre and look at the BlockOre class for resources
	public HyperdiamondOre() {
		super(Material.rock);

		setCreativeTab(Supercraft.tabSupercraft);
		setBlockName("hyperdiamondOre");
		setBlockTextureName(Supercraft.MODID + ":hyperdiamond_ore");
		setHardness(4.2f);
		setHarvestLevel("pickaxe", 3);
	}

	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Items.hyperdiamond;
	}

	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0) {
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0) {
				i = 0;
			}

			return quantityDropped(random)*(i + 1);
		} else return quantityDropped(random);
	}
}