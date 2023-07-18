package ch22_scope;

public class c02_staticvariable {
    static String firmaadı;
    static int firmaıd;
    static boolean yerlimi;

    public static void main(String[] args) {
        System.out.println("firmaadı = " + firmaadı);
        firmaıd = 1001;
        System.out.println("firmaıd = " + firmaıd);
        c02_staticvariable.firmaadı = "zararına satışlar";
        yerlimi = false;
        staticmethod();


    }

    public void nonstaticmethod() {
        System.out.println("static olmayan method çalıştı");
        firmaadı = "nefes";
        firmaıd = 3003;
    }

    public static void staticmethod() {
        System.out.println("static method çalıştı");
        firmaadı = "continental";
        firmaıd = 2000;


    }
}
