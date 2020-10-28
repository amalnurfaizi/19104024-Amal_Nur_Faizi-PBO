package com.amalfaizi.Pertemuan3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Hades");
        mahasiswa1.setNim(19104099);

        Mahasiswa mahasiswa2 = new Mahasiswa(19104088, "Zeus");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("GOW");
        dosen.setNimMhs(mahasiswa1.getNim());
        dosen.setNimMhs(mahasiswa2.getNim());

        System.out.println("Kode dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMhs(i));
        }

    }
}
