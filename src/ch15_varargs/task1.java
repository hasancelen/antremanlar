package ch15_varargs;


import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

    /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.

input : "m", "e", "r", "v", "e";
output : merve

input : "a", "l", "i";
output : ali

 */
        String[] arr1 = {"m", "e", "r", "v", "e"};
        String[] arr2 = {"a", "l", "i"};
        concat(arr1);
        concat(arr2);
    }

    private static void concat(String...arr2) {
        String ss="";
        for (String w:arr2){
    }
        System.out.println(Arrays.toString(arr2));
}}