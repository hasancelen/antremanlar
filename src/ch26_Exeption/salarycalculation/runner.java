package ch26_Exeption.salarycalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {


        employee employee = new employee("hasan", 150000, 50, 2020);
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raisesalary() = " + employee.raisesalary());

        System.out.println("employee = " + employee);
        salarycalculate();


    }

    private static void salarycalculate() { Scanner input=new Scanner(System.in);

        System.out.println("ismini gir");
        String name= input.nextLine().trim();

        System.out.println("maasını gir");
        try {
            int salary= input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatalı giriş yaptınız");
            salarycalculate();
        }

        System.out.println("çalışma saati gir");
        try {
            int workhours= input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatalı giriş yaptınız");
            salarycalculate();
        }
        System.out.println("işe başlama yılı gir");
        try {
            int year= input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatalı giriş yaptınız");
            salarycalculate();
        }

    }
}