package ch30_collection.c01_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class c03_linkedlist {
    public static void main(String[] args) {


        LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList("berlin", "ankara", "izmir", "dortmund", "istanbul", "newyork"));

        System.out.println("linkedlist = " + linkedlist);


        linkedlist.remove();
        System.out.println("linkedlist = " + linkedlist);

        linkedlist.remove(2);
        System.out.println("linkedlist = " + linkedlist);

        System.out.println("linkedlist.remove(\"ankara\") = " + linkedlist.remove("ankara"));
        System.out.println("linkedlist.remove(\"ankara\") = " + linkedlist.remove("ankara"));

        linkedlist.add("izmir");
        System.out.println("linkedlist = " + linkedlist);

        System.out.println("linkedlist.removeFirstOccurrence(\"izmir\") = " + linkedlist.removeFirstOccurrence("izmir"));
        System.out.println("linkedlist = " + linkedlist);

        linkedlist.add("newyork");
        System.out.println("linkedlist = " + linkedlist);

        System.out.println("linkedlist.removeLastOccurrence(\"newyork\") = " + linkedlist.removeLastOccurrence("newyork"));
        System.out.println("linkedlist = " + linkedlist);


        System.out.println("linkedlist.element() = " + linkedlist.element());


        System.out.println("linkedlist.getLast() = " + linkedlist.getLast());
        System.out.println("linkedlist.getFirst() = " + linkedlist.getFirst());

        LinkedList<String>linkedlist1=new LinkedList<>(Arrays.asList("bilecik","pursaklar","menemen","dortmund","istanbul","newyork"));
        LinkedList<String>linkedlist2=new LinkedList<>(Arrays.asList("berlin","ankara","izmir","dortmund","istanbul","newyork"));

        System.out.println("linkedlist = " + linkedlist1);
        System.out.println("linkedlist = " + linkedlist2);

        linkedlist1.addAll(linkedlist2);
        System.out.println("linkedlist1 = " + linkedlist1);

        linkedlist1.removeAll(linkedlist2);
        System.out.println("linkedlist1 = " + linkedlist1);

    }
}