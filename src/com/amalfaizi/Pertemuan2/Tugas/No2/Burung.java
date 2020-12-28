package com.amalfaizi.Pertemuan2.Tugas.No2;

public class Burung extends Binatang {

    // Inisiasi variabel
    public String nama;
    public String terbang;

    // Method getName untuk mencetak nama
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas
    public void terbang(){
        System.out.println("Aktivitas\t\t: " + terbang);
    }
}
