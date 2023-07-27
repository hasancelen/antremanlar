package ch15_varargs;

public class task02 {
    public static void main(String[] args) {/*
Task ->
array deki ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
 */

        int []arr = {2,55,66,88,5,2,4,5,6,3,8,55,33,34,35};
hasan(arr);
        System.out.println(hasan(arr));

    }

    private static int hasan(int[] arr) {
        int toplam=0;
        for (int i = 1; i < arr.length ; i++) {
            toplam+=arr[i];
        }toplam*=arr[0];
        return toplam;
    }
}
