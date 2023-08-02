package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class c04_Previous {
    public static void main(String[] args) {
        List<Integer> numberlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("numberlist = " + numberlist);

        ListIterator<Integer> listIterator3 = numberlist.listIterator();
        while (listIterator3.hasNext()) {
            listIterator3.next();
        }
        while (listIterator3.hasPrevious()) {
            System.out.println(listIterator3.previous() + " ");
        }

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
        String str=listIterator.next();

        }
    }
}/*
      önemli ->  hasPrevious() meth için MUTLAKA  hasNext() ve next() meth
     calıştırılarak cursor(pointer) en sona getirilmeli.

     ITERATOR VE LISTITERATOR farkları

     1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
        LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

     2- LISTITERATOR -> sadece List yapılarda tanımlanır
        ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

     3- ITERATOR-> sadece ileri b->s tekrarlar
       LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

       ITERATOR-> kapsamı geniş ama aksiyonu az
       LISTITERATOR -> kapsamı dar ama aksiyıonu çok

        */