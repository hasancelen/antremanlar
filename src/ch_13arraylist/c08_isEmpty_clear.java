package ch_13arraylist;

import java.util.ArrayList;
import java.util.List;

public class c08_isEmpty_clear {
    public static void main(String[] args) {
//isEmpty() listin boş olmasını kontrol eder true/false return eder
        //clear() listin tüm elemanlarını siler

        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));

        System.out.println("country = " + country);
        System.out.println("country.isEmpty() = " + country.isEmpty());

        country.clear();
        System.out.println("country = " + country);

        System.out.println("country.isEmpty() = " + country.isEmpty());
    }
}
