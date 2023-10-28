/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program ejaan nama 
 */
public class TIRegPagi22205051Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan nama depan anda untuk di eja :");
            String nama = input.nextLine();
            
            System.out.print("Ejaan untuk nama anda adalah");
            for (int i =0; i < nama.length(); i++) {
                System.out.println("Hurud ke-" + (i + 1) + " : " + nama.charAt(i));
            }
        }
        }
    }
    