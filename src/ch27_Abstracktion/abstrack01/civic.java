package ch27_Abstracktion.abstrack01;

public class civic extends lastik{
    @Override
    void motor() {
        System.out.println("civic için ideal motor 1,6");

    }

    @Override
    void koltuk() {
        System.out.println("koltuklar kadife kumaş");

    }

    @Override
    void kapı() {
        System.out.println("4 kapı uzun kasa");

    }

    @Override
    public void lastikebat() {
        System.out.println("lastikler 18 inç");

    }
    public int vites(){
        return 6;
    }
}
