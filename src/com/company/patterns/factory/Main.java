package com.company.patterns.factory;

public class Main {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();

        Computer computer1 = computerFactory.getComputer("laptop");
        Computer computer2 = computerFactory.getComputer("phone");
        Computer computer3 = computerFactory.getComputer("smartTv");
        Computer computer4 = computerFactory.getComputer("nicolas");

        computer1.compute();
        computer2.compute();
        computer3.compute();
        computer4.compute();
    }
}
