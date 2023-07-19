package task12;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
int [] array={25,30,30,35,100};
int toplam=0;
for (int saydırma:array) {
    toplam+=saydırma;
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("toplam = " + toplam);
    }
}