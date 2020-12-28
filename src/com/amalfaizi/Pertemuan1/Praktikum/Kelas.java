package com.amalfaizi.Pertemuan1.Praktikum;

public class Kelas {
    private static String nama = "Paimon";
    //selain void jgn lupa pake return
    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Set Minute\t: " + setMinute());
    }
}
