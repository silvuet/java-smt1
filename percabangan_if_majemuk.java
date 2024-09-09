/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p.belajar.java;
import java.util.Scanner;
/**
 *
 * @author ekasa
 */
public class percabangan_if_majemuk {
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        /*System.out.println ("Masukkan nama : ");
        String nama = input.nextLine();
        
        System.out.println ("Masukkan pekerjaan : ");
        String pekerjaan = input.nextLine();
        
        //Kondisi 1
        if(!nama.isEmpty()&& pekerjaan.equalsIgnoreCase ("Programmer")){
        System.out.println("Hallo" + nama + ".Anda menantu idaman!" + pekerjaan);
        
        //Kondisi 2
    }else if (!nama.isEmpty()&& pekerjaan.equalsIgnoreCase ("Designer")) {
        System.out.println ("Hallo" + nama + ".Anda menantu baik!" + pekerjaan);
        
        //Kondisi 3
        }else if (!nama.isEmpty()&& pekerjaan.equalsIgnoreCase ("Programmer dan Designer")) {
        System.out.println ("Hallo" + nama + ".Anda menantu baik!" + pekerjaan);
        
        //Kondisi 4
    }else{
            System.out.println ("Tidak jadi menantu");
            }
    }
}*/
            
        System.out.println ("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println ("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        //Kondisi 1
        if(nilai >=80){
        System.out.println("Sangat baik");
        
        //Kondisi 2
    }else if (nilai >=70) {
        System.out.println ("Baik");
        
        //Kondisi 3
        }else if (nilai >=60) {
        System.out.println ("Cukup");
        
        //Kondisi 4
    }else{
            System.out.println ("Kurang");
            }
    }
}
        
        
        
        
        
        
        
        
   
