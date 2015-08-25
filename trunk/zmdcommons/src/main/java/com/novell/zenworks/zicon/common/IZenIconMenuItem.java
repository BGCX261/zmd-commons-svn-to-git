/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename IZenIconMenuItem.java
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

import com.novell.zenworks.agent.common.ICommonUIEnums.MB_CHECKBOX;
import com.novell.zenworks.ipc.remoting.ZenRemotable;

public interface IZenIconMenuItem extends ZenRemotable {
	/**
	 * The display text of this menu item. This is considered to be a mandatory
	 * property.
	 * 
	 * @return the _text
	 */
	public String getText()throws RemoteException;

	/**
	 * The flyover help for this menu item. This property is optional.
	 * 
	 * @return the _toolTip
	 */
	public String getToolTip() throws RemoteException;

	/**
	 * The enabled/disabled state of this menu item.
	 * 
	 * @return the _enabled
	 */
	public boolean isEnabled()throws RemoteException;

	/**
	 * Optional custom data that should be associated with this menu item.The
	 * data must be serializable.
	 * 
	 * @return the _tag
	 */
	public Object getTag() throws RemoteException;
	
	/**
     * The checked state of this item.
     * 
     * @return the _checkboxType
     */
    public MB_CHECKBOX getCheckboxType() throws RemoteException;

	/**
	 * This item's child items, sometimes referred to as drop down items.
	 * 
	 * @return the _subItems
	 */
	public List<IZenIconMenuItem> getSubItems() throws RemoteException;

	/**
	 * The image associated with this menu item. The image will not be displayed
	 * if the menu item is checked.
	 * 
	 * @return the _iconPath
	 */
	public String getIconPath() throws RemoteException;

	/**
	 * Shortcut keys for this menu item. Shortcut keys are not the same as hot
	 * keys (specified in the text property with a preceding ampersand - such as
	 * &Refresh). Rather, a shortcut key is something like (CTRL + C).
	 * 
	 * @return the _shortcutKeys
	 */
	public String getShortcutKeys() throws RemoteException;

	/**
	 * Used internally to route a menu-clicked event to the proper menu item
	 * provider. Menu item extension writers should not use this property.
	 * 
	 * @return the _providerId
	 */
	public String getProviderId() throws RemoteException;
	
	/**
	 * Id given to a menu item
	 *
	 * 
	 * @return the id
	 */
	public String getId() throws RemoteException;
	
	public void setCheckboxType(MB_CHECKBOX type)throws RemoteException;
}
