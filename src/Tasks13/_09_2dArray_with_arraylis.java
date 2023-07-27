package Tasks13;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int [][] sayı={ {1,2,3},  { 4, 5, 6 },  { 7, 8, 9 } };
        ArrayList<Integer>sayı1=new ArrayList<>();
        for (int i = 0; i < sayı.length; i++) {
            for (int j = 0; j < sayı[i].length; j++) {
                sayı1.add(sayı[i][j]);
                System.out.println(sayı1);
            }

        }

    }

    }
