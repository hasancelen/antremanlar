package cod_chalange.Challange08;

public class Task04 {
    public static void main(String[] args) {
        /*task->
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * print eden   method create ediniz.
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

toplamdokuzolansayılar(arr,istenenToplam);
        }

    private static void toplamdokuzolansayılar(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == istenenToplam){
                    System.out.println( arr[i]+" ve " +arr[j]+" toplamı "+istenenToplam);
                }

            }
        }
    }
}

