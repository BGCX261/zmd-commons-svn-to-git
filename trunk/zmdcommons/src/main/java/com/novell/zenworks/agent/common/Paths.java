/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename Paths.java
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

import java.io.File;
import java.util.Locale;

public class Paths
{

    public static String PREFIX = null;
    public static String SYSCONFDIR = null;
    public static String CONF_DIR = null;
    public static String BINDIR = null;
    public static String VAR_DIR = null;
    public static String LOG_DIR = null;
    public static String MODULE_PATH = null;
    public static String LIB_PATH = null;
    public static String LANG_PATH = null;
    public static String HANDLER_PATH = null;
    public static String PASSWORD_FILE = null;
    public static String INITIAL_WEB_SERVICE_FILE = null;
    public static String INITIAL_FILE_SERVICE_FILE = null;
    public static String CACHE_PATH = null;
    public static String CACHE_DB_PATH = null;
    public static String RESOURCE_DIR = null;
    public static String SHARE_DIR = null;
    public static String CA_CERT_FILE = null;
    public static String CA_CERT_DIR = null;
    public static String WORKING_DATA_PATH = null;
    public static String WORKING_PATH = null;
    public static String IMG_ADDONS = null;
    public static String STATUS_PATH = null;
    public static String HELP_DIR = null;
    public static String TRACE_PATH = null;
    public static String CERT_FILES_PATH = null;
    public static String PLUGIN_PATH = null;
    public static String JAVA_LIB_BASE_PATH = null;
    public static String CORE_BUNDLE_PATH = null;
    
    public static String PREFERENCE_FILE_PATH = null;
    public static String RUNTIME_PROPS_FILE_PATH = null;
    public static String TEMP_OSTARGET_PATH = null; // for DEMO 1
    
    private static String m_installPath = null;


    /// <summary>
    /// This will get where the files for this application are installed
    /// </summary>
    /// <returns></returns>
    static
    {
        m_installPath = "/opt/novell/zenworks";
        InitializeBuildConfig(m_installPath);
    }

