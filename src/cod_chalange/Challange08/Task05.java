package cod_chalange.Challange08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
       /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

int arr[]=new int[8];//8 int eleman alacak bir arr tanımlandı
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"  index elemanını giriniz");
            arr[i]=input.nextInt();

        }
        int count=0;//3'e tam bölünen array eleman sayısı
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){//döngüdeki her elemanın 3'e bölünme durumu
                count++;

        }
    }
        System.out.println("3 e bölünen eleman sayısı  "+count);
}}
