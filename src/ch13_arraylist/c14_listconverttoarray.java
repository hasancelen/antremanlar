package ch13_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c14_listconverttoarray {
    public static void main(String[] args) {


        ArrayList<String> country = new ArrayList<>(List.of("madagaskar", "yenizellenda", "almanya", "fransa"));
        System.out.println(country);


        Object [] arrCity=country.toArray();
        System.out.println("Arrays.toString(arrCity) = " + Arrays.toString(arrCity));

        String [] arrcity2=country.toArray(new String[0]);
        System.out.println("Arrays.toString(arrCity2) = " + Arrays.toString(arrcity2));
    }
}