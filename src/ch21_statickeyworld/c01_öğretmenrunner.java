package ch21_statickeyworld;

public class c01_öğretmenrunner {
    public static void main(String[] args) {

        c01_öğretmen.okul="fatih sultan mehmet ilköğretim okulu";
        c01_öğretmen öğretmen=
                new c01_öğretmen("hasan",35);

        System.out.println("öğretmen = " + öğretmen);
        System.out.println("öğretmen.isim = " + öğretmen.isim);
        System.out.println("öğretmen.tecrübe = " + öğretmen.tecrübe);
        System.out.println("öğretmen.okul = " + öğretmen.okul);// normalde yapılmaz şu şekilde olması lazım System.out.println("öğretmen.okul = " + c01_öğretmen.okul);


        c01_öğretmen öğretmen2=
                new c01_öğretmen("mehmet",35);
        c01_öğretmen.okul="atatürk okulu";
        System.out.println("öğretmen2 = " + öğretmen2);
        System.out.println("öğretmen2.isim = " + öğretmen2.isim);
        System.out.println("öğretmen2.tecrübe = " + öğretmen2.tecrübe);
        System.out.println("öğretmen2.okul = " + öğretmen2.okul);


        c01_öğretmen.maashesapla();

    öğretmen2.evlilikyıldönümü();


    }
}
