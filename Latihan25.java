/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan25;
import java.util.Scanner;
/**
 *
 * @author user 
 Nama              : Bintang Fajar Nusantara 
 Nim               : 22205028 
 Prodi             : Teknik Informatika 
 Kelas             : PBO 1
 Deskripsi Program : Program ini berisi program Ejaan Nama
 */
public class Latihan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Ejaan Nama");

        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
    }
}

    

