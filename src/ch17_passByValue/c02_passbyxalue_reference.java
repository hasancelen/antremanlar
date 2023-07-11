package ch17_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c02_passbyxalue_reference {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("opersyon öncesi list"+list);
        listupdate1(list);
        System.out.println("listupdate1 metodu çalıştı");
        listupdate2(list);
        System.out.println("listupdate2 metodu çalıştı");
        System.out.println("operasyon sonrası list= "+list);
    }

    private static void listupdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2); // buradaki get sayesinde değişikliği yapmış bulunuyoruz.

        }
        System.out.println("list update2 methodu içinden list "+list);
    }

    private static void listupdate1(List<Integer> list) {
        for (Integer w:list
             ) {w+=2;

        }
        System.out.println("listupdate1 methodu içinden list "+list);
    }
}
