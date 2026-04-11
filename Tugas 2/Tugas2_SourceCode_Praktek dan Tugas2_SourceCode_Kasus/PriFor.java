/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PriFor {
    public static void main
    (String[] args){
        int i,N;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Baca N, print 1 s/d N ");
        System.out.println("N = ");

        N=masukkan.nextInt();

        for(i = 1; i <= N; i++){
            System.out.println(i);};
            System.out.println("Akhir program \n");
    }
}
