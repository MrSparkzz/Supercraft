package net.sparkzz.supercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.sparkzz.supercraft.Supercraft;

/**
 * Created by Brendon on 7/23/2014.
 */
public class GenericBlock extends Block {

	private Float hardness = 1.0f;

	private int level;

	private String name, texture, tool;

	public GenericBlock(Material material) {
		super(material);
	}

	public GenericBlock create() {
		setBlockName(name);
		setBlockTextureName(Supercraft.MODID + ":" + texture);
		setCreativeTab(Supercraft.tabSupercraft);
		setHardness(hardness);
		setHarvestLevel(tool, level);
		return this;
	}

	public GenericBlock setUnlocalizedName(String name) {
		this.name = name;
		create();
		return this;
	}

	public GenericBlock setTextureName(String name) {
		this.texture = name;
		return this;
	}

	public GenericBlock setBlockHardness(float hardness) {
		this.hardness = hardness;
		return this;
	}

	public GenericBlock setBlockHarvestLevel(String tool, int level) {
		this.tool = tool.toLowerCase();
		this.level = level;
		return this;
	}
}