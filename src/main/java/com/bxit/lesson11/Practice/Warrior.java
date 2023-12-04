package com.bxit.lesson11.Practice;

public class Warrior extends Hero {
    private int health = 170;
    private final int DAMAGE = 45;
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The " + getName() + " is attacking " + enemy.getName());
        enemy.takeDamage(DAMAGE);

    }
}
