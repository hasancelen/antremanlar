package ch22_scope;

public class c01_instancevariable {
    int id;
    int yas;
    int tecrübe;
    String name;
    boolean emeklimi;
    double boy;
            char unvan;

    public static void main(String[] args) {
        c01_instancevariable objet=new c01_instancevariable();
        objet.id=1001;
        objet.emeklimi=false;
        objet.name="john";
        objet.tecrübe=23;
        objet.yas=46;


        System.out.println("objet.name = " + objet.name);
        System.out.println("objet.unvan = " + objet.unvan);
        System.out.println("objet.boy = " + objet.boy);
    }
    public void nonstaticmethod(){
        System.out.println("static olmayan method çalıştı");
        staticmethod();//non static methoddan static method call edildi
    }
    public static void staticmethod(){
        System.out.println("static method çalıştı");
//nonstaticmethod(); static method için de non static method call edilmez
    }



}
