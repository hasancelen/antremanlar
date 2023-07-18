package cod_challange;

import java.util.Scanner;

public class task03 {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
/* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
        System.out.println("cm cinsinden bir değer giriniz");
        double sayi1= input.nextDouble();
        dönüşümmetodu(sayi1);
        mconvert(sayi1);
        System.out.println(mconvert(sayi1));
        kmconvert(sayi1);
        System.out.println(kmconvert(sayi1));
    }

    private static double kmconvert(double sayi1) {
    return sayi1/100000;
    }

    private static double mconvert(double sayi1) {
        return sayi1/100;
    }

    private static void dönüşümmetodu(double sayi1) {
        System.out.println(sayi1+" cm'nin metre karşılığı  "+(sayi1/100));
        System.out.println(sayi1+" cm'nin kilometre karşılığı  10"+(sayi1/100000));

    }
}
