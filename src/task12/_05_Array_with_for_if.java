package task12;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

int [] array={5,6,8,12,14,19};
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                array[i]=(-1)*array[i];
            }
        }
        int toplam=0;
        for (int sayı:array) {
            toplam+=sayı;
        }
        System.out.println("toplam = " + toplam);
    }
}
