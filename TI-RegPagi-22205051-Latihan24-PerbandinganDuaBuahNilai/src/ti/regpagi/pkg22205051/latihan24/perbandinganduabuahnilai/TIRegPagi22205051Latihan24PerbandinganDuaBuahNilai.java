/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program perbandingan dua buah nilai 
 */
public class TIRegPagi22205051Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("======== Program Perbandingan Nilai ========");
            System.out.print("Masukkan nilai pertama: ");
            double nilaiPertama = input.nextDouble();

            System.out.print("Masukkan nilai kedua: ");
            double nilaiKedua = input.nextDouble();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: Nilai pertama lebih besar dari nilai kedua.");
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: Nilai kedua lebih besar dari nilai pertama.");
            } else {
                System.out.println("Hasil: Nilai pertama sama dengan nilai kedua.");
            }

            System.out.print("Ulangi aktivitas? (Ya/Tidak): ");
            ulangi = input.next();

        } while (ulangi.equalsIgnoreCase("Ya"));
    }
}