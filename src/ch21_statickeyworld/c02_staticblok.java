package ch21_statickeyworld;

public class c02_staticblok {
    static  String isim="şafak hanım";


    static {
        System.out.println("static method başladı");

    }

    public static void main(String[] args) {
        System.out.println("main method başladı");
        isim="ali bey";
        System.out.println("isim = " + isim);
    }
}
