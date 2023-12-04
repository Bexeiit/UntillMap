package com.bxit.lesson10;

public class Task6 {

    private static long start;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 10___000; i++) {
            value.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
