package com.company.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonLogger singletonLogger = SingletonLogger.getInstance();

        singletonLogger.logMessage("First message");
        singletonLogger.logMessage("Second message");
        singletonLogger.logMessage("Third message");
        System.out.println(singletonLogger.getMessages());

        SingletonLogger newSingletonInstance = SingletonLogger.getInstance();
        System.out.println(singletonLogger.getMessages());
    }
}
