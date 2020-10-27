package com.jrout.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface is known as a Marker Interface
public interface ICalculator extends Remote {
    int add(int a, int b) throws RemoteException;
}
