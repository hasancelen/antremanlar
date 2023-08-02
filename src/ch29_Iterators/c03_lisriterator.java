package ch29_Iterators;

import java.util.*;

public class c03_lisriterator {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));

       // task yukaridaki LIST o ListIterator a atama yaparak SDET eklereyek update kalici ediniz.

        ListIterator<String> listIterator= list1.listIterator();
        while (listIterator.hasNext()){
            listIterator.set(listIterator.next()+" SDET");
        }
        System.out.println("list1 = " + list1);

        //task yeni list create ediniz
        //list1 i iterator a atayini
        //list2 yi add methodu ile list1 e ekleyin
        //herbir elemani prin ediniz
    List <String> list2=new ArrayList<>(Arrays.asList("hasan","mehmet"));
    ListIterator<String> listIterator2= list1.listIterator();
    while (listIterator2.hasNext()){
        listIterator2.set(listIterator2.next().toUpperCase());
listIterator2.add(list2.toString());
    }
        System.out.println(list2);
        System.out.println(list1);
    }
}
