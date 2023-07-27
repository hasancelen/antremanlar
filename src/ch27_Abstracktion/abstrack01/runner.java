package ch27_Abstracktion.abstrack01;

public class runner {
    public static void main(String[] args) {
        civic cvc=new civic();
        System.out.println("cvc.vites() = " + cvc.vites());
        cvc.kapı();
        cvc.koltuk();
        cvc.lastikebat();
        cvc.motor();
        System.out.println("cvc.name = " + cvc.name);
    }
}
