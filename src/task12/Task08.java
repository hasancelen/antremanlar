package task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("7 elemanlı int değerlerini giriniz");
        int[] tek = new int[7];
        for (int i = 0; i < 6; i++) {
            System.out.println(i+ "  elemanı giriniz");
            tek[i] = input.nextInt();
        }
        System.out.println("girdiniz array = " + Arrays.toString(tek));
        for (int i = 0; i < tek.length; i++) {
            if (tek[i] % 2 != 0) {
                System.out.print(tek[i]+" ");

            }


        }
    }
}
