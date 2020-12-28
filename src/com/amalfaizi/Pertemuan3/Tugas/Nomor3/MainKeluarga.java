package com.amalfaizi.Pertemuan3.Tugas.Nomor3;

import java.util.ArrayList;
import java.util.List;

public class MainKeluarga {
    public static void main(String[] args) {
        // Objek keluarga
        Keluarga keluarga = new Keluarga("Triple A", "Jateng");

        // Memberi value
        Ayah ayah = new Ayah(2801, "Amal Nur Faizi", 20);
        Ibu ibu = new Ibu(3005, "Anya", 24);
        Anak anak = new Anak(001, "Amel", 8, "Siswa Sekolah Dasar SDN 1 Bumi bulat");
        Anak anak2 = new Anak(002, "Anyi", 1, "Masih balita");

        // array anak
        List<Anak> anakList = new ArrayList<>();
        // tambahke arraylist anak dengan method add
        anakList.add(anak);
        anakList.add(anak2);

        // memasukkan data yang diatas dengan method addAnggotakeluarga
        keluarga.addAnggotaKeluarga(ayah, ibu, anakList);

        // Mencetak data keluarga dari class keluarga
        keluarga.getDataKeluarga();
    }
}
