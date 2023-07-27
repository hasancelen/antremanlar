package ch27_Abstracktion.abstrack_polymorphism01;

import javax.swing.*;

public abstract class abstractclass {
    public static void bylinktext(){
        System.out.println("link text super");
    }
    public void get(){
        System.out.println("chrome");
    }
   abstract void absmethod();



}

class test extends abstractclass{
    public static void bylinktext(){
        System.out.println("link text sub class");
    }
    public void get(){
        System.out.println("fire fox");
    }

    @Override
    void absmethod() {

    }
    public static void test(){
        System.out.println("test methodu");
    }

    public static void main(String[] args) {
        test.bylinktext();
        abstractclass.bylinktext();

        abstractclass obj=new test();
        obj.absmethod();
        obj.get();


    }
}
