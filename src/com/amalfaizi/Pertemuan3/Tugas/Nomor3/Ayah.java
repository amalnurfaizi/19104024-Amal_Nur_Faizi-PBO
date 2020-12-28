package com.amalfaizi.Pertemuan3.Tugas.Nomor3;

public class Ayah {
    // Inisiasi Variabel
    private int idAyah;
    private String namaAyah;
    private int umurAyah;

    // Constructor dengan parameter
    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    // Getter
    public int getIdAyah() {
        return idAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }
}
