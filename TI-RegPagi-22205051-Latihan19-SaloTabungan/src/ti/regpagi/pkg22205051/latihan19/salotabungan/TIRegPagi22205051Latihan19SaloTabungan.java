/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan19.salotabungan;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program saldo tabungan 
 */
public class TIRegPagi22205051Latihan19SaloTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaBulan = 15;
        int lamaBulan = 6;

        // Hitung bunga per bulan
        double bungaPerBulan = saldoAwal * bungaBulan / 100;

        // Hitung saldo akhir setiap bulan
        double saldoAkhir = saldoAwal;
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAkhir += bungaPerBulan;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAkhir);
        }
    }
    }