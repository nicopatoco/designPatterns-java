package com.company.patterns.abstractFactory;

public class Laptop implements Computer {

    @Override
    public void compute() {
        System.out.println("laptop computes");
    }
}
