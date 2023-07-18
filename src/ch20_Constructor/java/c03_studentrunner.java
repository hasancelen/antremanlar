package ch20_Constructor.java;

public class c03_studentrunner {
    public static void main(String[] args) {

        c03_Student std=new c03_Student();
        std.name="çınar";
        std.lastname="kılıç";
        std.classno=123;
        std.degree=90.5;
        std.success=true;
        std.schoolno=355;


        System.out.println("std = " + std);
        std.graduate();


    }
}
