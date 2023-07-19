package ch24_encapsulation.encapsulation04;

import java.util.Scanner;

public class bmi {
    /* Task ->
1. step -> Bmı class fields -> name, age, weight,height: encapsulated
2. step -> getBMI() method -> bmi = weight/(height*height) return type olmalı
3. step -> getStatus() method -> bmi 18.5 ten kucukse zayif,
  25 ten kucukse normal,
  30 dan kucukse kilolu,
  30 ustu obez return type
4. step -> getter setter  constructor toString methodlari create ediniz
5. step -> runner class obj ile dataları print eden code create ediniz
 */

    private String name;
    private int age;
    private double weight;
    private double height;

    public double getbmi(){
        double bmi=weight/(height*height);
        return  bmi;
    }


    @Override
    public String toString() {
        return "bmi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public bmi() {
    }

    public bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}

class  runner{
    public static void main(String[] args) {
        bmi obj=new bmi("hasan",31,88,1.80);
        System.out.println("obj = " + obj);
        Scanner input=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String name= input.nextLine();

        System.out.println("yaşını giriniz");
        int age= input.nextInt();

        System.out.println("kilonuzu giriniz");
        double weight= input.nextDouble();

        System.out.println("boyunu gir");
        double height= input.nextDouble();

        bmi obj2=new bmi(name,age,weight,height);
        System.out.println("obj2 = " + obj2);
    }
}
