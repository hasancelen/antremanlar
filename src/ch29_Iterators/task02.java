package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class task02 {
    public static void main(String[] args) {/*  task->
     Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23]
    */
        List<Integer> numberlist = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println("numberlist = " + numberlist);

        ListIterator<Integer> listIterator3 = numberlist.listIterator();
        while (listIterator3.hasNext()) {
            int a=listIterator3.next();
            if (a<20||a>40){
                listIterator3.remove();
            }
        }
        System.out.println(numberlist);

    }
}
