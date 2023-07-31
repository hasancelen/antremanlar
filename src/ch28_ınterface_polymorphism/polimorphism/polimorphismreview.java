package ch28_ınterface_polymorphism.polimorphism;

class A{
    public void methoda(){
        System.out.println("method A from A class");
    }
    public static void methodC(){
        System.out.println("method C from A class");
    }

}
class B extends A{
    public void methoda(){
        System.out.println("method A from B class");
    }
    public static void methodB(){
        System.out.println("method B from B class");
    }
    public static void methotC(){
        System.out.println("methodC from B class");
    }
}
public class polimorphismreview {
    public static void main(String[] args) {
        A obj=new B();
        obj.methoda();
        B.methotC();
    }
}
