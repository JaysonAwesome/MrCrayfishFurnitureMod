/**
 * MrCrayfish's Furniture Mod
 * Copyright (C) 2016  MrCrayfish (http://www.mrcrayfish.com/)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mrcrayfish.furniture.items;

import com.mrcrayfish.furniture.MrCrayfishFurnitureMod;
import com.mrcrayfish.furniture.blocks.BlockHedge;
import com.mrcrayfish.furniture.items.colors.ItemHedgeColor;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHedge extends ItemBlock implements IFurnitureItem
{
	private BlockHedge hedge;
	
	public ItemHedge(Block block)
	{
		super(block);
		this.hedge = (BlockHedge) block;
		MrCrayfishFurnitureMod.proxy.registerItemColor(this);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerItemColor()
	{
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new ItemHedgeColor(this.hedge), this.hedge);
	}
}
