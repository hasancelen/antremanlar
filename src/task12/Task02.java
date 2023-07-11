package task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner input=new Scanner(System.in);
        System.out.println("kaç  elemanlı bir array gireceksiniz");
        int boyut= input.nextInt();
        int[] sayilar=new int[boyut];
int toplam=0;

        for (int i = 0; i < boyut; i++) {
            System.out.println(i+"'inci array elemanını giriniz");
            sayilar[i]= input.nextInt();
toplam+=sayilar[i];

        }
        System.out.println("sayilar = " + Arrays.toString(sayilar));
        System.out.println("toplam = " + toplam);


    }
}
