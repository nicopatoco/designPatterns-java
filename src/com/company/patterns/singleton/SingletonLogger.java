package com.company.patterns.singleton;

public class SingletonLogger {

    private static SingletonLogger instance;
    private int messages;

    private SingletonLogger() {
        this.messages = 0;
    }

    public static synchronized SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println(message);
        this.messages++;
    }

    public int getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "SingletonLogger{" +
                "messages=" + messages +
                '}';
    }
}
