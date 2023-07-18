package ch20_Constructor.java;

public class c06_öğrencirunner {
    public static void main(String[] args) {
        c06_öğrenci öğrenci= new c06_öğrenci("furkanbey",35);

        System.out.println("********");
        System.out.println("öğrenci.isim = " + öğrenci.isim);
        System.out.println("öğrenci.yas = " + öğrenci.yas);
        System.out.println("öğrenci.age = " + öğrenci.age);
        System.out.println("öğrenci.name = " + öğrenci.name);

    }
}
