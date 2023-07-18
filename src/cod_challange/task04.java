package cod_challange;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi1 = input.nextInt();
        System.out.println(task02.sayı2(sayi1));
        basamaksayısı(sayi1);
    }

    private static void basamaksayısı(int sayi1) {
        if (sayi1 > 99) {
            int toplam = 0;
            while (sayi1 > 0) {
                toplam += sayi1 % 10;
                sayi1 /= 10;
            }
        }

    }
}