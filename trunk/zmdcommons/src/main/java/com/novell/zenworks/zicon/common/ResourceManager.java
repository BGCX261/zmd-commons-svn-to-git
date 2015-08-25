/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename ResourceManager.java
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

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Resource Manager for ZENworks Tray Icon. This class is a singleton.
 */
public class ResourceManager
{
    private static ResourceManager rm;

    private ResourceBundle rb = null;

    private ResourceManager()
    {
        rb = ResourceBundle.getBundle("ZenNotifyIcon");
    }

    /**
     * @method Get the singleton instance of ResourceManager.
     * 
     * @return singleton instance of ResourceManager.
     */
    public static ResourceManager getInstance()
    {
        if (rm == null)
        {
            rm = new ResourceManager();
        }

        return rm;
    }

    /**
     * @method Get the resource which corresponds to the key.
     * 
     * @return resource string which corresponds to the key.
     */
    public String getString(String key)
    {
    	String str = key;
    	try
    	{
    		str = rb.getString(key);
    		if (str == null)
    		{
    			str = key;
    		}
    	}
    	catch(Exception e)
    	{
            str = key;
    	}
        return str;
    }
    
    public String getString(String key, String param)
    {
    	String str = key;
        try 
        {
			str = rb.getString(key);
			if (str != null)
			{
			    str = MessageFormat.format(str, new Object[] {param});
			}
			else
			{
				str = key;
			}
		} catch (Exception e) 
		{
			str = key;
		}
        
        return str;
    }
    
    public String getString(String key, String param1, String param2)
    {
    	String str = key;    	
        try 
        {
			str = rb.getString(key);
			if (str != null) 
			{
				str = MessageFormat.format(str, new Object[] { param1, param2 });
			}
			else
			{
				str = key;
			}
		} catch (Exception e) 
		{
			str = key;
		}
		return str;
    }
    
    public String getString(String key, String params[])
    {
    	String str = key;
        try 
        {
			str = rb.getString(key);
			if (str != null) 
			{
				str = MessageFormat.format(str, (Object[]) params);
			}
			else
			{
				str = key;
			}
		} catch (Exception e) 
		{
			str = key;
		}
		return str;
    }
}
