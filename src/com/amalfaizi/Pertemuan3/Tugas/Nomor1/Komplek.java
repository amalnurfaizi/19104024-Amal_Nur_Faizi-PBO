package com.amalfaizi.Pertemuan3.Tugas.Nomor1;

import java.util.ArrayList;
import java.util.List;

public class Komplek {
    // Inisiasi Variabel
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah;
    private List<Rumah> idRumah = new ArrayList<>();

    // Constructor dengan Parameter
    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    public void addRumah(Rumah rumah) {
        idRumah.add(rumah);
    }

    // Getter, Setter & Method
    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    public List<Rumah> getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(List<Rumah> idRumah) {
        this.idRumah = idRumah;
    }

    public void getDataKomplek() {
        System.out.println("ID Komplek\t\t: " + getIdKomplek());
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("Jumlah Rumah\t: " + getJmlRumah());
        System.out.println();
        int i = 1;
        for (Rumah rumah : idRumah) {
            System.out.println("Rumah ke " + i);
            System.out.println("- ID Rumah\t\t: " + rumah.getIdRumah());
            System.out.println("- Pemilik Rumah\t: " + rumah.getPemilikRumah());
            System.out.println("- Jumlah Orang\t: " + rumah.getJumlahOrang());
            i++;
            System.out.println();
        }

    }

}
