/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bacakar;

/**
 *
 * @author IHYANUL HAKIM
 */
/** Nim          : 13020240115
 *  Nama         : Ihyanul Hakim
 *  Hari/Tanggal : 3 April 2026
 *  Waktu        : 09.25 WITA
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bacakar {
    public static void main(String[] args) throws IOException {

        char cc;
        int bil;

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);

        System.out.print("baca 1 bilangan : ");
        bil = Integer.parseInt(datAIn.readLine());

        System.out.println(cc);
        System.out.println(bil);
        System.out.println("bye");
    }
}
