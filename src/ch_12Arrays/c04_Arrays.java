package ch_12Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c04_Arrays {
    public static void main(String[] args) {
        //arrayde eşitlik kontrolü
        int sayı1[]={37,3,72,63,84};
        int[] sayı2={84,63,72,3,37};
        System.out.println("Arrays.equals(sayı1,sayı2) = " + Arrays.equals(sayı1, sayı2));

        System.out.println(sayı1[0]==sayı2[0]); //true
        String str=Arrays.toString(sayı1);

    }
}
