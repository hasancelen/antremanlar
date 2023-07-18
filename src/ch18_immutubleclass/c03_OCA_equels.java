package ch18_immutubleclass;

public class c03_OCA_equels {
    public static void main(String[] args) {

        String a="";
        String c="2false";
        a+=2;
        a+=c;
        a+=false;
        System.out.println("a = " + a);
        String b="2cfalse";
        System.out.println("b = " + b);
    }
}
