package com.company.patterns.builder;

public class Main {

    public static void main(String[] args) {
        OnlineStoreAccount johnSmith = new OnlineStoreAccount.Builder(1l)
                .withName("JohnSmith")
                .withAddress("Oxford Lane 35A")
                .withBudget(100l)
                .withDiscount(2l)
                .build();

        OnlineStoreAccount nicoHerrera = new OnlineStoreAccount.Builder(2l)
                .withName("Nico Herrera")
                .build();

        System.out.println(johnSmith);
        System.out.println(nicoHerrera);
    }
}
