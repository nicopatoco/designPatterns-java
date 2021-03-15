package com.company.patterns.pokemonStrategy;

public class Context {
    private Attack attack;

    public Context(Attack attack) {
        this.attack = attack;
    }

    public void executeStrategy(Pokemon firstPokemon, Pokemon secondPokemon) {
        attack.executeAttack(firstPokemon, secondPokemon);
    }
}
