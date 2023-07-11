package task12;

import java.util.Scanner;

public class Task05 {
    static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        System.out.println("bir sayı giriniz...");
        int sayi= input.nextInt();
        System.out.print("girdiğiniz syının tersi: ");
        while (sayi!=0){
            int b=sayi%10;
            sayi=sayi/10;
            System.out.print(b);

        }

    }

}
