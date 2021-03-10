package com.company.patterns.factory;

public class ComputerFactory {
    public Computer getComputer(String computer) {
        switch (computer) {
            case "phone":
                return new Phone();
            case "smartTv":
                return new SmartTv();
            default:
                return new Laptop();
        }
    }
}
