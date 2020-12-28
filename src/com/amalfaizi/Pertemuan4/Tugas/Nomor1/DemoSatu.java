package com.amalfaizi.Pertemuan4.Tugas.Nomor1;

import java.util.Random;

public class DemoSatu {
    public static void main(String[] args) {
        Employee[] employee = {
                new Commision("Amal", "1457246853", 8000000, 600000, 15, 5),
                new Salaried("Nur", "1458717191", 9000000, 700000, 25, 10),
                new ProjectPlanner("Faizi", "1458757936", 5000000, 800000, 19, 6)};

        Random pilihan = new Random();
        Employee pegawai = employee[pilihan.nextInt(employee.length)];

        System.out.println("Gaji Pegawai");
        pegawai.getGaji();
    }
}
