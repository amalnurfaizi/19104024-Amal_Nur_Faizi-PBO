package com.amalfaizi.Pertemuan3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("19104014", "Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Rimuru\t", 19104099);
        Mahasiswa mahasiswa2 = new Mahasiswa("Veldora\t", 19104088);
        Mahasiswa mahasiswa3 = new Mahasiswa("Korosensei", 19104077);

        // List Mahasiswa dari Class Demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Karma\t", 19104055));

        // Untuk copas data dari list mahasiswa class "demoJurusan" ke class "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        // Untuk masukan data Mahasiswa langsung ke class Jurusan
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();

    }
}
