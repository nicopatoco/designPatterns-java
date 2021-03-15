package com.company.patterns.pokemonStrategy;

public class BodyAttackStrategy implements Attack {
    @Override
    public void executeAttack(Pokemon firstPokemon, Pokemon secondPokemon) {
        System.out.println(firstPokemon.getName() + " use your Body attack!! ");
        secondPokemon.diminishHp(10);
    }
}
