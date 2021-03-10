package com.company.patterns.abstractFactory;

public class PortableComputerFactory extends AbstractFactory{
    @Override
    public Computer getComputer(String computer) {
        switch (computer) {
            case "laptop":
                return new Laptop();
            case "phone":
                return new Phone();
            default:
                return null;
        }
    }
}
