/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program untuk menginputkan nominal
 * gaji pokok & status menikah atau belum 
 */ 
public class TIRegPagi22205051Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("=======Program Tunjangan========");
        
        System.out.print("Berapa gaji pokok anda perbulan?:");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum):");
        String status = scanner.next();
        
        System.out.println("=========Hasil Perhitungan Gaji Anda===========");
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
           tunjangan = 0.35*gaji;
        } else { 
            tunjangan = 0;
        }
        
        double totalgaji = gaji + tunjangan;
        
        System.out.println("Gaji Pokok: Rp"+gaji);
        System.out.println("Tunjangan: Rp"+tunjangan);
        System.out.println("Total gaji: Rp"+totalgaji);
    }  
}