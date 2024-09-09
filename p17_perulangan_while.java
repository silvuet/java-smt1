/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_jv_smt1;
import java.util.Scanner;
/**
 *
 * @author ekasa
 */
public class p17_perulangan_while {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
     
        //WHILE
       /* int nilaiAwal = 1;
        System.out.println("Masukkan batas : ");
        int batas = input.nextInt();
        while (nilaiAwal <= batas) {
            System.out.println("Nilai anda saat ini : " + nilaiAwal);
            nilaiAwal++;
        }
    }
}
       //DO WHILE
       System.out.println("Masukkan batas : ");
       int batas = input.nextInt();
       int nilaiAwal = 1;
       
            do {
           System.out.println("Nilai anda saat ini : " + nilaiAwal);
           nilaiAwal++;
           
            }while (nilaiAwal <= batas);
       input.close();
       }
       }*/

       //TUGAS
        /*int batas =  5;
        
        //LOOP BAGIAN ATAS X
        for (int i = 0; i < batas; i++) {
            for (int j = 0; j < i; j++) {
            System.out.print(" ");    
            }
            for (int j = 1; j <= batas; j++) {
            System.out.print(" ");   
            }
            System.out.println();
                
        //LOOP BAGIAN BAWAH X
        for (int i = batas -2; i >=0; i--) {
            for (int j = 0; j < i; j++);
            System.out.print(" ");    
            }
            for (int j = 1; j <= batas; j++);
            System.out.print(j);    
            }
        }
    }*/
        
int batas , x ,y;
        batas = 5;
        for(y=1; y<=batas; y++){
            for(int spasi= y; spasi>1; spasi--){
            System.out.print(" ");
            }
        x=1;
            while(x<=batas){
                System.out.print(x);
                x++;
            }
            for(int j = 0; j < (batas - y) *2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= batas; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
        for(int i = batas - 2; i >= 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=batas; k++){
                System.out.print(k);
            }
            for (int j = 0; j < (batas - i) *2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= batas; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
//        for(y=1; y<=batas; y++){
//            for(int spasi= y; spasi<batas; spasi++){
//            System.out.print(" ");
//            }
//        x=1;
//            while(x<=batas){
//                System.out.print(x);
//                x++;
//            }
//            for (int j = 0; j < (batas - 1) *2; j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= batas; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
    }
}
    