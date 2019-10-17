/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihann39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihann39NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        System.out.println("=======Program Nilai Terbesar dan Terkecil Mahasiswa=======");
        System.out.print("Masukkan Nama Petugas : ");
        nilai.nama = scanner.next();
        nilai.memasukkanNilai();
        System.out.println(" ");
        System.out.println("======Hasil Nilai Mahasiswa======");
        nilai.hasiNilai();
        System.out.println(" ");
        System.out.println("Nilai Terbesar Adalah : " + nilai.max);
        System.out.println("Nilai Terkecil Adalah : " + nilai.min);
        System.out.println(" ");
        System.out.println("Petugas : " + nilai.nama);
        
    }
    
}
