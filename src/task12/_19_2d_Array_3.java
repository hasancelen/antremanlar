package task12;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String [][] kelime={{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};
        System.out.println("Arrays.deepToString(kelime) = " + Arrays.deepToString(kelime));
        for (int i = 0; i < kelime.length; i++) {
            for (int j = 0; j < kelime[i].length; j++) {
                if (kelime[i][j]=="ohio"){
                    kelime[i][j]="florida";
                }

            }

        }
        System.out.println("Arrays.deepToString(kelime) = " + Arrays.deepToString(kelime));


    }
}

