package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class c02_iterator {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));
        Iterator<String> Iteratorlist=list1.iterator();

        while (Iteratorlist.hasNext()){
            Iteratorlist.next();
            Iteratorlist.remove();

        }
        System.out.println(list1);
    }
}
