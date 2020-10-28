package com.amalfaizi.Pertemuan2.Praktikum.Inheritence;

public class DemoInheritence {
    public static void main(String[] args) {
        A superclass = new A ();
        B subclass = new B ();

        System.out.println("Massukan data ke SuperClass");
        superclass.x = 10;
        superclass.y = 50;
        superclass.printXY();

        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.printXY();
        subclass.sumValue();
    }
}
