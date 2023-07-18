package ch20_Constructor.java;

public class c07_öğretmen {
    String isim;
    int tecrübe;
    int kıdem;


    public c07_öğretmen(String isim, int tecrübe) {
        this.isim = isim;
        this.tecrübe = tecrübe;
    }

    public void kıdemhesapla(int kıdem) {
        System.out.println("kıdem : "+(kıdem*2));

        System.out.println("this.kıdem= "+this.kıdem);

    }
}