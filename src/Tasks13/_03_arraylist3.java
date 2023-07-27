package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        getlenght(list);
        System.out.println("getlenght(list) = " + getlenght(list));

    }

    private static ArrayList<Integer> getlenght(ArrayList<String> list) {
       ArrayList<Integer>lisr1=new ArrayList<>();
        for (String avuc:list) {
            lisr1.add(avuc.length());

        }
        return lisr1;
    }


}