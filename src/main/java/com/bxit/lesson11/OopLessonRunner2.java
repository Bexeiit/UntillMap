package com.bxit.lesson11;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(512), new Ram(16), 3);
        Computer mobile = new Mobile(new Ssd(256), new Ram(6));
        Computer tv = new Tv(new Ssd(128), new Ram(8), 107);

        print(laptop,mobile,tv);
    }

    public static void print(Comp... comps){
        for (Comp comp : comps) {
            comp.printWithRandom();
        }
    }
}
