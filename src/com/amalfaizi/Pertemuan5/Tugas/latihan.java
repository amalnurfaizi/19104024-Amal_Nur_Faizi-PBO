package com.amalfaizi.Pertemuan5.Tugas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class latihan {
    static Scanner scanner = new Scanner(System.in);
    static int[] arrVisitor = new int[10];
    static int hit, index, input;
    static char again;

    public static void main(String[] args) {

        try {

            System.out.println("<-- Pelanggan -->");
            System.out.print("Jumlah pengunjung\t: ");
            hit = scanner.nextInt();
            input = arrVisitor[hit];
            System.out.println("Masukkan Data Pengunjung\t: ");
            for (int i = 0; i < hit; i++) {
                System.out.print("UID\t: ");
                arrVisitor[i] = scanner.nextInt();
                System.out.println("Data ke-" + i + "\t: " + arrVisitor[i] + " terdaftar !");
            }


            System.out.println("\nLihat Data Pengunjung\t: ");

            do {

                System.out.print("Indeks\t: ");
                index = scanner.nextInt();
                System.out.println("Data ke-" + index + "\t: " + arrVisitor[index]);
                System.out.print("Lihat lagi?\t (y/n)\t: ");
                again = scanner.next().toUpperCase().charAt(0);
                if (again == 'n') {
                    System.exit(0);
                }

            } while (again == 'Y');


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nData Tidak boleh melebihi batas dari array pengunjung max[10]\n");
            System.out.print("Jumlah pengunjung\t: ");
            hit = scanner.nextInt();
            input = arrVisitor[hit];
            System.out.println("Masukkan Data Pengunjung\t: ");
            for (int i = 0; i < hit; i++) {
                System.out.print("UID\t: ");
                arrVisitor[i] = scanner.nextInt();
                System.out.println("Data ke-" + i + "\t: " + arrVisitor[i] + " terdaftar !");
            }


            System.out.println("\nLihat Data Pengunjung\t: ");

            do {

                System.out.print("Indeks\t: ");
                index = scanner.nextInt();
                System.out.println("Data ke-" + index + "\t: " + arrVisitor[index]);
                System.out.print("Lihat lagi?\t (y/n)\t: ");
                again = scanner.next().toUpperCase().charAt(0);
                if (again == 'n') {
                    System.exit(0);
                }

            } while (again == 'Y');
        } catch (InputMismatchException e) {
            scanner.next();
            System.out.println("\nInputan harus berupa angka/integer !\n");
            System.out.println("Masukkan Data Pengunjung\t: ");
            for (int i = 0; i < hit; i++) {
                System.out.print("UID\t: ");
                arrVisitor[i] = scanner.nextInt();
                System.out.println("Data ke-" + i + "\t: " + arrVisitor[i] + " terdaftar !");
            }


            System.out.println("\nLihat Data Pengunjung\t: ");

            do {

                System.out.print("Indeks\t: ");
                index = scanner.nextInt();
                System.out.println("Data ke-" + index + "\t: " + arrVisitor[index]);
                System.out.print("Lihat lagi?\t (y/n)\t: ");
                again = scanner.next().toUpperCase().charAt(0);
                if (again == 'n') {
                    System.exit(0);
                }
            } while (again == 'Y');
        }
    }
}