package ch30_collection.emailcretion;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("name alalım");

        String name= input.nextLine();

        System.out.println("last name");
        String lastname= input.nextLine();

        email email1=new email(name,lastname);

    }
}
