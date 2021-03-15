package com.company.patterns.pokemonStrategy;

public class Pokemon {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private Attack myAttack;

    public Pokemon(String name, int defense, int attack, int speed, int hp) {
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.speed = speed;
        this.hp = hp;
        this.myAttack = new BodyAttackStrategy();
    }

    public Attack getMyAttack() {
        return myAttack;
    }

    public void setMyAttack(Attack myAttack) {
        this.myAttack = myAttack;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void diminishHp(int damage){
        this.hp -= damage;
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", myAttack=" + myAttack +
                '}';
    }
}
