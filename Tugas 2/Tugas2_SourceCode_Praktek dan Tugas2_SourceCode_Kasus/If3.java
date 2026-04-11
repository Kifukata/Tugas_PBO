/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class If3 {
    public static void main(String[] args){
        int a;
        Scanner masukkan=new Scanner(System.in);

        System.out.println("Contoh IF tiga kasus \n");
        System.out.println("Ketiikan suatu nilai integer :");
        a=masukkan.nextInt();
        if (a > 0) {
            System.out.println("Nilai a positif "+ a);
        }else if (a == 0) {
            System.out.println("Nilai Nol "+ a);
        }else {
            System.out.println("Nilai a negatif "+ a);
        }
    }    
}
