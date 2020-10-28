package com.amalfaizi.Pertemuan2.Tugas.No2;

public class DemoBinatang {
    public static void main(String[] args) {

        // Burung
        Burung burung = new Burung();
        burung.nama = "Burung Perkutut";
        burung.makan = "Biji-Bijian";
        burung.tidur = "Tidur pada malam hari";
        burung.terbang = "Burung Perkutut Terbang Menggunakan Sayap";

        // Memanggil Method
        System.out.println("\t\t\t+++ Burung +++");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Hiu";
        ikan.makan = "Ikan Paus Makan Ikan yang ada dilaut (Karnivora)";
        ikan.tidur = "Ikan Paus Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Paus Berenang Menggunakan Sirip";


        // Memanggil Method
        System.out.println("\t\t\t+++ Ikan +++");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        //Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Persia";
        kucing.makan = "Kucing Persia Makan Whiskas atau Snak Kucing";
        kucing.tidur = "Kucing Persia Pada Malam Hari";
        kucing.meong = "Kucing Persia Meong Saat Lapar";

        // Memanggil Method
        System.out.println("\t\t\t+++ Kucing +++");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();

        System.out.println();
    }
}
