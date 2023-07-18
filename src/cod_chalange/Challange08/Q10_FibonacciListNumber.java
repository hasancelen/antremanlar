package cod_chalange.Challange08;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayıya kadar FIBONACCI dizisini print eden code create ediniz.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("bir sayı giriniz");
        int adet= input.nextInt();
        if (adet<=0){
            System.out.println("doğru gir");

        } else if (adet==1) {
            list.add(0);
            System.out.println("list = " + list);

        } else if (adet==2) {
            list.add(0);
            list.add(1);
            System.out.println("adet = " + adet);
        }else {
            int sayı1=0;
            int sayı2=1;
            int sayı3=0;
            list.add(0);
            list.add(1);
            for (int i = 3; i <=adet ; i++) {
                sayı3=sayı1+sayı2;
                list.add(sayı3);
                sayı1=sayı2;
                sayı2=sayı3;

            }
        }
        System.out.println("list = " + list);
    }

}