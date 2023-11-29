/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205051.pbo.lat56;

/**
 *
 * @author Acer
 * Nama        : Rizka Yuniarti 
 * NIM         : 22205051
 * Semester    : 3
 * Prodi       : Teknik Informatika
 * Mata Kuliah : PBO
 */
public class PBOLat56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangAntik radioAm = new BarangAntik("Radio AM", 234);

        // Menampilkan informasi barang antik
        radioAm.displayInfo();
    }
}

class BarangAntik {
    private String nama;
    private int umur;

    // Konstruktor
    public BarangAntik(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi barang antik
    public void displayInfo() {
        System.out.println("Nama barang Antik: " + nama);
        System.out.println("Umur barang antik ini adalah: " + umur + " tahun");
    }
}
    