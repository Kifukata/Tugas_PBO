/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PrintXRepeat {
    public static void main(String[] args){
        int Sum;
        int x;
        Scanner masukkan=new Scanner(System.in);

        System.out.println("Masukkan nilai x (int), akhiri dengan 999 : ");

        x=masukkan.nextInt();

        if (x == 999) {
            System.out.println("kasus kosong \n");
        }else{
            Sum = 0;
            do{
                Sum = Sum + x;
                System.out.println("Masukkan nilai x (int), akhiri dengan 999 : ");
                x=masukkan.nextInt();
            }while (x != 999);
            System.out.println("Hasil penjumlahan = "+Sum);
        }
    }
}
