package ch13_arraylist;

import java.util.ArrayList;
import java.util.List;

public class c07_sublist {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        System.out.println("country = " + country);
        System.out.println("country.subList(2,4) = " + country.subList(2, 4));

        //yeni list oluşturup eski listeden eleman çekme

        ArrayList<String >yenilist=new ArrayList<>(country.subList(2,4));
        System.out.println("yenilist = " + yenilist);
    }
}
