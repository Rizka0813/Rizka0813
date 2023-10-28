/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti.regpagi.pkg22205051.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Acer
 * Nama  : Rizka Yuniarti
 * Kelas : PBO Reg Pagi
 * NIM   : 22205051
 * Deskripsi Program : program ini berisi program waktu pada saat ini 
 */
public class TIRegPagi22205051Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date waktuSaatIni = new Date();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss", 
                new Locale("id-ID"));
        String waktuFormat = dateFormat.format(waktuSaatIni);
        
        System.out.println("Hari ini adalah hari : " + waktuFormat);
    }}
    