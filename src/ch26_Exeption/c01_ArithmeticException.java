package ch26_Exeption;

import java.util.Scanner;

public class c01_ArithmeticException {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                   System.out.println("sayı bir gir");
        int sayı1= input.nextInt();
        System.out.println("sayı gir");
              int sayı2= input.nextInt();
/*
1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz catch block, try
block exception  yakalarsa calışır
2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch
block tanımlanabilir.
   aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
 */
        try {
            int sonuc=sayı1/sayı2;
            System.out.println("sonuc = " + sonuc);
        }catch (ArithmeticException e) {
            System.out.println("ilk ve son yakalama");
        }
        catch (Exception e) {
            System.out.println("en son yakalama");
        } finally {
             /*
try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
ama finaly tanımlanırsa catch çalışmasa bile
pr akışı devam eder.finally block hata olsa da olmasa da calışır.
Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
 */
            System.out.println("finally bloktan selamlar");
        }




    }
}
