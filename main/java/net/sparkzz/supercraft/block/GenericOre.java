package net.sparkzz.supercraft.block;

import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sparkzz.supercraft.Supercraft;
import net.sparkzz.supercraft.item.Items;

import java.util.Random;

/**
 * Created by Brendon on 7/27/2014.
 */
public class GenericOre extends BlockOre {

	private Float hardness = 2.0f, resistance = 5.0f;

	private int level;

	private String name, texture, tool;

	public GenericOre(String unlocalizedName) {
		setCreativeTab(Supercraft.tabSupercraft);
		setBlockName(unlocalizedName);
	}

	public GenericOre setBlockHarvestLevel(String tool, int level) {
		setHarvestLevel(tool.toLowerCase(), level);
		return this;
	}

	public GenericOre setTab(CreativeTabs tab) {
		setCreativeTab(tab);
		return this;
	}

	public GenericOre setTextureName(String name) {
		setBlockTextureName(Supercraft.MODID + ":" + name);
		return this;
	}

	public Item getItemDropped(int metadata, Random random, int fortune) {
		return this == Blocks.hyperdiamond_ore ? Items.hyperdiamond : this == Blocks.ruby_ore ? Items.ruby : ((this == Blocks.sapphire_ore ? Items.sapphire : Item.getItemFromBlock(this)));
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
		} else return quantityDropped();
	}
}