package InterviewQuestions;

import java.util.Arrays;

public class Q43_Printing2DArray {

    // Task-> Print 2D String array using loops

    public static void main(String[] args) {
        String arr[][] = {{"zeynep", "Aytekin", "Furkan", "Serap"}, {"Qa", "Developer", "PM", "Sm"}};
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }

        }

    }
}
