package cod_challange;

import java.util.Scanner;

public class task02 {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        // task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.
        System.out.println("bir sayı giriniz");
        int sayi1= input.nextInt();
        sayı2(sayi1);
        System.out.println(sayı2(sayi1));
    }

    //private static void sayı(int sayi1) {
      //  if (sayi1%2==0){
    //        System.out.println("sayı çift");
    //    }
    //    else System.out.println("sayı tek");
    //}
    public static boolean sayı2(int sayi1){
        return sayi1%2==0?true:false;
    }
}
