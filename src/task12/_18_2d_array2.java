package task12;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.

int [][] sayı={{5,2,1} , {10,2,3,6} , {1,2}};
    int toplam=0;
        for (int i = 0; i < sayı.length; i++) {
            for (int j = 0; j < sayı[i].length; j++) {
                toplam+=sayı[i][j];

            }
        }
        System.out.println("toplam = " + toplam);
    }
}