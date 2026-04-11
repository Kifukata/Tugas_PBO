/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class SubProgram {
    public static int maxab (int a, int b) {
        return ((a >= b) ? a : b);
    }
    public static void tukar(int a, int b){
        int temp;
        temp = a;
        a =b;
        b = temp;
        System.out.println("Ke dua bilangan setelah tukar: a ="+ a +" b = "+ b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Maksimum dua bilangan \n");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan RETURN : \n");
        a = masukkan.nextInt();
        b = masukkan.nextInt();
        System.out.println("Ke dua bilangan : a = "+ a +" b = "+ b);
        System.out.println("Maksimum = " + (maxab(a, b)));
        System.out.println("Tukar kedua bilangan...\n");
        tukar(a, b);
    }
}
