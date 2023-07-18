package cod_challange;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giresen");
        int sayi1= input.nextInt();
        System.out.println("bire sayı daha giresen");
        int sayi2= input.nextInt();
        eşitlik(sayi1,sayi2);
        System.out.println("sayı1 = sayı2 => "+ eşitlik(sayi1,sayi2));

    }

    private static boolean eşitlik(int sayi1, int sayi2) {
        return (sayi1==sayi2?true:false);
    }
}
