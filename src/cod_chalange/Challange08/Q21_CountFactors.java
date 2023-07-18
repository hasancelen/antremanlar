package cod_chalange.Challange08;

import java.util.Scanner;

public class Q21_CountFactors {
      /* Task->
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Girilen sayının tam bolen sayısını print eden code create ediniz.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("sayı giriniz");
            int sayı = input.nextInt();
            int bölensayısı = 0;
            int bölen = 1;
            for (int i = 1; i <=sayı; i++) {
                  if (sayı % i == 0) {
                        System.out.print(i + " ");
                        bölensayısı++;

                  }

                  //while (bölen <= sayı) {
                  //      if (sayı % bölen == 0) {
                  //            bölensayısı++;
                  //            System.out.print(bölen + " ");

                  //      }
                  //      bölen++;
                  //}
                  //System.out.println("\n nın "+bölensayısı+"tane böleni vardır");
            }System.out.println(bölensayısı);
      }}