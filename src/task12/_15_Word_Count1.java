package task12;

import java.util.Arrays;

public class _15_Word_Count1 {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
String kelime="Removes white space from both ends of a string";
String [] kelime1=kelime.split(" ");
        System.out.println("Arrays.toString(kelime1) = " + Arrays.toString(kelime1));
        System.out.println("kelime1.length = " + kelime1.length);
    }
}