package ch23_accesmodifier;

import ch23_accesmodifier.newpackage.c03_accessmodifier;

public class c02_accssmodifier {
    public static void main(String[] args) {


        C01_AccessModifier obj1 = new C01_AccessModifier();
        C01_AccessModifier obj2 = new C01_AccessModifier();
    obj1.defaultYas=33;
    obj1.protectedYas=66;
    obj1.publicYas=55;

        System.out.println(obj1);

        c03_accessmodifier obj4=new c03_accessmodifier();
        System.out.println("obj4.publicname = " + obj4.publicname);

    }

}
