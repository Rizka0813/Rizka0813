/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program rata-rata nilai 
 */
public class TIRegPagi22205051Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input banyaknya mahasiswa
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int banyakMahasiswa = input.nextInt();

        // Inisialisasi array nilai mahasiswa
        double[] nilaiMahasiswa = new double[banyakMahasiswa];

        // Input nilai mahasiswa
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();
        }

        // Hitung rata-rata nilai mahasiswa
        double rataRata = 0.0;
        for (int i = 0; i < banyakMahasiswa; i++) {
            rataRata += nilaiMahasiswa[i];
        }
        rataRata /= banyakMahasiswa;

        // Cetak rata-rata nilai mahasiswa
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
    }
}