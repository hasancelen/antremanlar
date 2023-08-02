package ch29_Iterators;

import java.util.*;

public class task01 { /*
task -> Verilen bir integer listin tek  elemanrının karesini tersten iterator  print eden code create ediniz
 */

    public static void main(String[] args) {
        List<Integer> numberlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("numberlist = " + numberlist);

        ListIterator<Integer> list1 = numberlist.listIterator();
        while (list1.hasNext()) {
            list1.next();
            }
while(list1.hasPrevious()){
    int a=list1.previous();
    System.out.println(a);
    if (a%2==1){
        list1.set(a*a);
    }else list1.remove();
        }
        System.out.println("numberlist = " + numberlist);
    }
}