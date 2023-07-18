package ch20_Constructor.java;

public class c01_construster {

    /*
   1- constructor ismi Class name ile aynı olmalı.Buyuk harf ile başlamalı
   2- constructor create eedildigğinde name den sonra () {} mutlaka kullanılmalı
   3- eger p'li cons. create edilirse java default cons ezer(siler)
   4- cons. return type olmaz method'dan ayıran özelliğidir.
   5-Class create edildiginde java default cons. kendi create eder.
    */

    String str;
    String selam="hello world";

    public static void main(String[] args) {
        c01_construster obj1=new c01_construster();
        c01_construster obj2=new c01_construster();
        c01_construster obj3=new c01_construster();
        c01_construster obj4=new c01_construster();


        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj1.selam = " + obj1.selam);

        obj1.str="javaslan";
        obj2.str="javatar";
        System.out.println("obj3.selam = " + obj3.selam);


        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj4.str = " + obj4.str);


        obj2.method();
        obj4.method();


    }
public void method(){
    System.out.println("methoddan merhaba");
}


}
