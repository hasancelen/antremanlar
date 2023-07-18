package cod_chalange.Challange08;

import java.util.Scanner;

public class Q23_UsingDoWhileWithCondition {
    /*  Task->
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        Girilen bir sayı için 100'den küçük ise  "Won!"
        değilse "Lost!" print eden code create ediniz.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı= input.nextInt();
        if (sayı<100) System.out.println("won");
        else System.out.println("lost");


    }

}
