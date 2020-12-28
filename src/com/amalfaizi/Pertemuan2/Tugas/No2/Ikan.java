package com.amalfaizi.Pertemuan2.Tugas.No2;

public class Ikan extends Binatang{

    // variabel
    public String nama;
    public String berenang;

    // Method getName untuk mencetak
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas
    public void berenang(){
        System.out.println("Aktivitas\t\t: " + berenang);
    }
}
