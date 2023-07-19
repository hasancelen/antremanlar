package task12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

int[] array={12,2,5,15,8};
int enbüyük=array[0];
for (int i = 1; i < array.length; i++) {
    if (enbüyük<array[i]){
        enbüyük=array[i];
    }
        }
        System.out.println("enbüyük = " + enbüyük);
   //2, yol
        Arrays.sort(array);
        System.out.println("array[array.length-1] = " + array[array.length - 1]);

    }
}

