/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class Tempair {
    public static void main(String[] args) {
        int T;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Contoh IF tiga kasus \n");
        System.out.println("Temperatur (der. C) = ");
        T=masukkan.nextInt();
        if (T < 0) {
            System.out.println("Wujudkan air beku \n");
        }else if ((0 <= T) && (T <= 100)){
            System.out.println("Wujud air cair \n"+ T);
        }else if (T > 100) {
            System.out.println("Wujud air uap/gas \n"+ T);
        }
    }
}
