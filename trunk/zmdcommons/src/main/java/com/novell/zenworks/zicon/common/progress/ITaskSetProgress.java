/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename ITaskSetProgress.java
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

import java.rmi.RemoteException;

import com.novell.zenworks.agent.common.IZEvent;
import com.novell.zenworks.ipc.remoting.ZenRemotable;
import com.novell.zenworks.zicon.common.progress.IProgress;

public interface ITaskSetProgress extends ZenRemotable, IProgress
{
    public enum ProgressStatus
    {
        Downloading,
        Installing,
        Uninstalling,
        ScanningInventory,
        Launching,
        Verifying,
        Terminating,
        Finished,
        Aborted
    }

    IZEvent<ITaskSetProgress> getTaskSetDataChangedEvent() throws RemoteException;
    public String getName() throws RemoteException;
    public ProgressStatus getStatus() throws RemoteException;
    public int getTotalTasks() throws RemoteException;
    public int getCurrentTask() throws RemoteException;
    public boolean isComplete() throws RemoteException;
    public String getIconPath() throws RemoteException;
	public int getTaskSetProgressPercent() throws RemoteException;
}
