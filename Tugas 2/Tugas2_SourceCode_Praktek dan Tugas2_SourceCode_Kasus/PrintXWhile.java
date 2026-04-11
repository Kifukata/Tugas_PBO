/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PrintXWhile {
    public static void main(String[] args){
        int Sum;
        int x;
        Scanner masukkan=new Scanner(System.in);
        Sum = 0;

        System.out.println("Masukkan nilai x (int), akhiri dengan 999 : ");
        x=masukkan.nextInt();
        while (x != 999) {
            Sum = Sum + x;
            System.out.println("Masukkan nilai x (int), akhiri dengan 999 : ");
            x=masukkan.nextInt();
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
    }
}
