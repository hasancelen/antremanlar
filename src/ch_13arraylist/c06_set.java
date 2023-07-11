package ch_13arraylist;

import java.util.ArrayList;
import java.util.List;

public class c06_set {
    public static void main(String[] args) {
//crud update işlemi için kullanılır


        ArrayList<String> country = new ArrayList<>(List.of("madagaskar", "yenizellenda", "almanya", "fransa"));
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());

        System.out.println("country.set(0,\"america\") = " + country.set(0, "america"));
    }
}
