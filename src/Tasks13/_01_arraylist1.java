package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

          String meyve="orange";
          ArrayList<String> list=new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
          getcount(list,meyve);
        System.out.println("getcount(list,meyve) = " + getcount(list, meyve));


    }

    private static int getcount(ArrayList<String> list, String meyve) {
        int count=0;
        for (String avuc:list) {
            if (avuc.toLowerCase().contains(meyve.toLowerCase())) count++;
        }
        return count;
    }


}
