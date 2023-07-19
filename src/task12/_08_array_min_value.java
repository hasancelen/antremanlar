package task12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
int [] array={14 , 19 , 5 , 21};
        Arrays.sort(array);
        System.out.println("array[array[0]] = " + array[0]);

        // 2. yol
        enküçüksayı(array);
        System.out.println("enküçüksayı(array) = " + enküçüksayı(array));

    }

    private static int enküçüksayı(int[] array) {
        int küçük=array[0];
        for (int i = 1; i < array.length-1; i++) {
            if (küçük>array[i]){
                küçük=array[i];
            }
        }
        return küçük;
    }
}

