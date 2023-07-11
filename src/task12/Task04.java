package task12;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        int toplam = 0;

        int[] sayı = {1, 5, 6, 25, 58, 652};
        for (int i = 0; i < sayı.length; i++) {
            toplam += sayı[i];
        }
        double ort = toplam / sayı.length;
        System.out.println("toplam = " + toplam);
        System.out.println("ort = " + ort);
        System.out.print("ortalamadan büyük olanlar  ");
        for (int i = 0; i < sayı.length; i++) {
            if (sayı[i]>ort){
                System.out.print(sayı[i]+",");
            }

        }

    }


}
