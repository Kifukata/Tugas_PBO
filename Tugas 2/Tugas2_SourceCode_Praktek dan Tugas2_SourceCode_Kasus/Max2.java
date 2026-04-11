/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class Max2 {
    public static void main(String[] args){
        int a, b;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Maksimum dua bilangan : \n");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan RETURN :\n");
        a=masukkan.nextInt();
        b=masukkan.nextInt();
        System.out.println("Ke dua bilangan : a = "+ a+" b = "+b);
        if (a >= b) {
            System.out.println("Nilai a yang maksimum: "+ a);
        }else {
            System.out.println("Nilai b yang maksimum: "+ b);
        }
    }
}
