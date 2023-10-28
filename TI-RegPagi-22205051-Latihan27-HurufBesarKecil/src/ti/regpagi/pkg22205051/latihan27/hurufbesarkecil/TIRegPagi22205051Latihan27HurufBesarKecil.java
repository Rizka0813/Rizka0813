/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program huruf besar dan kecil 
 */
public class TIRegPagi22205051Latihan27HurufBesarKecil {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat: ");
            String kalimat = input.nextLine();
            
            // hasil formatting
            System.out.println("====Hasil Formatting====");
            System.out.println("Huruf Besar:");
            System.out.println(kalimat.toUpperCase());
            System.out.println("Huruf Kecil:");
            System.out.println(kalimat.toLowerCase());
        }   
    } }