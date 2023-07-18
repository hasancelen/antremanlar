package ch13_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c15_arryconverttolist {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
String [] names={"ali","zeynep","fatih","şafak"};
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        List<String> namelist=Arrays.asList(names);
        System.out.println("namelist = " + namelist);
        ArrayList<String> nameArrayList= (ArrayList<String>) Arrays.asList(names);
        System.out.println("nameArrayList = " + nameArrayList);

    }
}
