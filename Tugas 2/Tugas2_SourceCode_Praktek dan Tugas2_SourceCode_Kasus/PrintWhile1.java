/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PrintWhile1 {
    public static void main(String[] args){
        int N;
        int i = 1;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Nilai N >0 = ");
        N = masukkan.nextInt();
        System.out.println("Print i dengan WHILE (ringkas): \n");
        while (i <= N) {
            System.out.println(i++);
        }
    }
}
