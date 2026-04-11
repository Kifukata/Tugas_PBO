/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PrintXinterasi {
    public static void main(String[] args){
        int Sum=0;
        int x;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Masukkan nilai x (int), akhiri dengan 999: ");
        x=masukkan.nextInt();
        if (x == 999) {
            System.out.println("Kasus kosong \n");
        }else{
            Sum = x;
            for(;;){
                System.out.println("Masukkan nilai x (int), akhiri dengan 999 : ");
                x=masukkan.nextInt();
                if (x==999) 
                    break;
                    else{
                        Sum = Sum + x;
                    } 
            }
            System.out.println("Hasil penjumlahan = "+ Sum);
        }
    }
}
