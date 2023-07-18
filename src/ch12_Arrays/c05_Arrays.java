package ch12_Arrays;

import java.util.Arrays;

public class c05_Arrays {
    public static void main(String[] args) {

        int[] sayı = {84, 63, 72, 3, 39, 55, 66, 654, 85, 35};
        int yeniArr[] = Arrays.copyOf(sayı, 15);
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));


        int rangeArr[]=Arrays.copyOfRange(sayı,5,15);
        System.out.println("Arrays.toString(rangeArr) = " + Arrays.toString(rangeArr));

    } // fill metodu update için kullanılır


}
