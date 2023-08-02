package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class c01_Iterator {
    public static void main(String[] args) {


        Arrays Arrays = null;
        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));


        System.out.println("list1 in ilk hali  = " + list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");

            //task list1 in herbir elemani for loop ile isimlere SDET ekleryerek update ediniz

            for (i = 0; i < list1.size(); i++) {
                String name = list1.get(i);
                list1.set(i, name + " SDET");// set methodu ile kalıcı değişiklik yapıyoruz

                // list 1 i iterator yap

                Iterator<String> list1iterator = list1.iterator();

                while (list1iterator.hasNext()) {
                    System.out.println(" " + list1iterator.next());
                }






            }

        }

        //task list deki elemanlari silip print ediniz Iterator ile


    }
}
