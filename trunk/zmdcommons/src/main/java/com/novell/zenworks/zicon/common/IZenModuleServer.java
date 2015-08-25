/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename IZenModuleServer.java
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

import com.novell.zenworks.ipc.remoting.ZenRemotable;



public interface IZenModuleServer extends ZenRemotable {

	/**
	 * Returns an all-inclusive list of menu groups from registered menu item
	 * providers.
	 */
	IZenIconMenuItemGroup[] getMenuGroups(String language, String country) throws RemoteException;

	/**
	 * UI calls this function when a particular menu item is clicked. The menu
	 * framework routes the call to the correct IZenIconMenuItemProvider's
	 * OnMenuItemInvoked function.
	 * 
	 * @param menuItem
	 *            - The menu item that was clicked
	 */
	void invokeMenuItem(IZenIconMenuItem menuItem)throws RemoteException;

	/**
	 * GetPropertyPage, but gets an XML blob describing the for a DataFormDialog
	 * page
	 * 
	 * @param pageId
	 * @return
	 */
	String getPropertyPage(String pageId,String language,String country)throws RemoteException;

	String getFormControls(String pageId)throws RemoteException;

	/**
	 * submit the response string from a CDF form
	 * 
	 * @param pageId
	 * @param response
	 */
	void doCDFSubmit(String pageId, String response)throws RemoteException;

	/**
	 * For Invocation of the property command
	 * 
	 * @param pageId
	 * @param commandString
	 * @return
	 */
	Object invokePropPageCommand(String pageId, String commandString)throws RemoteException;
	/**
	 * Sets the UI Server object
	 * @param GUID
	 * @param uiserver
	 * @throws RemoteException
	 */
	void setUIServer(String GUID,IZenIconUIServer uiserver) throws RemoteException;
	
	IZenIconUIServer getUIServer(String guid) throws RemoteException;
}
