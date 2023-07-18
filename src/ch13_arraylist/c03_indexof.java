package ch13_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c03_indexof {
    public static void main(String[] args) {
        //indexof() ; list içinde istenen elemanın index değerini return eder
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        System.out.println("country = " + country);
        ArrayList<String> city=new ArrayList<>(Arrays.asList("ankara","erzurum","izmir","konya","bursa","aydın"));
        System.out.println("city = " + city);

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun"));
        System.out.println("city.indexOf(\"ankara\") = " + city.indexOf("ankara"));

        country.add("ingiltere");
        System.out.println("country.indexOf(\"ingiltere\") = " + country.indexOf("ingiltere"));
        System.out.println("country.lastIndexOf(\"ingiltere\") = " + country.lastIndexOf("ingiltere"));

        country.add("almanya");
        System.out.println("country = " + country);
        System.out.println("country.indexOf(\"almanya\") = " + country.indexOf("almanya"));
        System.out.println("country.lastIndexOf(\"almanya\") = " + country.lastIndexOf("almanya"));

    }
}
