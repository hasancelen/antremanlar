package ch13_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class task02 {
    public static void main(String[] args) {
         /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve
 harf sırasına göre yazdıran bir METHOD yazınız.
Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
 */
        String [][] arr1={{"Ali","Vel","Ayse"},{"Hasan","Can"},{"Suzan"}};
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        ArrayList<String> arr2=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2.add(i,arr1[i][j]);
            }
        }
        Collections.sort(arr2);
        System.out.println(arr2);
    }
}
