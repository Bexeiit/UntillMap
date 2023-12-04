package com.bxit.lesson11.Practice;

public class Merge extends Hero{
    private int health = 150;
    private final int DAMAGE = 25;
    public Merge(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The " + getName() + " is attacking "  + enemy.getName());
        enemy.takeDamage(DAMAGE);
    }
}
