package com.amalfaizi.Pertemuan2.Praktikum.Polimorfisme;

public class DemoOverRiding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Mati Listrik");
        subClass.getValue("Mati Lampu");
    }
}
