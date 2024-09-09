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
public class atm {

    static void banner() {
        System.out.println("-------------- Menu --------------");
        System.out.println("1. Penarikan Tunai");
        System.out.println("2. Menabung");
        System.out.println("3. Cek Saldo");
        System.out.println("4. Keluar");
    }

    static double tarikTunai(double saldo, double jumlah) {
        if (saldo >= jumlah) {
            saldo = saldo - jumlah;
            System.out.println("Saldo akhir : " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        return saldo;
    }

    static double menabung(double jumlah, double saldo) {
        double hasilNabung = jumlah + saldo;
        System.out.println("Saldo tabungan sebelumnya: " + saldo);
        System.out.println("Saldo akhir tabungan: " + hasilNabung);
        return hasilNabung;
    }

    public static void main(String[] args) {
        final String name;
        double saldo;
        Scanner input = new Scanner(System.in);
        System.out.print("Silahkan masukan nama: ");
        name = input.nextLine();
        System.out.print("Silahkan masukan saldo awal: ");
        saldo = input.nextFloat();

        boolean jalankan = true;
        while (jalankan) {
            banner();
            System.out.print("Silahkan masukan menu: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukan jumlah penarikan tunai: ");
                    double jumlahPenarikan = input.nextFloat();
                    saldo = tarikTunai(saldo, jumlahPenarikan);
                    break;
                case 2:
                    System.out.print("Masukan jumlah yang akan di tabung: ");
                    double jumlahTabungan = input.nextFloat();
                    saldo = menabung(jumlahTabungan, saldo);
                    break;
                case 3:
                    System.out.println("Saldo kamu adalah: " + saldo);
                    break;
                case 4:
                    jalankan = false;
                    System.out.println("Terimakasih telah menggunakan ATM");
                    break;
                default:
                    System.out.println("Tidak ada dalam menu");
            }
        }
        input.close();
    }

}
