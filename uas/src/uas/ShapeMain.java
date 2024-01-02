/**
 * Nama        : Rizka Yuniarti 
 * Prodi       : Teknik Informatika 
 * Semester    : 3 
 * Mata kuliah : PBO
 */
package UAS2;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perhitungan luas lingkaran
        System.out.println("Perhitungan Luas Lingkaran");

        System.out.print("Masukkan warna lingkaran: ");
        String colorCircle = scanner.nextLine();

        System.out.print("Masukkan radius lingkaran: ");
        double radius = scanner.nextDouble();
        
        // Membersihkan newline yang tersisa
        scanner.nextLine();

        Circle circle = new Circle(colorCircle, radius);

        System.out.println("Luas Lingkaran: " + circle.getArea());

        // Perhitungan luas persegi panjang
        System.out.println("");
        System.out.println("Perhitungan Luas Persegi Panjang");

        System.out.print("Masukkan warna persegi panjang: ");
        String colorRectangle = scanner.nextLine();

        System.out.print("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();
        
        // Membersihkan newline yang tersisa
        scanner.nextLine();

        System.out.print("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();
        
        // Membersihkan newline yang tersisa
        scanner.nextLine();

        Rectangle rectangle = new Rectangle(colorRectangle, length, width);

        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());

        scanner.close();
    }
}
