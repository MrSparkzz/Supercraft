package net.sparkzz.supercraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sparkzz.supercraft.Supercraft;

/**
 * Created by Brendon on 7/26/2014.
 */
public class GenericItem extends Item {

	public GenericItem(String unlocalizedName) {
		setCreativeTab(Supercraft.tabSupercraft);
		setTextureName(Supercraft.MODID + ":" + unlocalizedName);
		setUnlocalizedName(unlocalizedName);
	}

	public GenericItem setCustomTextureName(String name) {
		setTextureName(name);
		return this;
	}

	public GenericItem setTab(CreativeTabs tab) {
		setCreativeTab(tab);
		return this;
	}
}