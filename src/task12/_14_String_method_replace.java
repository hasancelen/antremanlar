package task12;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String  kelime="Hello World";
        String [] kelime1=kelime.split("") ;
        String kelime2="";
        for (int i = 0; i < kelime1.length-1; i++) {
            kelime2+=kelime1[i].replace("o","K");

        }
        System.out.println("kelime2 = " + kelime2);

    }
}