/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename IProgress.java
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
package com.novell.zenworks.zicon.common.progress;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Locale;

import com.novell.zenworks.agent.common.IZEvent;
import com.novell.zenworks.ipc.remoting.ZenRemotable;

public interface IProgress extends ZenRemotable, Serializable
{
    IZEvent<IProgress> getUpdateEvent() throws RemoteException;
    IZEvent<IProgress> getAbortEvent() throws RemoteException;
    IZEvent<IProgress> getPostponeEvent() throws RemoteException;
    public String getUID() throws RemoteException;
    public int getPercent() throws RemoteException;
    public String getMessageID() throws RemoteException;
    public String[] getMessageParams() throws RemoteException;
    public void abort() throws RemoteException;
    public boolean isAborted() throws RemoteException;
    public boolean canPostpone() throws RemoteException;
    public void postpone() throws RemoteException;
    public String getTranslatedMessage(Locale locale) throws RemoteException;
    IProgressMessage getProgressMessage() throws RemoteException;
}