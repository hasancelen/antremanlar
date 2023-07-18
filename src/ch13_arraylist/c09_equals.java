package ch13_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class c09_equals {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("a","b"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("A","b"));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList("a","b"));
        ArrayList<String> list4=new ArrayList<>(Arrays.asList("b","a"));

        //equals(); iki listin index ve eleman eşitliğini kontrol eder true/false return


        System.out.println("list1.equals(list2) = " + list1.equals(list2));
        System.out.println("list1.equals(list3) = " + list1.equals(list3));
        System.out.println("list1.equals(list4) = " + list1.equals(list4));
    }
}
