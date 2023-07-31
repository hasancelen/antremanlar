package ch28_ınterface_polymorphism.ınterface;

public class c06_passat extends c02_volkswagen implements c03_dışdonanım,c04_icdonanım,c05_lastik {
    @Override
    public void motor() {
        System.out.println("2.0 olamalı");

    }

    @Override
    public void yakıt() {
        System.out.println("benzin");

    }

    @Override
    public void kapı() {
        System.out.println("5 kapı");
    }

    @Override
    public void kaporta() {
        System.out.println("sağlam");
    }

    @Override
    public void koltuk() {
        System.out.println("6 koltuklu");
    }

    @Override
    public void klima() {
        System.out.println("dijital");
    }

    @Override
    public void ebat() {
        System.out.println("18 inç");
    }

    @Override
    public void jant() {
        System.out.println("19 inç jant");
    }
}
