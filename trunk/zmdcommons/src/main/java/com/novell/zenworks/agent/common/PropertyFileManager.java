/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename PropertyFileManager.java
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileManager {

    protected String filePath = null;
    protected String fileComments = null;
    protected Properties properties = new Properties();

    public PropertyFileManager(String filePath, String fileComments) {
        try {
            try {
                this.filePath = filePath;
                this.fileComments = fileComments;
                properties.load(new FileInputStream(new File(filePath)));
            } catch (FileNotFoundException e) {
                // create empty file
                persistToFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(String.format("Property file manager for file: %s could not be generated: %s", filePath, e.toString()));
        }
    }

    /**
     * Persists the in memory properties to the properties file
     * 
     * @throws IOException
     */
    private void persistToFile() throws IOException {
        FileOutputStream stream = null;

        try {
            stream = new FileOutputStream(new File(filePath));
            properties.store(stream, fileComments);
        } finally {
            if (stream != null)
                stream.close();
        }
    }

    /**
     * Sets a property to a specified value.
     * 
     * @param key
     *            Name of the property to be set
     * 
     * @param value
     *            Value to be assigned to the property. 
     *            
     * @return the previous value of the specified key in this property list, or
     *         null if it did not have one
     */
    public synchronized Object setProperty(String key, Object value) throws IOException {

        Object oldValue = properties.setProperty(key, value.toString());
        persistToFile();

        return oldValue;
    }
    
    /**
     * Retrieves the String value of the specified property
     * 
     * @param key
     *            property name   
     * @return String value of the property if set, or the specified default
     *         value in case the preference is not currently set
     */
    public synchronized String getProperty(String key) {
        return properties.getProperty(key);
    }

}
