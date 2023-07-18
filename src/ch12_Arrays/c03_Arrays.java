package ch12_Arrays;

import java.util.Arrays;

public class c03_Arrays {
    public static void main(String[] args) {

        String str="tam oturması için birkaç örnek daha gerekir";
        String [] yeniArr= str.trim().split(" ");
        System.out.println("str = " + str);
        System.out.println(Arrays.toString(yeniArr));
        System.out.println("yeniArr.length = " + yeniArr.length);
        System.out.println("str.length() = " + str.length());


    }
}
