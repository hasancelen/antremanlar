package task12;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String [] array={"Hello World"};
        String kelime=array[0];
        System.out.println(kelime);
        for (int i = kelime.length()-1; i >=0; i--) {
            System.out.print(kelime.charAt(i));
        }
// 2. yol
        System.out.println();
        String [] array1="Hello World".split("");
        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));
        String ters="";
        for (int i = array1.length-1; i >=0 ; i--) {
            ters+=array1[i];

        }
        System.out.println(ters);
    }
}