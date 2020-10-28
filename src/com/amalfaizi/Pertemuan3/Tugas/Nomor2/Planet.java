package com.amalfaizi.Pertemuan3.Tugas.Nomor2;

public class Planet {
    // Inisiasi Variabel
    private int idPlanet;
    private int urutanPlanet;
    private String namaPlanet;

    // Constructor tanpa Parameter
    public Planet() {
    }

    // Constructor dengan Parameter
    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    // Getter & Setter
    public int getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }
}
