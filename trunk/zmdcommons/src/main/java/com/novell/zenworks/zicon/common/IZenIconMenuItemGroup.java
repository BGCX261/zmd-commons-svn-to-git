/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename IZenIconMenuItemGroup.java
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 1
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.novell.zenworks.zicon.common;

import java.rmi.RemoteException;
import java.util.List;

import com.novell.zenworks.ipc.remoting.ZenRemotable;

public interface IZenIconMenuItemGroup extends ZenRemotable {
	/**
	 * Gets the relative positioning of items in this group. Larger numbers sink
	 * to the bottom of the list. Groups with the same merge order are ordered
	 * top-to-bottom on a first-come, first-serve basis.
	 * 
	 * @param mergeOrder
	 */
	public int getMergeOrder() throws RemoteException;

	/**
	 * Denotes whether or not menu items in this group is separated from other
	 * groups by a top and bottom dividing line.
	 */
	public boolean isUseSeparator()throws RemoteException;

	/**
	 * The list of menu items in this group. Items are placed top-to-bottom on
	 * the menu in the same order that they exist in the list.
	 */
	public List<IZenIconMenuItem> getMenuItems() throws RemoteException;
}
