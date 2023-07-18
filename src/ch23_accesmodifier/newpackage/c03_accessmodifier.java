package ch23_accesmodifier.newpackage;

import ch23_accesmodifier.C01_AccessModifier;

public class c03_accessmodifier {

    private String privatename="meryem hanım";
    String defaultname="zeynep hanım";
    public String publicname="ali bey";
    protected String protectedname="hasan bey";

    public static void main(String[] args) {
        C01_AccessModifier obj01=new C01_AccessModifier();
        System.out.println("obj01.publicYas = " + obj01.publicYas);



    }
}
