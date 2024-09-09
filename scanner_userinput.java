/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package com.mycompany.p.belajar.java;
import java.util.Scanner;

public class scanner_userinput {
    public static void main(String [] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = input.nextInt();
        System.out.println("Nilai anda = " + nilai);
        
        //Untuk hasil nilai angka yang banyak,teks, karakter dan sebagainya tinggal ganti tipe data
        //Bisa jadi kalkulator
    }
}*/

package com.mycompany.p.belajar.java;
import java.util.Scanner;

public class scanner_userinput {
    public static void main(String [] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Input variable a : ");
        int a = input.nextInt();
        System.out.println("Masukkan operasi ( + , - , / , *) : ");
        String operasi = input.next();
        System.out.println("Input variable b : ");
        int b = input.nextInt();
        switch (operasi) { 
            case "+" :
                System.out.println("Hasil dari a + b = " + (a + b)); 
                break ;
            case "-" :
                System.out.println("Hasil dari a - b = " + (a - b));
                break ;
            case "/" :
                System.out.println("Hasil dari a / b = " + (float)a/b); 
                break ;
            case "*" :
                System.out.println("Hasil dari a * b = " + (a * b)); 
                break ; 
            default :
                System.out.println("Masukkan operator dengan benar ");
        }
        
    }
}
