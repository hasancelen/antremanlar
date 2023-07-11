package ch14_ForEachLoop;

public class c02_forechloop {
    public static void main(String[] args) {
        // task bir md array in elamanlarının çarpımını print eden code create ediniz...-> with for-each
        int[][] arr = {{2, 5, 6, 8}, {0, 2, 5, 8}, {3, 5, 7, 9}};
        int çarpım = 1;
        for (int[] a : arr) {
            for (int y : a) {
                çarpım *= y;
            }
        }
        System.out.println(çarpım);
    }
}
