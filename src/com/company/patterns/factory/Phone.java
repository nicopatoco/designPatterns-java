package com.company.patterns.factory;

public class Phone implements Computer {

    @Override
    public void compute() {
        System.out.println("phone computes");
    }
}
