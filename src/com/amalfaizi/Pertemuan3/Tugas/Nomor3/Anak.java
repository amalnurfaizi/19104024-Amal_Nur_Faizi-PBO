package com.amalfaizi.Pertemuan3.Tugas.Nomor3;

public class Anak {
    // Inisiasi Variable
    private int idAnak;
    private String namaAnak;
    private int umurAnak;
    private String statusAnak;

    // Constructor dengan parameter
    public Anak(int idAnak, String namaAnak, int umurAnak, String statusAnak) {
        this.idAnak = idAnak;
        this.namaAnak = namaAnak;
        this.umurAnak = umurAnak;
        this.statusAnak = statusAnak;
    }

    // Getter
    public int getIdAnak() {
        return idAnak;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public int getUmurAnak() {
        return umurAnak;
    }

    public String getStatusAnak() {
        return statusAnak;
    }
}
