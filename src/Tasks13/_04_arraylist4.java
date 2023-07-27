package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String s1 = "blue";
        String s2 = "yellow";
        System.out.println(changeInArraylist(list, s2, s1));


    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> list, String s2, String s1) {
        for (String avuc:list) {
                Collections.replaceAll(list,"blue","yellow");

        }
        return list;
    }


}
