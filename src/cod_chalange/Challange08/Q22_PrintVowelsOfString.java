package cod_chalange.Challange08;

import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birşeyler giriniz");
        String  str= input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.print(str.charAt(i)+" ");
            }

        }
        System.out.println("***cincix kod****");
        System.out.println(str.replaceAll("[^aeiuo]", ""));

    }

}
