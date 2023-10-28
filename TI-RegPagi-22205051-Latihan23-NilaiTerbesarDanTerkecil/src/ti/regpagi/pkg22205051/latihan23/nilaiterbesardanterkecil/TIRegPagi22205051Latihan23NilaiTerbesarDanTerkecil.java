/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program nilai terbesar dan terkecil 
 */
public class TIRegPagi22205051Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
            System.out.print("Masukkan Nama Petugas: ");
            String namaPetugas = input.nextLine();
            
            System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
            int banyakNilai = input.nextInt();
            
            int[] nilaiMahasiswa = new int[banyakNilai];
            
            for (int i = 0; i < banyakNilai; i++) {
                System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
                while (!input.hasNextInt()) {
                    System.out.println("Input tidak valid. Masukkan nilai integer.");
                    System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
                    input.next();
                }
                nilaiMahasiswa[i] = input.nextInt();
            }
            
            int nilaiTerbesar = nilaiMahasiswa[0];
            int nilaiTerkecil = nilaiMahasiswa[0];
            
            for (int i = 1; i < banyakNilai; i++) {
                if (nilaiMahasiswa[i] > nilaiTerbesar) {
                    nilaiTerbesar = nilaiMahasiswa[i];
                }
                
                if (nilaiMahasiswa[i] < nilaiTerkecil) {
                    nilaiTerkecil = nilaiMahasiswa[i];
                }
            }
            
            System.out.println("=====Hasil Nilai Mahasiswa=====");
            for (int i = 0; i < banyakNilai; i++) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
            }
            
            System.out.println("Nilai Terbesar: " + nilaiTerbesar);
            System.out.println("Nilai Terkecil: " + nilaiTerkecil);
            System.out.println("Petugas: " + namaPetugas);
        }
    }
}