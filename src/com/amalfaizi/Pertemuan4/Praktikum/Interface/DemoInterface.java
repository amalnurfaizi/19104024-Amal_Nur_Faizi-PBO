package com.amalfaizi.Pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paketA = new Paket("PBO", "Amal", 800000, "10gb", 90000);

        paketA.hitungHargaPaket();
        paketA.cetakPaket();
    }
}
