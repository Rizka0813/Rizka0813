/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan.pkg20.targetsaldotabungan;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program target saldo tabungan 
 */
public class TIRegPagi22205051Latihan20TargetSaldoTabungan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###.###");
        System.out.println("Perhitungan lama tabungan sampai mencapai saldo target.");
        
        System.out.print("Saldo Awal : Rp. ");
        double saldoAwal = input.nextDouble();

        System.out.print("Bunga/Bulan(%) : ");
        double bungaBulanan = input.nextDouble() / 100; // Bunga per bulan

        System.out.print("Saldo Target : Rp. ");
        double saldoTarget = input.nextDouble();

        System.out.println("\nOutput keluaran dari awal scanner:");

        System.out.println("run:");
        int bulan = 1;
        while (saldoAwal < saldoTarget) {
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + df.format(saldoAwal));
            saldoAwal += saldoAwal * bungaBulanan; // Hitung bunga bulanan
            bulan++;
        }
    }
}