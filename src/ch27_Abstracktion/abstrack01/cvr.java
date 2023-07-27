package ch27_Abstracktion.abstrack01;

public class cvr extends honda{
    @Override
    void motor() {
        System.out.println("motor 3,5");

    }

    @Override
    void koltuk() {
        System.out.println("8 ileiri koltuk");

    }

    @Override
    void kapı() {
        System.out.println("kapılar yukarı açılır");

    }
}
