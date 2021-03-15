package com.company.patterns.pokemonStrategy;

public class HydroPumpAttackStrategy implements Attack {
    @Override
    public void executeAttack(Pokemon firstPokemon, Pokemon secondPokemon) {
        System.out.println("Hydro Pump Attack!");
    }
}
