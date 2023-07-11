package task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim

        int[] sayı = {1, 2, 3};
        int[] sayı1 = new int[3];
        for (int i = 0; i < sayı.length; i++) {
            if (i == 2) {
                sayı1[i] = sayı[0];
            } else sayı1[i] = sayı[i+1];
        }
        System.out.println("sayı1 = " + Arrays.toString(sayı1));


    }

}
