package com.company.patterns.abstractFactory;

public class Main {

    public static void main(String[] args) {
        //Factories
        AbstractFactory computerFactory = FactoryProducer.getFactory(false);
        AbstractFactory portableComputerFactory = FactoryProducer.getFactory(true);
        // Computer factory
        Computer computer = computerFactory.getComputer("smartTv");
        computer.compute();
        // Portable factory
        Computer computer1 = portableComputerFactory.getComputer("phone");
        computer1.compute();
    }
}
