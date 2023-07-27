package InterviewQuestions;

import java.util.Random;



public class Q42_CreateMethodWithArray {

    /*    ||This Part Should be in Main Method||

         -Create an array of size 5, assign some random values from 0 to 10
         -(use random class and for loop to assign values)


        ||You should create public static void methods fori loop (Parameter should be int Array for methods)||

         -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
         -2-Create a method that prints the sum of an array
         -3-Create a method that prints the max element of an array

        P.S: Return type should be void because we are not returning anything just printing

         -5 boyutunda bir dizi oluşturun, 0'dan 10'a kadar rastgele değerler atayın
         -(değerleri atamak için random sınıfını ve for döngüsünü kullanın)
          fori döngüsü için genel statik void method oluşturmalısınız (method için parametre int Array olmalıdır)
          1-"2 3 1 10 2" gibi bir dizi yazdıran bir method oluşturun, array elemanları arasında boşluk olmalı
          2-Bir arrayın toplamını yazdıran bir method oluşturun
          -3-Bir arrayın maksimum elemanını yazdıran bir method oluşturun P.S: return tipi void olmalıdır çünkü sadece yazdırılan herhangi bir şeyi iade etmiyoruz
            */
    public static void main(String[] args) {
        Integer arr[] = new Integer[5];// 5 eleman alacak bos array tanımandı
        Random rnd=new Random();
        for (int i = 0; i <5 ; i++) {
            arr[i]=rnd.nextInt(10);//0-10 randon sayılar arraya atandı
        }
     //   System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        printArray(arr);
        sumArray(arr);
        maxArray(arr);
    }

    private static void maxArray(Integer[] arr) {
        int maxValue=arr[0];//arayın ilk elemanı max değer olarak atandı
        for (int avuc:arr) {
            maxValue=Math.max(maxValue,avuc);
        }
        System.out.println("maxValue = " + maxValue);
    }

    private static void sumArray(Integer[] arr) {
        int toplma=0;
        for (int avuc:arr) {
            toplma+=avuc;
        }
        System.out.println("array toplam : " +toplma);
    }

    private static void printArray(Integer[] arr) {
       // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

      // for (int i = 0; i < arr.length; i++) {
      //     System.out.print(arr[i]+" ");
      // }
        for (int avuc:arr) {
            System.out.print( avuc+" ");
        }
        System.out.println();
    }
}
