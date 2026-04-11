/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.util.Scanner;
public class KasusSwitch {
    public static void main(String[] args){
        char cc;
        Scanner masukkan=new Scanner(System.in);
        System.out.println("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
        cc=masukkan.next().charAt(0);
        switch (cc) {
            case 'a': {System.out.println("Yang anda ketik adalah a\n"); break;}
            case 'u': {System.out.println("Yang anda ketik adalah u\n"); break;}
            case 'e': {System.out.println("Yang anda ketik adalah e\n"); break;}
            case 'i': {System.out.println("Yang anda ketik adalah i\n"); break;}
            case 'o': {System.out.println("Yang anda ketik adalah o\n"); break;}
        
            default:
                System.out.println("Yang anda ketik adalah huruf mati\n");
                break;
        }
    }
}
