package com.bxit.lesson11.Practice;

import java.sql.PreparedStatement;
import java.util.Random;

public abstract class Hero {
    private String name;
    private Random random = new Random();

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

}
