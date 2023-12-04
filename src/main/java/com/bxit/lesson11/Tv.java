package com.bxit.lesson11;

public class Tv extends Computer{
    int diag;
    public Tv(Ssd ssd, Ram ram, int diag){
        super(ssd, ram);
        this.diag = diag;
    }
    @Override
    public void load() {
        System.out.println("I ve switched on (tv)");
    }

    @Override
    public void info() {
        super.info();
    }
}
