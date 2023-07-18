package cod_chalange.Challange08;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_UniqeArray {
    /* task->
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array print eden code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {

        int[]arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if (!list.contains(arr[i])){
               list.add(arr[i]);
           }
        }
        System.out.println("list = " + list);

    }
    }




