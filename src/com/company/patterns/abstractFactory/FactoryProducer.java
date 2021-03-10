package com.company.patterns.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(Boolean portable) {
        if(portable) {
            return new PortableComputerFactory();
        } else {
            return new ComputerFactory();
        }
    }
}
