package com.company.patterns.strategy;

public class Main {

    public static void main(String[] args) {
        Context addContext = new Context(new AddOperation());
        System.out.println(addContext.executeStrategy(10, 5));

        Context multiplyContext = new Context(new MultiplyOperation());
        System.out.println(multiplyContext.executeStrategy(10, 5));

        Context subtractContext = new Context(new SubtractOperation());
        System.out.println(subtractContext.executeStrategy(10, 5));
    }
}
