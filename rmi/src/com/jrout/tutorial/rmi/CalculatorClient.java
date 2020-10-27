package com.jrout.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 2345);
        ICalculator calculator = (ICalculator)registry.lookup("Calculator");
        System.out.println(calculator.add(3,3));
    }
}
