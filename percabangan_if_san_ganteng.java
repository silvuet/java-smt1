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
public class percabangan_if_san_ganteng {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Masukan nama: ");
    String name = input.nextLine();
    
    if (name.isEmpty()){
        System.out.println("Nama tidak boleh kosong");
//        System.out.println("Masukan nama: ");
//        name = input.nextLine();
    } else {
        System.out.println("Masukan nilai: ");
    int nilai = input.nextInt();
    
    if (nilai >= 80) {
        System.out.println("Sangat baik");
    } else if (nilai >= 70) {
        System.out.println("Baik");
    } else if (nilai >= 60) {
        System.out.println("Cukup");
    } else {
        System.out.println("Kurang");
    }
    
    }
    }
    
}
