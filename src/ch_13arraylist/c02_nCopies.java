package ch_13arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class c02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        ArrayList<String> city=new ArrayList<>(Arrays.asList("ankara","erzurum","izmir","konya","bursa","aydın"));

        System.out.println(city);
        System.out.println(country);

        ArrayList<String> yenilist=new ArrayList<>(Collections.nCopies(7,"new zealand"));
        System.out.println("yenilist = " + yenilist);

        // addAll methodu

       // city.addAll(country);
        //System.out.println("city = " + city);

        //belirlenen indeks e ekleme
        city.addAll(1,country);
        System.out.println("city = " + city);
        System.out.println("country = " + country);


    }
}
