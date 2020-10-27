package com.jrout.tutorial.rmi.impl;

import com.jrout.tutorial.rmi.ICalculator;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements ICalculator, Serializable {

    public CalculatorImpl() throws RemoteException{
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }
}
