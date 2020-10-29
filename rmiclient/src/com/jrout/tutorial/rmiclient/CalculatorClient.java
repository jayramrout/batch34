package com.jrout.tutorial.rmiclient;

import com.jrout.tutorial.rmi.ICalculator;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 2345);
        Remote calculator = registry.lookup("Calculator");
        ICalculator calcInterface = (ICalculator)calculator;
        System.out.println(calcInterface.add(3,4));
    }
}
