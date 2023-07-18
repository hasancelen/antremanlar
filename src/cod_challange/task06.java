package cod_challange;

import java.util.Scanner;

public class task06 {
static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */

        System.out.println(büyükharfçıktısı());
    }

    private static String büyükharfçıktısı() {
        System.out.println("lütfen adınızı giriniz");
        String ad= input.nextLine();
        System.out.println("lütfen soyadınızı giriniz");
        String soyad= input.nextLine();

        return (ad.substring(0,1).toUpperCase()+ad.substring(1,ad.length()-1).toLowerCase()+" "+soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase());
    }
}
