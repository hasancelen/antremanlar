package ch_13arraylist;

import java.util.ArrayList;
import java.util.List;

public class c05_size {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());
    }
}
