package ch30_collection.c01_linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class c01_linkedlist {
    public static void main(String[] args) {

        /*
       LinkedList .....
       1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node"
       olarak tanımlanır.
       2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
       3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
       4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.Linkedlist eleman bulmada
       index yapısı olmadıgı için başarısıdır.
       5-LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşümülebilir
       6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...)
        olmamasına diakkat edilmeli
           Ancak obj DataType olarak parent interface tanımlanabilir.
       7- LinkedList clss iki tane parent interface'den(List,Queue) implement etmiştir.
        */


        LinkedList<String>linkedlist=new LinkedList<>(Arrays.asList("berlin","ankara","izmir","dortmund","istanbul","newyork"));

        System.out.println("linkedlist = " + linkedlist);

        linkedlist.add("manhein");
        System.out.println("linkedlist = " + linkedlist);

        linkedlist.add(2,"sose");
        System.out.println("linkedlist = " + linkedlist);

        linkedlist.addFirst("javaslan");
        System.out.println("linkedlist = " + linkedlist);

        linkedlist.addLast("sonburak");
        System.out.println("linkedlist = " + linkedlist);

        //polymorphism e ornek olmasi icin linkedlist ve list kullanararak obje creaet edin

        List<String> list2=new LinkedList<>(List.of("almanya","fransa","amerika","hollanda"));
        linkedlist.addAll(list2);
        System.out.println("linkedlist = " + linkedlist);
    }
}
