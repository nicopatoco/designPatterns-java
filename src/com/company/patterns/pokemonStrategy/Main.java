package com.company.patterns.pokemonStrategy;

public class Main {

    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander", 43, 52, 65, 39);
        Pokemon squirtle = new Pokemon("squirtle", 60, 40, 65, 39);

        Context firstPokemon = new Context(charmander.getMyAttack());
        Context SecondPokemon = new Context(squirtle.getMyAttack());
        // Lets Battle
        System.out.println(charmander);
        System.out.println(squirtle);
        // First Pokemon attacks
        firstPokemon.executeStrategy(charmander, squirtle);
        System.out.println(charmander);
        System.out.println(squirtle);
        // Second Pokemon attacks
        SecondPokemon.executeStrategy(squirtle, charmander);
        System.out.println(charmander);
        System.out.println(squirtle);
        // First Pokemon attacks
        charmander.setMyAttack(new FireBlastAttackStrategy());
        firstPokemon = new Context(charmander.getMyAttack());
        firstPokemon.executeStrategy(charmander, squirtle);
        System.out.println(charmander);
        System.out.println(squirtle);
        // ...
    }
}
