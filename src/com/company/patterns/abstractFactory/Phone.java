package com.company.patterns.abstractFactory;

public class Phone implements Computer {

    @Override
    public void compute() {
        System.out.println("phone computes");
    }
}
