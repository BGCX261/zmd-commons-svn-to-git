/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename IZenIconUIServer.java
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
import com.novell.zenworks.zicon.common.progress.ITaskSetProgress;
import com.novell.zenworks.zicon.common.progress.ITaskSetProgress.ProgressStatus;
import com.novell.zenworks.agent.common.ICommonUIEnums.MB_ICON;
import com.novell.zenworks.zicon.common.dialogs.IBundlePropData;

/**
 * @author mgangadharnagesh
 *
 */
public interface IZenIconUIServer extends ZenRemotable 
{
    public void showBalloonTip(String message, String title, MB_ICON iconType, int timeout) throws RemoteException;
    
    /**
     * 
     * @param pageId
     * @param timeout dataform dialog timeout in seconds.
     * @throws RemoteException
     */
    public void showDataFormDialog(String pageId, int timeout)throws RemoteException;
    public void addProgress(ITaskSetProgress progress)throws RemoteException;
    public void showProgress()throws RemoteException;
    //void displayPropertiesPage(String pageId)throws RemoteException;
	/*void refreshPropertyPage()throws RemoteException;*/
    //void RefreshDesktop()throws RemoteException;
    /*boolean login(String sessionId, String userName, String domain)throws RemoteException;*/
    public void startAnimation() throws RemoteException;
    public void stopAnimation() throws RemoteException;

    // For setting ZICON visibility
    public void setVisible(boolean visible)throws RemoteException;

    // For Show Progress setting
    public void enableShowProgress(boolean enable)throws RemoteException;
    
     // Methods added for the Activity Indicator for the bundles.
    // show the indicator
    public boolean showActivityIndicator(String guid, ProgressStatus status, String name)throws RemoteException;

    //update the indicator
    public boolean updateActivityIndicator(String guid, ProgressStatus action, ProgressStatus status, String name)throws RemoteException;

    //close the indicator
    public boolean closeActivityIndicator(String guid)throws RemoteException;

	public void showBundlePropertiesDialog(IBundlePropData data) throws RemoteException;

	public void launchFileInBrowser(String filePath)throws RemoteException;
	
	public void refreshPage() throws RemoteException;
	public void setDefaultPage() throws RemoteException;

	public void launchFileInEditor(String editor, String filePath)throws RemoteException;
}
