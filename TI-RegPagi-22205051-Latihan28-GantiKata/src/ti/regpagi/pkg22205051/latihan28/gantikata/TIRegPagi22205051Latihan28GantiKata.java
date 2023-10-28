/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program ganti kata 
 */
public class TIRegPagi22205051Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("====Program Mengganti Kata====");
            System.out.print("Masukkan Kalimat: ");
            String kalimat = input.nextLine();
            System.out.print("Ganti Kata: ");
            String kataGanti = input.nextLine();
            System.out.print("Menjadi Kata: ");
            String kataBaru = input.nextLine();
            
            // hasil formatting
            System.out.println("====Hasil Formatting====");
            System.out.println("Kalimat awal: ");
            System.out.println(kalimat);
            System.out.println("Kalimat baru:");
            String kalimatBaru = kalimat.replaceAll(kataGanti, kataBaru);
            System.out.println(kalimatBaru);
        }
    }   }