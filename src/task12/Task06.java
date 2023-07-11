package task12;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz
        int[] sayı = {1, 45, 6, 325, 58, 652};
        int[] sayı1 = new int[sayı.length];
        Arrays.sort(sayı);
        System.out.println(Arrays.toString(sayı));
        for (int i = 0; i < sayı.length; i++) {
            if (i == 0) {
                sayı1[i] = sayı[sayı.length - 1];

            } else {
                sayı1[i] = sayı[sayı.length - (i)-1];
            }

            System.out.println(Arrays.toString(sayı1));
            for (int j = sayı.length-1; j >=0 ; j--) {
                System.out.print(sayı[j]+",");

            }
        }
    }
}
