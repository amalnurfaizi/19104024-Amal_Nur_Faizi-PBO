package com.amalfaizi.Pertemuan3.Tugas.Nomor2;

import java.util.ArrayList;
import java.util.List;

public class Solar_System {
    // Inisiasi Variabel
    private String id;
    private String nama;
    private List<Planet> planetList = new ArrayList<>();

    // Constructor
    public Solar_System(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter, Setter & Method
    public void getTotalMember(int number) {
        System.out.println("Planet ke : " + number);
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void getData() {
        System.out.println("ID Tata-Surya\t: " + getId());
        System.out.println("Nama Tata-Surya\t: " + getNama());
        System.out.println("Jumlah Planet\t: " + getPlanetList().size());
        System.out.println();
        int i = 1;
        for (Planet planet : planetList) {
            //System.out.print("Planet ke : ");
            getTotalMember(i++);
            System.out.println("- ID Planet\t\t: " + planet.getIdPlanet());
            System.out.println("- Urutan Planet\t: " + planet.getUrutanPlanet());
            System.out.println("- Nama Planet\t: " + planet.getNamaPlanet());
            System.out.println();
        }
    }
}
