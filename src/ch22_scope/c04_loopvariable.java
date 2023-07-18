package ch22_scope;

public class c04_loopvariable {
    public static void main(String[] args) {

        int yas=33;

        System.out.println(yas);
        for (int i = 0; i < yas; i++) {
            System.out.println(yas);
            int maaş=30000;

        }
    c01_instancevariable obj=new c01_instancevariable();
        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.tecrübe = " + obj.tecrübe);


        c01_instancevariable.staticmethod();
        obj.nonstaticmethod();

    }
}
