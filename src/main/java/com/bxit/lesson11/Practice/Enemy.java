package com.bxit.lesson11.Practice;

public class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= health > damage ? damage : health;
        if (health == 0){
            System.out.println(getName() + " is dead!");
        }
        else {
            System.out.println(damage + " damage was taken!");
            System.out.println("The remain health: " + getHealth());
            System.out.println();
        }
    }
}
