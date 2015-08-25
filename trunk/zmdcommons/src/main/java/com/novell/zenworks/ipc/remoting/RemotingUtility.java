/*
 * ZBrowser is an embeddable browser component.
 * Copyright (C) Author: Gangadhar Nagesh Metla (Novell, Inc.)
 * nmetla74@gmail.com 
 * Version 1.0
 * 1/3/2009
 * Filename RemotingUtility.java
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
package com.novell.zenworks.ipc.remoting;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.novell.zenworks.agent.common.RuntimeProperties;

/**
 * Utility class to abstract IPC tasks like binding and looking up remote
 * objects
 * 
 */
public class RemotingUtility {

    // this one time static initialization is important since rmi port changes
    // should mandate agent restart
    static final int rmiPort = Integer.parseInt(RuntimeProperties.getInstance().getProperty(RemotingConstants.RMI_PORT_PREFERENCE));

    /**
     * This is an Utility Method to enable remoting in XplatAgent Given a key
     * and a remote object this method binds the object to the registry
     * 
     * @param key
     * @param remObj
     * @throws RemoteException
     * @throws AlreadyBoundException
     */
    public static void registerRemoteObject(String key, Remote remObj) throws RemoteException, AlreadyBoundException {

        // we want this to fail if the RMI Port in AgentPreferences is not set
        Registry registry = LocateRegistry.getRegistry("127.0.0.1",rmiPort);
        Remote remoteObj = UnicastRemoteObject.exportObject(remObj,rmiPort);
        registry.bind(key, remoteObj);

    }

    /**
     * This is an Utility method to fetch the bound objects from the RMI
     * registry
     * 
     * @param path
     * @return
     * @throws RemoteException
     * @throws NotBoundException
     */
    public static Remote getRemoteObject(String path) throws RemoteException, NotBoundException {
        // we want this to fail if the RMI Port in AgentPreferences is not set
        Registry registry = LocateRegistry.getRegistry("127.0.0.1",rmiPort);
        Remote remoteObj = registry.lookup(path);
        return remoteObj;
    }

}
