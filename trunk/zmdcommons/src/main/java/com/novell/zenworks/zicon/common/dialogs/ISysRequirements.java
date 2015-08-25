/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename ISysRequirements.java
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

package com.novell.zenworks.zicon.common.dialogs;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import com.novell.zenworks.ipc.remoting.ZenRemotable;

public interface ISysRequirements extends ZenRemotable,  Serializable
{
	public static enum REQ_COLOR 
	{
		RED,
		BLACK
	}
	public REQ_COLOR getColor() throws RemoteException;
	public void setColor(REQ_COLOR color) throws RemoteException;
	public String getRequirement() throws RemoteException;
	public void addRequirement(String req) throws RemoteException;
	public List<ISysRequirements> getChildRequirements() throws RemoteException;
	public void addChildRequirements(ISysRequirements childReq) throws RemoteException;
}
