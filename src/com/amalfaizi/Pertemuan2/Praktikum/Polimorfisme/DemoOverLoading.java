package com.amalfaizi.Pertemuan2.Praktikum.Polimorfisme;

public class DemoOverLoading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu ("DearGod");
        Lagu lagu2 = new Lagu ("DearGod", "A7X");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
