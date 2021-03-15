package com.company.patterns.pokemonStrategy;

public class FireBlastAttackStrategy implements Attack {
    @Override
    public void executeAttack(Pokemon firstPokemon, Pokemon secondPokemon) {
        System.out.println("Fire blast Attack!");
    }
}
