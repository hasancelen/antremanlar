package ch26_Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task03 {//'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
//int v = vize
//int f = final

//Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
//Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.

//Diğer durumlarda ise,
//vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)

//Programın çalışmasını sağlayın. (handle edin)
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int v=0;
    int f=0;



    while (true)
        try {
            System.out.println("vize notunu giriniz");
             v=input.nextInt();
            if (v<0||v>100) {
                throw new ArithmeticException();
            }else break;

        } catch (ArithmeticException e) {
            System.out.println("not 0-100 arasında olmalı");

        }catch (InputMismatchException e){
            System.out.println("hatalı giriş yaptın");
        }
    while (true)
        try {
            System.out.println("final notunu giriniz");
             f=input.nextInt();
            if (f<0||f>100) {
                throw new ArithmeticException();
            }else break;

        } catch (ArithmeticException e) {
            System.out.println("not 0-100 arasında olmalı");

        }catch (InputMismatchException e){
            System.out.println("hatalı giriş yaptın");
        }

    ortalama(v,f);
}
private static void ortalama(int v,int f){
    double ortalama=(v*0.4)+(f*0.6);
    System.out.println("ortalama = " + ortalama);

    if(ortalama>=65) System.out.println("sınıfı geçtiniz" );
    else System.out.println("sınıfta kaldınız");
}
}





