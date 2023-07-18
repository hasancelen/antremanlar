package ch21_statickeyworld;

public class c03_statickeyworld {
    int id;
    static  int mevcut;
    public c03_statickeyworld(){
        mevcut++;
        id+=mevcut;

    }

    public static void main(String[] args) {
        c03_statickeyworld obj1=new c03_statickeyworld();
        c03_statickeyworld obj2=new c03_statickeyworld();
        c03_statickeyworld obj3=new c03_statickeyworld();
        c03_statickeyworld obj4=new c03_statickeyworld();
        c03_statickeyworld obj5=new c03_statickeyworld();


        System.out.println("obj1.id = " + obj1.id);
        System.out.println("obj2.id = " + obj2.id);
        System.out.println("obj3.id = " + obj3.id);
        System.out.println("obj4.id = " + obj4.id);
        System.out.println("obj5.id = " + obj5.id);


        System.out.println("obj1.mevcut = " + obj1.mevcut);
        System.out.println("obj2.mevcut = " + obj2.mevcut);
        System.out.println("obj3.mevcut = " + obj3.mevcut);
        System.out.println("obj4.mevcut = " + obj4.mevcut);
        System.out.println("obj5.mevcut = " + obj5.mevcut);

    }
}
