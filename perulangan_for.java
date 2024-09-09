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
public class perulangan_for {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan batas : ");
    Short batas = input.nextShort();
    
    for (int nilaiAwal=1; nilaiAwal <= batas; nilaiAwal++){
        System.out.println("Saya berjanji akan belajar sebelum ujian");
    }
    
    }
}
