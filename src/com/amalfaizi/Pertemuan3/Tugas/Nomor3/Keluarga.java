package com.amalfaizi.Pertemuan3.Tugas.Nomor3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {
    private final String namaKeluarga;
    private final String kotaAsal;
    // Insiasi Variable
    private List<Anak> anakList = new ArrayList<>();
    private Ayah ayah;
    private Ibu ibu;

    // Constructor
    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    // Getter & Method
    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> Anaks) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = Anaks;
    }

    public List<Anak> getAnakList() {
        return anakList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public void getDataKeluarga() {

        System.out.println("==========================================");
        System.out.println("== Nama Keluarga\t : " + getNamaKeluarga() + "\t\t\t==");
        System.out.println("== Kota Asal\t\t : " + getKotaAsal() + "\t\t\t==");
        System.out.println("==========================================");

        // Mengambil data Ayah
        System.out.println("-=| Ayah |=-");
        System.out.println("ID Ayah\t\t: " + getAyah().getIdAyah());
        System.out.println("Nama Ayah\t: " + getAyah().getNamaAyah());
        System.out.println("Umur Ayah\t: " + getAyah().getUmurAyah());
        System.out.println();

        // Mengambil data Ibu
        System.out.println("-=| Ibu |=-");
        System.out.println("ID Ibu\t\t: " + getIbu().getIdIbu());
        System.out.println("Nama Ibu\t: " + getIbu().getNamaIbu());
        System.out.println("Umur Ibu\t: " + getIbu().getUmurIbu());
        System.out.println();
        // Mengambil data Anak
        for (Anak anak : anakList) {
            System.out.println("-=| Anak ke-" + anak.getIdAnak() + " |=-");
            System.out.println("Nama Anak\t: " + anak.getNamaAnak());
            System.out.println("Umur Anak\t: " + anak.getUmurAnak() + " Tahun");
            System.out.println("Status Anak\t: " + anak.getStatusAnak());
            System.out.println();
        }

    }
}
