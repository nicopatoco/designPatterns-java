package com.company.patterns.factory;

public class Laptop implements Computer {

    @Override
    public void compute() {
        System.out.println("laptop computes");
    }
}
