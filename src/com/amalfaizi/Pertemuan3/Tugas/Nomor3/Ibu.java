package com.amalfaizi.Pertemuan3.Tugas.Nomor3;

public class Ibu {
    // Inisiasi Variabel
    private int idIbu;
    private String namaIbu;
    private int umurIbu;

    // Constructor dengan Parameter
    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    // Getter
    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }
}
