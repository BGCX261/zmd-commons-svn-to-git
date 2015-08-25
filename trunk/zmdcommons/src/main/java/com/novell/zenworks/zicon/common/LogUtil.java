/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename LogUtil.java
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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;

public class LogUtil
{
    public static String getTempDir()
    {
        String tempDir = System.getProperty("java.io.tmpdir");
        return tempDir;
    }
    
    private static String getStackTrace (Throwable stmt)
    {
        StringWriter writer = new StringWriter();
        stmt.printStackTrace (new PrintWriter(writer));
        return writer.toString ();
    }
    
    /**
     * @method get debug log file path
     * @return String debug log file path
     */
    private static String getLogPath()
    {
        return getTempDir() + File.separator + "zenicon.log";        
    }
    
    /**
     * @method Logs exception information to the ZIcon's log path
     * @param String exception description
     * @param Exception exception to be logged
     */
    public static void LogException(String description, Throwable e)
    {
        File file = new File(getLogPath());            
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try
        { 
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.append(Calendar.getInstance().getTime().toString());
            bufferedWriter.newLine();
            bufferedWriter.append(description);
            bufferedWriter.newLine();
            bufferedWriter.append(getStackTrace(e));
            bufferedWriter.newLine();
            bufferedWriter.append("----------------");
        }   
        catch (Exception e1)
        {
            e.printStackTrace();
        } 
        
        finally
        {
            try
            {
                if(bufferedWriter != null)
                {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
                
                if (writer != null)
                {
                    writer.flush();
                    writer.close();
                }
            } catch (Exception e1)
            {
                e.printStackTrace();
            }
        }
    }
}
