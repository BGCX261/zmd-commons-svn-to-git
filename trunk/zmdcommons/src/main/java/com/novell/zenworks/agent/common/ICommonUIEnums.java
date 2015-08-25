/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename ICommonUIEnums.java
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

package com.novell.zenworks.agent.common;

/**
 * Enumerations for ZENworks Common User Interface
 */
public interface ICommonUIEnums 
{
	/**
	 * Enumerations for Message Box Refresh State
	 */
    /*public enum REFRESH_STATE
    {
        START_REFRESH,
        DATA_CHANGED,
        END_REFRESH
    };*/
    
    /**
     * Enumerations for Message Box Response
     */
    public enum MB_RESPONSE
    {
        MBR_ABORT,
        MBR_CANCEL,
        MBR_IGNORE,
        MBR_NO,
        MBR_NONE,
        MBR_OK,
        MBR_RETRY,
        MBR_YES,
        MBR_UNSET
    };

    /**
     * Enumerations for Message Box Icon
     */
    public enum MB_ICON
    {
        MBI_NONE,
        MBI_INFO,
        MBI_QUESTION,
        MBI_WARN,
        MBI_ERROR,
        MBI_WEB_ERROR
    };

    /**
     * Enumerations for Message Box Action
     */
    public enum MB_TYPE
    {
        MBT_OK,
        MBT_OKCANCEL,
        MBT_RETRYCANCEL,
        MBT_YESNO,
        MBT_YESNOCANCEL,
        MBT_ABORT_RETRY_IGNORE
    };

    /**
     * Enumerations for Prompted Message Box Type
     */
    /*public enum PMB_TYPE
    {
        PMBI_INSTALL,
        PMBI_VERIFY,
        PMBI_DISTRIBUTE,
        PMBI_UNINSTALL,
        PMBI_ERROR
    };*/
    
    /**
     * Enumerations for check box type
     */
    public enum MB_CHECKBOX
    {
        MBC_NONE,
        MBC_CHECK,
        MBC_RADIO
    };
}

