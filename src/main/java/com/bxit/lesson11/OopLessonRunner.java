package com.bxit.lesson11;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(512), new Ram(16), 3);
        Computer mobile = new Mobile(new Ssd(256), new Ram(6));
        Computer tv = new Tv(new Ssd(128), new Ram(8), 107);
        loadComps(laptop,tv,mobile);
        printInfo(laptop,tv,mobile);
    }

    public static void loadComps(Computer... computers){
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                ((Laptop) computer).open();
            }
            computer.load();
            System.out.println();
        }
    }
    public static void printInfo(Computer... computers) {
        for (Computer computer : computers) {
            computer.info();
            System.out.println();
        }
    }
}
