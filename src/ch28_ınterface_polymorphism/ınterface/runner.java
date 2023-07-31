package ch28_ınterface_polymorphism.ınterface;

import java.util.ArrayList;
import java.util.List;

import static ch28_ınterface_polymorphism.ınterface.c03_dışdonanım.renk;

public class runner {
    public static void main(String[] args) {
c06_passat passat=new c06_passat();
passat.motor();
passat.ebat();
passat.jant();
passat.kapı();
passat.kaporta();
passat.klima();
passat.koltuk();
passat.yakıt();
passat.sunroof();
passat.sislamp();


        System.out.println("c05_lastik.renk = " + c05_lastik.renk);
        System.out.println("renk = " + renk);


    }
}
