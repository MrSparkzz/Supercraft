package net.sparkzz.supercraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.sparkzz.supercraft.Supercraft;

/**
 * Created by Brendon on 7/23/2014.
 */
public class GenericBlock extends Block {

	private Float hardness = 4.0f;

	private int level;

	private String name, texture, tool;

	public GenericBlock(Material material) {
		super(material);

		setCreativeTab(Supercraft.tabSupercraft);
		setBlockname(name);
		setBlockTextureName(Supercraft.MODID + ":" + texture);
		setHardness(hardness);
		setHarvestLevel(tool, level);
	}

	public GenericBlock setBlockname(String name) {
		this.name = name;
		return this;
	}

	public GenericBlock setTextureName(String name) {
		this.texture = name;
		return this;
	}

	public GenericBlock setHardness(float hardness) {
		this.hardness = hardness;
		return this;
	}

	public GenericBlock setBlockHarvestLevel(String tool, int level) {
		this.tool = tool.toLowerCase();
		this.level = level;
		return this;
	}
}