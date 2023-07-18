package ch12_Arrays;

import java.util.Arrays;

public class c01_Arrays {
    /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

    public static void main(String[] args) {
        // array tanımlama
        int a;//primitive data type tanımladı
        int[] arr;//declere edilen ama değer atanmayan int data type
        // System.out.println("a = " + a);//Variable 'a' might not have been initialized
        // System.out.println("arr = " + arr);//Variable 'arr' might not have been initialized
String[]nameArray={"hasan","ahmet","ömer","elif","tommy","zeynep"};
int[] numArray={11,22,333,66,55,44,88,99,55,2,44,55,6};
int[] sayilarr=new int[5];
       // System.out.println(sayiarr);
sayilarr[0]=35;
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayilarr));
        sayilarr[1]=34;
        sayilarr[2]=9;
        sayilarr[3]=48;
        sayilarr[4]=7;
        System.out.println("Arrays.toString(sayilarr) = " + Arrays.toString(sayilarr));
        System.out.println("sayilarr.length = " + sayilarr.length);
        System.out.println("nameArray.length = " + nameArray.length);
        System.out.println("sayilarr[sayilarr.length-1] = " + sayilarr[sayilarr.length - 1]);
        System.out.println("nameArray[nameArray.length-1] = " + nameArray[nameArray.length - 1]);
        System.out.println("numArray[numArray.length-1] = " + numArray[numArray.length - 1]);
        nameArray[nameArray.length-1]="hasan";

        for (int i = 0; i < numArray.length; i+=2) {
            System.out.println(numArray[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].length()==5){
                System.out.println(nameArray[i]);
            }
        }

        System.out.println(" // sort //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayilarr) = " + Arrays.toString(sayilarr));

        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayilarr);

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayilarr) = " + Arrays.toString(sayilarr));


    }


}


