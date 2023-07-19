package task12;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
String kelime="$12 $23 $10 $2 $5 $2";
String [] kelime1=kelime.split(" ");
int toplam=0;
        System.out.println("Arrays.toString(kelime1) = " + Arrays.toString(kelime1));
        for (int i = 0; i < kelime1.length-1; i++) {
            toplam+=Integer.parseInt(kelime1[i].replace("$",""));
        }
        System.out.println("toplam = " + toplam);
    }
}