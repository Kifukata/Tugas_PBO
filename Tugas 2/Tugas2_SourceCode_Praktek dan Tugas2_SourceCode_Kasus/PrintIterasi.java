/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class PrintIterasi {
    public static void main(String[] args){
        int N;
        int i;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Nilai N >0 = ");
        N=masukkan.nextInt();

        i  = 1;
        System.out.println("Print i dengan ITERATE : \n");
        for(;;){
            System.out.println(i);
            if (i == N) 
                break;
            else {
                i++;
            }
        }
    }
}
