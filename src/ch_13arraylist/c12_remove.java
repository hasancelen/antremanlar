package ch_13arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c12_remove {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        Collections.sort(country);
        System.out.println("country.remove(\"norvec\") = " + country.remove("norvec"));
        System.out.println("country.remove(\"madagaskar\") = " + country.remove("madagaskar"));
        System.out.println("country.remove(1) = " + country.remove(1));
        System.out.println(country);
        country.add("amerika");
        country.add("ukraniya");
        country.add("hollanda");
        country.add("amerika");
        System.out.println(country);
        System.out.println("country.remove(\"amerika\") = " + country.remove("amerika"));
        System.out.println(country);
    }
}
