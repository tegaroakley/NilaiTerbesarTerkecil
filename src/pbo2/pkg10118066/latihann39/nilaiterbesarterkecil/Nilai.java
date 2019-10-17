/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihann39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author DRAGON
 */
public class Nilai {
    Scanner scanner = new Scanner(System.in);   
    public String nama;
    public int mhs;
    public int banyaknilai;
    public int[] nilaimhs;
    public int max;
    public int min;
    
    
    public void memasukkanNilai(){
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyaknilai = scanner.nextInt();
       nilaimhs = new int[banyaknilai];
        for (int i = 0 ; i < banyaknilai; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1) +" = ");
            nilaimhs[i] = scanner.nextInt();    
        }
    }
    public void hasiNilai(){
        max = nilaimhs[0];
        min = nilaimhs[0];
        for (int j = 0 ; j < banyaknilai; j++){
           System.out.println("Nilai Mahasiswa Ke-"+ (j+1) +" = " + nilaimhs[j]);
           if (max < nilaimhs[j]) 
               max = nilaimhs[j];
           if (min > nilaimhs[j]) 
               min = nilaimhs[j];
        }
    }
    
}
