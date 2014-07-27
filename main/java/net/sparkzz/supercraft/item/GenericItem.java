package net.sparkzz.supercraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sparkzz.supercraft.Supercraft;

/**
 * Created by Brendon on 7/26/2014.
 */
public class GenericItem extends Item {

	private CreativeTabs creativeTab = Supercraft.tabSupercraft;

	private int maxStackSize = 64;

	private String name;

	public GenericItem(String unlocalizedName) {
		setCreativeTab(creativeTab);
		setMaxStackSize(maxStackSize);
		setUnlocalizedName(unlocalizedName);

		setTextureName(Supercraft.MODID + ":" + unlocalizedName);
		// setTextureName(Supercraft.MODID + ":" + textureName);
	}

	public GenericItem setCreativeTab(CreativeTabs creativeTab) {
		this.creativeTab = creativeTab;
		return this;
	}

	public GenericItem setMaxStackSize(int size) {
		this.maxStackSize = size;
		return this;
	}

	public GenericItem setItemTextureName(String name) {
		this.name = name;
		return this;
	}
}