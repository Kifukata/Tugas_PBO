/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class Konstant {
    public static void main(String[] args){
        final float PHI = 3.1415f;
        float r;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Jari-jari lingkaran =");
        r = masukkan.nextFloat();

        System.out.println("Luas lingkaran ="+ (PHI * r * r) +"\n");
        System.out.println("Akhir program \n");
    }
}
