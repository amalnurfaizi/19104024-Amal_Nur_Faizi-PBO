package com.amalfaizi.Pertemuan3.Tugas.Nomor1;

public class Rumah {
    // Inisiasi Variabel
    private String idRumah;
    private String pemilikRumah;
    private int jumlahOrang;

    // Constructor dengan Parameter
    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    // Getter
    public String getIdRumah() {
        return idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }
}
