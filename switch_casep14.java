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
public class switch_casep14 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("MENU");
        System.out.println ("1. Nasgor - 15.000");
        System.out.println ("2. Soto - 10.000");
        System.out.println ("3. Seblak - 5.000");
        
        System.out.println ("Pilih menu (1-3): ");
        int pilihan = scanner.nextInt();
        
        System.out.println ("Jumlah pemesanan: ");
        int jumlah = scanner.nextInt();
        
        /*if (pilihan <1 || >3){
        System.out.println("Maaf menu tidak tersedia");
        return;
        }*/
        
        int harga = 0;
        String namaMenu = "";
        
        switch (pilihan){
            case 1 :
                harga = 15000;
                namaMenu = "Nasgor";        
                break ;
            case 2 :
                harga = 10000;
                namaMenu = "Soto";     
                break ;
            case 3 :
                harga = 5000;
                namaMenu = "Seblak";     
                break ; 
            default :
                System.out.println("Masukkan menu dengan benar ");
                return;
        }
                
             int totalHarga = harga * jumlah;
                System.out.println ("Anda memesan : " + jumlah + " Porsi " + namaMenu);
                System.out.println ("Jumlah harga : " + totalHarga);
        }
        }
    
