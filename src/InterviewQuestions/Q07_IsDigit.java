package InterviewQuestions;

import java.util.Scanner;

public class Q07_IsDigit {
      /* Task->
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bizim ooolannn bişeyleee girceng mi : ");
        String bişey = input.nextLine();

        System.out.println("sumOfDigit(bişey) = " + sumOfDigit(bişey));//meth call...


    }//main sonu

    private static int sumOfDigit(String str) {
        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {//J4\/4 1$ 34$¥

            if (Character.isDigit(str.charAt(i))) {
                //toplam+=Integer.valueOf(str.charAt(i));
                toplam+=Character.getNumericValue(str.charAt(i));//asci değeri olna character numerik değere atandı
            }

        }

        return toplam;
    }


}//Class sonu
