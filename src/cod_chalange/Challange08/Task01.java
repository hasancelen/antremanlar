package cod_chalange.Challange08;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
		/* task->
        verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int [] arr = {2,6,4,5,8,9};
        System.out.println("array elemanları"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {//arr elemanlarının tekrara alanloop
            arr[i]*=arr[i];
        }
        System.out.println("array elemanları kareleri  : "+Arrays.toString(arr));

    }
}
