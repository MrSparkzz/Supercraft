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
public class GenericOre extends Block {

	private Float hardness = 2.0f, resistance = 5.0f;

	private int level;

	private String name, texture, tool;

	//TODO: change this class to GenericOre and look at the BlockOre class for resources
	public GenericOre() {
		super(Material.rock);
	}

	public GenericOre create() {
		setBlockName(name);
		setBlockTextureName(Supercraft.MODID + ":" + texture);
		setCreativeTab(Supercraft.tabSupercraft);
		setHardness(hardness);
		setHarvestLevel(tool, level);
		setResistance(resistance);
		return this;
	}

	public GenericOre setBlockHardness(float hardness) {
		this.hardness = hardness;
		return this;
	}

	public GenericOre setBlockHarvestLevel(String tool, int level) {
		this.tool = tool.toLowerCase();
		this.level = level;
		return this;
	}

	public GenericOre setExplosiveResistance(Float resistance) {
		this.resistance = resistance;
		return this;
	}

	public GenericOre setTextureName(String name) {
		this.texture = name;
		return this;
	}

	public GenericOre setUnlocalizedName(String name) {
		this.name = name;
		create();
		return this;
	}

	public Item getItemDropped(int metadata, Random random, int fortune) {
		return this == Blocks.hyperdiamond_ore ? Items.hyperdiamond : (this == Blocks.sapphire_ore ? Items.sapphire : Item.getItemFromBlock(this));
	}

	public int quantityDropped() {
		return 1;
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