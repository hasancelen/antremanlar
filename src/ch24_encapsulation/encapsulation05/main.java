package ch24_encapsulation.encapsulation05;

import java.util.Scanner;

public class main {/*
 step 1 ->  Burada iki adet class olsun. Biri Main, diğeri ise student ,
   student classı içinde;
 step 2 -> String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

   Main classın içinde;
 step 3 ->  girilen değerleri aşagıdaki gibi print eden code create ediniz
   Örnek:
   age 12'dir.
   name Steven'dır.

   name(isim) olarak;
   "Student name is Steven"
   ve
   age(yaş) olarak da;
   "He is 12 years old"


*/

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String name= input.nextLine();

        System.out.println("yaşınızı giriniz");
        int yas= input.nextInt();
student obj=new student(name,yas);
        System.out.println("obj = " + obj);
    }
}

class student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "student name is "+name+"\n"+"he-she is "+age;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
