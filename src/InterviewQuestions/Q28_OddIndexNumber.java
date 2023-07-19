package InterviewQuestions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir şeyler giresen");
        String metin= input.nextLine();
       //for (int i = 0; i < metin.length(); i++) {
       //    if (i%2==1){
       //        System.out.print(metin.charAt(i));
       //    }

       //}
int index=1;
        do {
            System.out.print(metin.charAt(index));
            index+=2;
        }while (index<metin.length());
    }
}