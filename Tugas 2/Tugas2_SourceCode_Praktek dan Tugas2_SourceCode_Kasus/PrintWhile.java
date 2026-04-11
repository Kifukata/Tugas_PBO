/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PrintWhile {
    public static void main(String[] args){
        int N;
        int i;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Nilai N >0 = ");
        N = masukkan.nextInt();
        i = 1;

        System.out.println("Print i degngan WHILE: \n");
        while (i <= N) {
            System.out.println(i);
            i++;
        }
    }
}
