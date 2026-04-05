/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casting2;

/**
 *
 * @author IHYANUL HAKIM
 */
/** Nim          : 13020240115
 *  Nama         : Ihyanul Hakim
 *  Hari/Tanggal : 3 April 2026
 *  Waktu        : 09.25 WITA
 */
public class Casting2 {

    public static void main(String[] args) {
        int a = 8, b = 9;
        float d = 2.f, e = 3.2f;
        char g = '5';
        double k = 3.14;

        String n = "67", m = "45", l = "100";

        // String → angka
        a = Integer.parseInt(n);
        k = Double.parseDouble(m);
        d = Float.parseFloat(l);

        System.out.println("a : " + a + "\nk : " + k + "\nd : " + d);

        // angka → String
        n = String.valueOf(b);
        m = String.valueOf(g);
        l = String.valueOf(e);

        System.out.println("n : " + n + "\nm : " + m + "\nl : " + l);

        // konversi lanjutan
        k = Double.valueOf(a).intValue();
        double c = Integer.valueOf(b).doubleValue();

        System.out.println("k : " + k + "\nc : " + c);
    }
}
