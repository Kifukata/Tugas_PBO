/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casting1;

/**
 *
 * @author IHYANUL HAKIM
 */
/** Nim          : 13020240115
 *  Nama         : Ihyanul Hakim
 *  Hari/Tanggal : 3 April 2026
 *  Waktu        : 09.25 WITA
 */
public class Casting1 {

    public static void main(String[] args) {
        int a = 5, b = 6;
        float d = 2.f, e = 3.2f;
        char g = '5';
        double k = 3.14;

        System.out.println((float) a);   // int → float
        System.out.println((double) b);  // int → double
        System.out.println((int) d);     // float → int
        System.out.println((double) e);  // float → double
        System.out.println((int) g);     // char → int (ASCII)
        System.out.println((float) g);   // char → float
        System.out.println((double) g);  // char → double
        System.out.println((int) k);     // double → int
        System.out.println((float) k);   // double → float
    }
}
