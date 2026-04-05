/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oper2;

/**
 *
 * @author IHYANUL HAKIM
 */
/** Nim          : 13020240115
 *  Nama         : Ihyanul Hakim
 *  Hari/Tanggal : 3 April 2026
 *  Waktu        : 09.25 WITA
 */
public class Oper2 {

    public static void main(String[] args) {
        char i, j;

        i = 3; // 00000011 (biner)
        j = 4; // 00000100 (biner)

        System.out.println("i = " + (int) i);
        System.out.println("j = " + (int) j);

        System.out.println("i & j = " + (i & j));  // AND
        System.out.println("i | j = " + (i | j));  // OR
        System.out.println("i ^ j = " + (i ^ j));  // XOR

        System.out.println(Math.pow(i, j)); // pangkat

        System.out.println("~i = " + ~i); // NOT
    }
}
