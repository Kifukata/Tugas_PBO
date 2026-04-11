/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class If2 {
    public static void main(String[] args){
        int a;
        Scanner masukan=new Scanner(System.in);

        System.out.println("Contoh IF dua kasus \n");
        System.out.println("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();

        if (a >= 0){
            System.out.println("Nilai a positif " + a);
        }else {
            System.out.println("Nilai a negatif "+ a);
        }
    }
}
