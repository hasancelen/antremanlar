package ch26_Exeption;

import java.io.IOException;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
                /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

 */
        Scanner input=new Scanner(System.in);
        System.out.println("hava sıcaklığı giriniz");
    int sıcaklık= input.nextInt();
    try {
        if (sıcaklık<10){
            throw new IOException();
        }
        System.out.println("hava güzel");
    } catch (IOException e) {
        System.out.println("sıcaklığı doğru gir");

    }
    }
}
