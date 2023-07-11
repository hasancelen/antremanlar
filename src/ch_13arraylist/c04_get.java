package ch_13arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c04_get {
    public static void main(String[] args) {
        //get() listede istenen index elemanını return eder
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        System.out.println("country = " + country);
        ArrayList<String> city=new ArrayList<>(Arrays.asList("ankara","erzurum","izmir","konya","bursa","aydın"));
        System.out.println("city = " + city);

        System.out.println("city.get(1) = " + city.get(1));
      //  System.out.println("city.get(20) = " + city.get(20));


    }
}
