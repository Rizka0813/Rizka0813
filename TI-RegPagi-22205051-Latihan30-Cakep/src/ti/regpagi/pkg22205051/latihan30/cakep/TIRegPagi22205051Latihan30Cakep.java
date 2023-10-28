/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program cakep 
 */
public class TIRegPagi22205051Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
        System.out.print("\u001b[34mJawab \u001b[31m(Yoi/Enggak) \u001b[0m: ");
        String jawab = scanner.next();
        
        if (jawab.equals("Yoi")) {
            System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
        }else {
            System.out.println("""                                                
                               \n\u001b[31mTetep cakep sih.
                               \u001b[36mSing penting paham konsep nya yee.\u001b[0m""");
            System.out.println("Keep the code works dude");
        }
    }
}