package com.company.patterns.abstractFactory;

public class ComputerFactory extends AbstractFactory {
    @Override
    public Computer getComputer(String computer) {
        switch (computer) {
            case "laptop":
                return new Laptop();
            case "phone":
                return new Phone();
            case "smartTv":
                return new SmartTv();
            default:
                return null;
        }
    }
}
