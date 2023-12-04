package com.bxit.lesson11;

import java.util.Random;

public interface Comp {
    String EXAMPLE = "example";
    Random random = new Random();
    default void printWithRandom() {
        System.out.println(generateRandom());
        info();
    }

    void load();
    void info();

    private int generateRandom() {
        return random.nextInt(100);
    }
}
