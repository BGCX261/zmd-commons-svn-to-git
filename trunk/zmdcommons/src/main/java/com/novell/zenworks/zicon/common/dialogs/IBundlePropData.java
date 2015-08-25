/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename IBundlePropData.java
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
import com.novell.zenworks.zicon.common.dialogs.ISysRequirements;

public interface IBundlePropData extends ZenRemotable,  Serializable
{
	public String getName() throws RemoteException;
	public void setName(String name) throws RemoteException;
	public String getZone() throws RemoteException ;
	public void setZone(String zone) throws RemoteException;
	public String getGuid() throws RemoteException ;
	public void setGuid(String guid) throws RemoteException;
	public String getVersion() throws RemoteException ;
	public void setVersion(String version) throws RemoteException;
	public String getFolder() throws RemoteException ;
	public void setFolder(String folder) throws RemoteException;
	public String getDesc() throws RemoteException;
	public void setDesc(String desc) throws RemoteException;
	public String getStatusDesc() throws RemoteException;
	public void setStatusDesc(String statusDesc) throws RemoteException;
	public String getStatus() throws RemoteException;
	public void setStatus(String status) throws RemoteException;
	public boolean isDesktopSC() throws RemoteException;;
	public void setDesktopSC(boolean desktopSC) throws RemoteException;
	public boolean isQuickLaunchSC() throws RemoteException;
	public void setQuickLaunchSC(boolean quickLaunchSC) throws RemoteException;
	public boolean isStartMenuSC() throws RemoteException;
	public void setStartMenuSC(boolean startMenuSC) throws RemoteException;
	public boolean isSystemTraySC() throws RemoteException;
	public void setSystemTraySC(boolean systemTraySC) throws RemoteException;
	public boolean isWindowViewSC()throws RemoteException;
	public void setWindowViewSC(boolean windowViewSC)throws RemoteException;
	public boolean isRunOnceBundle() throws RemoteException;
	public void setRunOnceBundle(boolean runOnceBundle) throws RemoteException;
	public void addHelpContact(IHelpContacts contact) throws RemoteException;
	public List<IHelpContacts> getHelpContacts() throws RemoteException;
	public List<ISysRequirements> getSysReqs() throws RemoteException;
	public void setSysReqs(List<ISysRequirements> sysReqs) throws RemoteException;
	public List<IScheduleInfo> getScheduleData() throws RemoteException;
	public void addScheduleData(IScheduleInfo scheduleData) throws RemoteException;
	
	//Labels
	public String getRunOnceLabel() throws RemoteException;
	public void setRunOnceLabel(String runOnceLabel) throws RemoteException;
	public String getExplorerViewText() throws RemoteException;
	public void setExplorerViewText(String explorerViewText) throws RemoteException;
	public String getGuidLabel() throws RemoteException;
	public void setGuidLabel(String guidLabel) throws RemoteException;
	public String getOKText() throws RemoteException;
	public void setOKText(String text) throws RemoteException;
	public String getGeneralTabText() throws RemoteException;
	public void setGeneralTabText(String generalTabText) throws RemoteException;
	public String getGeneralToolTipText() throws RemoteException;
	public void setGeneralToolTipText(String generalToolTipText) throws RemoteException;
	public String getFolderLabel() throws RemoteException;
	public void setFolderLabel(String folderLabel) throws RemoteException;
	public String getVersionLabel() throws RemoteException;
	public void setVersionLabel(String versionLabel) throws RemoteException;
	public String getZoneLabel() throws RemoteException;
	public void setZoneLabel(String zoneLabel) throws RemoteException;
	public String getDescriptionLabel() throws RemoteException;
	public void setDescriptionLabel(String descriptionLabel) throws RemoteException;
	public String getStatusTabText() throws RemoteException;
	public void setStatusTabText(String statusTabText) throws RemoteException;
	public String getSystemTrayText() throws RemoteException;
	public void setSystemTrayText(String systemTrayText) throws RemoteException;
	public String getStartMenuText() throws RemoteException;
	public void setStartMenuText(String startMenuText) throws RemoteException;
	public String getQuickLaunchText() throws RemoteException;
	public void setQuickLaunchText(String quickLaunchText) throws RemoteException;
	public String getDesktopText() throws RemoteException;
	public void setDesktopText(String desktopText) throws RemoteException;
	public String getHelpTabText() throws RemoteException;
	public void setHelpTabText(String helpTabText) throws RemoteException;
	public String getScheduleTabText() throws RemoteException;
	public void setScheduleTabText(String scheduleTabText) throws RemoteException;
	public String getSysReqTabText() throws RemoteException;
	public void setSysReqTabText(String sysReqTabText) throws RemoteException;
	public String getText() throws RemoteException;
	public void setText(String text) throws RemoteException;
	public String getTitle() throws RemoteException;
	public void setTitle(String title) throws RemoteException;
	public String getNameText() throws RemoteException;
	public void setNameText(String nameText) throws RemoteException;
	public String getPhoneText() throws RemoteException;
	public void setPhoneText(String phoneText) throws RemoteException;
	public String getEmailText() throws RemoteException;
	public void setEmailText(String emailText) throws RemoteException;
	public String getScheduleAction() throws RemoteException;
	public void setScheduleAction(String scheduleAction) throws RemoteException;
	public String getBundleOnDevice() throws RemoteException;
	public void setBundleOnDevice(String bundleOnDevice) throws RemoteException;
	public String getShortcutLocation() throws RemoteException;
	public void setShortcutLocation(String shortcutLocation) throws RemoteException;
	public String getIconPath() throws RemoteException;
	public void setIconPath(String iconPath) throws RemoteException;
}