    public static void InitializeBuildConfig(String installPath)
    {

        String os = System.getProperty("os.name");

        if (os!= null && !os.toLowerCase().contains("win"))
        {
            
            
            installPath = "/opt/novell/zenworks";
            
            // We need to dynamically discover some of these locations in the future to make
            // setting up a debug environment a bit easier. For now hard coding will suffice.
            PREFIX = installPath;
            SYSCONFDIR = "/etc/opt/novell/zenworks";
            CONF_DIR = SYSCONFDIR + File.separator + "conf";
            BINDIR = PREFIX + File.separator + "bin";
            VAR_DIR = "/var/opt/novell/zenworks";
            LOG_DIR = VAR_DIR + File.separator + "logs";
            WORKING_PATH = VAR_DIR + File.separator + "work";
            WORKING_DATA_PATH = WORKING_PATH + File.separator + "DATA";
            IMG_ADDONS = WORKING_PATH + File.separator + "addons";
            HELP_DIR = PREFIX + File.separator + "help";
            STATUS_PATH = VAR_DIR + File.separator + "zmd/status";
            RESOURCE_DIR = PREFIX + File.separator + "resources";
            SHARE_DIR = PREFIX + File.separator + "share";
            LIB_PATH = PREFIX + File.separator + "lib";
            LANG_PATH = PREFIX + File.separator + "lang";
            MODULE_PATH = BINDIR + File.separator + "modules";
            HANDLER_PATH =BINDIR + File.separator + "handlers";
            INITIAL_WEB_SERVICE_FILE = SYSCONFDIR + File.separator + "initial-web-service";
            INITIAL_FILE_SERVICE_FILE = SYSCONFDIR + File.separator + "initial-file-service";
            PASSWORD_FILE = SYSCONFDIR + File.separator + "zmd.passwd";
            CACHE_PATH = VAR_DIR + File.separator + "zmd/cache";
            CACHE_DB_PATH = VAR_DIR + File.separator + "zmd/cachedb";
            CA_CERT_DIR = SYSCONFDIR + File.separator + "security";
            CA_CERT_FILE = CA_CERT_DIR + File.separator + "ca.cert";
            TRACE_PATH = "/usr/logs";
            CERT_FILES_PATH = SYSCONFDIR + File.separator + "certs";
            JAVA_LIB_BASE_PATH = installPath + File.separator + "zmd" + File.separator + "java" + File.separator + "lib";
            CORE_BUNDLE_PATH = JAVA_LIB_BASE_PATH + File.separator + "core";
            PLUGIN_PATH = JAVA_LIB_BASE_PATH + File.separator + "plugins";       
            PREFERENCE_FILE_PATH = SYSCONFDIR + File.separator + "zenworks.properties";
            RUNTIME_PROPS_FILE_PATH = VAR_DIR + File.separator + "runtime.properties";
        }
        else
        {
            // for windows
            //MBD initialize for other platforms
            // We get the install path from the ZENWORKS_HOME environment variable.
            installPath = System.getenv("ZENWORKS_HOME");//"\\novell\\osgi\\zenworks";
            if(installPath == null)
                installPath = System.getenv("SystemDrive") + "\\novell\\zenworks";
            PREFIX = installPath;
            SYSCONFDIR = PREFIX + File.separator + "conf";
            CONF_DIR = SYSCONFDIR;
            BINDIR = PREFIX + File.separator + "bin";
            VAR_DIR = PREFIX + File.separator + "var";
            LOG_DIR = VAR_DIR + File.separator + "logs";
            WORKING_PATH = VAR_DIR + File.separator + "work";
            WORKING_DATA_PATH = WORKING_PATH + File.separator + "DATA";
            IMG_ADDONS = WORKING_PATH + File.separator + "addons";
            HELP_DIR = PREFIX + File.separator + "help";
            STATUS_PATH = VAR_DIR + File.separator + "zmd\\status";
            RESOURCE_DIR = PREFIX + File.separator + "resources";
            SHARE_DIR = PREFIX + File.separator + "share";
            LIB_PATH = PREFIX + File.separator + "lib";
            LANG_PATH = PREFIX + File.separator + "lang";
            MODULE_PATH = BINDIR + File.separator + "modules";
            HANDLER_PATH =BINDIR + File.separator + "handlers";
            INITIAL_WEB_SERVICE_FILE = SYSCONFDIR + File.separator + "initial-web-service";
            INITIAL_FILE_SERVICE_FILE = SYSCONFDIR + File.separator + "initial-file-service";
            PASSWORD_FILE = SYSCONFDIR + File.separator + "zmd.passwd";
            CACHE_PATH = VAR_DIR + File.separator + "zmd\\cache";
            CACHE_DB_PATH = VAR_DIR + File.separator + "zmd\\cachedb";
            CA_CERT_DIR = SYSCONFDIR + File.separator + "security";
            CA_CERT_FILE = CA_CERT_DIR + File.separator + "ca.cert";
            TRACE_PATH = "\\trace\\log";
            CERT_FILES_PATH = SYSCONFDIR + File.separator + "certs";
            JAVA_LIB_BASE_PATH = installPath + File.separator + "java" + File.separator + "lib";
            CORE_BUNDLE_PATH = JAVA_LIB_BASE_PATH + File.separator + "core";
            PLUGIN_PATH = JAVA_LIB_BASE_PATH + File.separator + "plugins";  
            PREFERENCE_FILE_PATH = SYSCONFDIR + File.separator + "zenworks.properties";
            RUNTIME_PROPS_FILE_PATH = VAR_DIR + File.separator + "runtime.properties";
        }
    }

    /*
     * @method getHelpDirectory Retrieves the Help Directory
     * @param Locale locale.
     * @return String help directory.
     */
    public static String getHelpDirectory(Locale locale)
    {
        String helpDir = Paths.HELP_DIR + File.separator +"en"; //variable for help directory; defaulted to English
        
        //determine the help directory
        if(locale.getLanguage() != null)
        {            
            helpDir =  Paths.HELP_DIR + File.separator + locale.getLanguage() + "-" + locale.getCountry();
        }
        
        //Check if the helpDir exists. If not (say ko-KO does not exist) then default to English.
        File dir = new File(helpDir);
        if(!dir.exists())
        {
            helpDir = Paths.HELP_DIR + File.separator +"en";
        }
        
        return helpDir;
    }
}
