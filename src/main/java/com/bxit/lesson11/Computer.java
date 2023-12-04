package com.bxit.lesson11;

public abstract class Computer implements Comp{
    private Ssd ssd;

    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();
    public void info(){
        System.out.println("Ssd: " + ssd.getValue() + " Ram: " + ram.getValue());
    };

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
