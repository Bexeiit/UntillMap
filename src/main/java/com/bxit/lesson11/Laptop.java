package com.bxit.lesson11;

public class Laptop extends Computer{

    private int weight;
    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        System.out.println("I ve loaded (laptop)");
    }

    public void open(){
        System.out.println("Cap is opened (laptop)");
    }

    @Override
    public void info() {
        super.info();
    }

    public int getWeight() {
        return weight;
    }
}
