package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class  _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(5,4,6,2,1));
        hillNum(list);
        System.out.println(hillNum(list));


    }

    private static int hillNum(ArrayList<Integer> list) {
        int a=0;
        for (int i = 1; i < list.size()-1 ; i++) {
            if (list.get(i)< list.get(i-1)&&list.get(i)>list.get(i+1));
            a= list.get(i);
        }
        return a;
    }


}
