package task12;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.
int [][] sayı= {{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i = 0; i < sayı.length; i++) {
            for (int j = 0; j < sayı[i].length; j++) {
                if (sayı[i][j]==2){
                    sayı[i][j] = 6;
                }

            }

        }
        System.out.println("Arrays.deepToString(sayı) = " + Arrays.deepToString(sayı));


    }
}