/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oprator;

/**
 *
 * @author IHYANUL HAKIM
 */
/** Nim          : 13020240115
 *  Nama         : Ihyanul Hakim
 *  Hari/Tanggal : 3 April 2026
 *  Waktu        : 09.25 WITA
 */
public class Oprator {

    public static void main(String[] args) {
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        // operasi boolean
        Bool1 = true;
        Bool2 = false;

        System.out.println("Boolean AND: " + (Bool1 && Bool2));
        System.out.println("Boolean OR : " + (Bool1 || Bool2));
        System.out.println("NOT Bool1  : " + (!Bool1));
        System.out.println("XOR        : " + (Bool1 ^ Bool2));

        // operasi integer
        i = 5;
        j = 2;

        System.out.println("\nPenjumlahan : " + (i + j));
        System.out.println("Pengurangan : " + (i - j));
        System.out.println("Perkalian   : " + (i * j));
        System.out.println("Pembagian   : " + (i / j));
        System.out.println("Modulo      : " + (i % j));
        
        // operasi float
        x = 5;
        y = 5;

        System.out.println("\nFloat + : " + (x + y));
        System.out.println("Float - : " + (x - y));
        System.out.println("Float * : " + (x * y));
        System.out.println("Float / : " + (x / y));

        // relasional integer
        System.out.println("\nRelasi i==j : " + (i == j));
        System.out.println("Relasi i!=j : " + (i != j));
        System.out.println("Relasi i<j  : " + (i < j));
        System.out.println("Relasi i>j  : " + (i > j));
        System.out.println("Relasi i<=j : " + (i <= j));
        System.out.println("Relasi i>=j : " + (i >= j));
    }
}
