package ch30_collection.c01_linkedlist;

import java.util.LinkedList;

public class c02_linkedlist {
    public static void main(String[] args) {

        //task    char String int veri ekleyevbleceginiz bir linkedlist create edin

        LinkedList<Object> linkedList = new LinkedList<>();

        linkedList.add("ezgisu");
        linkedList.add(35);
        linkedList.add('$');
        System.out.println("linkedList = " + linkedList);

    }
}
