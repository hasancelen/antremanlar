package cod_challange;

import java.util.Scanner;

public class task05 {
    static Scanner input = new Scanner(System.in);
    // task->
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz
    public static void main(String[] args) {
        System.out.println("toplamak istediğiniz sayı adedini giriniz");
        int toplamsayı= input.nextInt();
        if (toplamsayı<2) System.out.println("En az 2 sayi girmelisiniz");
        else if (toplamsayı==2) {
            System.out.println("1. sayı giriniz");
            int sayi1= input.nextInt();
            System.out.println("2. sayı giriniz");
            int sayi2= input.nextInt();
            System.out.println(topla2(sayi1,sayi2));
        }
        else if (toplamsayı==3) {
            System.out.println("1. sayı giriniz");
            int sayi1= input.nextInt();
            System.out.println("2. sayı giriniz");
            int sayi2= input.nextInt();
            System.out.println("3. sayı giriniz");
            int sayi3= input.nextInt();
            System.out.println(topla3(sayi1,sayi2,sayi3));
        }
        else if (toplamsayı==4) {
            System.out.println("1. sayı giriniz");
            int sayi1= input.nextInt();
            System.out.println("2. sayı giriniz");
            int sayi2= input.nextInt();
            System.out.println("3. sayı giriniz");
            int sayi3= input.nextInt();
            System.out.println("4. sayı giriniz");
            int sayi4= input.nextInt();
            System.out.println(topla4(sayi1,sayi2,sayi3,sayi4));
        }
        else System.out.println("cok sayi girdiniz, ben toplayamam");
    }

    private static int topla4(int sayi1, int sayi2, int sayi3, int sayi4) {
        return (sayi1+sayi2+sayi3+sayi4);
    }

    private static int topla3(int sayi1, int sayi2, int sayi3) {
        return (sayi1+sayi2+sayi3);
    }

    private static int topla2(int sayi1, int sayi2) {
        return (sayi1+sayi2);
    }

}

