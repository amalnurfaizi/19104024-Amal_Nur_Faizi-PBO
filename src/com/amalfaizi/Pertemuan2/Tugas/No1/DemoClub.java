package com.amalfaizi.Pertemuan2.Tugas.No1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Club
        Club club1 = new Club();
        Club club2 = new Club("Real Madrid");
        Club club3 = new Club("Real Madrid", " Real Madrid adalah sebuah klub sepak bola yang berasal dari Benua Eropa");
        Club club4 = new Club("Real Madrid", 1902, "Santiago Bernabeu");
        Club club5 = new Club("Real Madrid", 1902, "Santiago Bernabeu", 13, "Real Madrid adalah sebuah klub sepak bola yang berasal dari Benua Eropa");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
