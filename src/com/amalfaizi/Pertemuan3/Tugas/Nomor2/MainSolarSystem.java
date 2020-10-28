package com.amalfaizi.Pertemuan3.Tugas.Nomor2;

import java.util.ArrayList;
import java.util.List;

public class MainSolarSystem {
    public static void main(String[] args) {
        // Objek solar_system
        Solar_System solarSystem = new Solar_System("32012", "Alam Semesta");

        // memberi nilai baru ke planet
        Planet planet1 = new Planet(1010, 1, "Merkurius");
        Planet planet2 = new Planet(2020, 2, "Venus");
        Planet planet3 = new Planet(3030, 3, "Bumi");
        Planet planet4 = new Planet(4040, 4, "Mars");
        Planet planet5 = new Planet(5050, 5, "Yupiter");
        Planet planet6 = new Planet(6060, 6, "Saturnus");
        Planet planet7 = new Planet();

        // Mengisi data dengan set
        planet7.setIdPlanet(7070);
        planet7.setUrutanPlanet(7);
        planet7.setNamaPlanet("Uranus");

        // List Mahasiswa dari Class Main
        List<Planet> planetList = new ArrayList<>();
        // menambahkan ke array planetlist dengan method add
        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);

        // menambahkan langsung dari class Planet
        planetList.add(new Planet(8080, 8, "Neptunus"));


        // Untuk copas data dari list Rumah class "MainKomplek" ke class "Komplek"
        solarSystem.setPlanetList(planetList);

        // cetak data dari class Solar_System
        solarSystem.getData();

    }

}
