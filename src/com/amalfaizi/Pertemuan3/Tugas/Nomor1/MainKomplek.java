package com.amalfaizi.Pertemuan3.Tugas.Nomor1;

import java.util.ArrayList;
import java.util.List;

public class MainKomplek {
    public static void main(String[] args) {
        // Objek komplek
        Komplek komplek = new Komplek("3240-2801-0001", "Konoha");

        // membuat rumah baru dan menginisiasikannya di parameter
        Rumah rumah1 = new Rumah("0032", "Naruto", 4);
        Rumah rumah2 = new Rumah("0100", "Sasuke", 3);
        Rumah rumah3 = new Rumah("0108", "Chouji", 3);
        Rumah rumah4 = new Rumah("0059", "Kakashi", 1);
        Rumah rumah5 = new Rumah("1010", "Shikamaru", 3);

        // List Mahasiswa dari Class Main
        List<Rumah> rumahList = new ArrayList<>();

        rumahList.add(rumah1);
        rumahList.add(rumah2);
        rumahList.add(rumah3);
        rumahList.add(rumah4);
        rumahList.add(new Rumah("2192", "Gaara", 2));

        // Mengecek jumlah data di arraylist
        komplek.setJmlRumah(rumahList.size() + 1);

        // Untuk copas data dari list Rumah class "MainKomplek" ke class "Komplek"
        komplek.setIdRumah(rumahList);

        // Untuk masukan data Rumah langsung ke class Komplek
        komplek.addRumah(rumah5);

        komplek.getDataKomplek();
    }
}
