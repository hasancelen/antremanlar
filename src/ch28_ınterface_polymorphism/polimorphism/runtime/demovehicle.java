package ch28_ınterface_polymorphism.polimorphism.runtime;

public class demovehicle {
    public static void main(String[] args) {

        vehice vehicle1=new vehice();
        vehice vehicle2=new sportcar();
        vehice vehicle3=new truct();

        vehicle1.speedto60km();
        vehicle2.speedto60km();
        vehicle3.speedto60km();

    }
}
