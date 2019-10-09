/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan28gantikata;

import java.util.Scanner;

/**
 *
  * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program ganti kata
 */
public class PBO10118045Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("Masukkan Kalimat : ");
        Scanner klm = new Scanner(System.in);
        String kalimat = klm.nextLine();
        System.out.print("Ganti Kata : ");
        Scanner gnt = new Scanner(System.in);
        String ganti = gnt.next();
        System.out.print("Menjadi Kata : ");
        Scanner mjd = new Scanner(System.in);
        String menjadi = mjd.next();
        System.out.println("");
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat Awal\t: " +kalimat);
        System.out.println("Kalimat Baru\t: " +kalimat.replaceAll(ganti, menjadi));
        
        
        
                
    }
    
}
