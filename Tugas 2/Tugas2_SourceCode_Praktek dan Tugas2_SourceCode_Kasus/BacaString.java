/*Nama      : Ihyanul Hakim
  Stambuk   : 13020240115
  Kelas     : A3 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
;
public class BacaString{
    public static void main(String[] args) throws IOException {
        String str;
        
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nBaca string dan Integer: \n");
        System.out.println("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.println("string yang dibaca : " + str);
    }
}