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
public class ternary_jv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai kamu: ");
        int nilai = input.nextInt();
        String hasil = (nilai >= 80) ? "Kamu lulus dengan nilai bagus" : (nilai >= 70) ? "Nilai kamu lumayan, kerja bagus" : "Remedial";
        System.out.println(hasil);
    }
}