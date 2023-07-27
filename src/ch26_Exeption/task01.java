package ch26_Exeption;

import java.util.Scanner;

public class task01 {  /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("possword giriniz");
        String şifre= input.nextLine();
        try {

            if (şifre.length()<6||şifre.length()>10){
                throw new StringIndexOutOfBoundsException("girilen password'un 6 karakterden az 10 karakterden fala olmamlı");
            }
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.out.println("catch blok çalıştı");
        }
        System.out.println("sisitem çalışıyor");

    }

}

