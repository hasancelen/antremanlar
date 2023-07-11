package task12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("5 adet sayı girilecek");
        int [] sayı=new int[5];
        for (int i = 4; i >=0 ; i--) {
            System.out.println(" sayıyı giriniz");
        sayı[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(sayı));
    }
}
