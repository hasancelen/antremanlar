package task12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */
        int[] işaret = {1, 2, -3, 4, -5, -6};
        for (int i = 0; i < işaret.length; i++) {
            işaret[i] = işaret[i] * (-1);
        }
        System.out.println(Arrays.toString(işaret));

    }
}
