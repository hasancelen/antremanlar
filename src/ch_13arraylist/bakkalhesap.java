package ch_13arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bakkalhesap {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> name = new ArrayList<>(List.of("ali", "serap", "zeynep", "fuat"));
        ArrayList<String> newnames = new ArrayList<>();
        for (int i = 0; i < name.size(); i++) {
            if (!name.get(i).toLowerCase().contains("a")) {
                newnames.add(name.get(i));
            }

        }
        System.out.println("newnames = " + newnames);
        name.clear();
        System.out.println("name = " + name);
        name.addAll(newnames);
        System.out.println("name = " + name);


    }
}
