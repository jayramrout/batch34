package com.jrout.tutorial.rmi;

import com.jrout.tutorial.rmi.impl.CalculatorImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        ICalculator calculator = new CalculatorImpl();
//        System.out.println(calculator.add(2,3));
        Registry registry = LocateRegistry.createRegistry(2345);
        registry.rebind("Calculator",calculator);
        System.out.println("Server is started.....");
    }
}
