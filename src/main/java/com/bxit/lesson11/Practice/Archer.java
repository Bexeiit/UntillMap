package com.bxit.lesson11.Practice;

public class Archer extends Hero{
    private int health = 120;
    private final int DAMAGE = 35;
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The " + getName() + " is attacking " + enemy.getName());
        enemy.takeDamage(DAMAGE);
    }
}
