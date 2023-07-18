package ch21_statickeyworld;

public class c01_öğretmen {

    String isim;
    int tecrübe;
    static String okul;

    public c01_öğretmen(String isim, int tecrübe) {
        this.isim = isim;
        this.tecrübe = tecrübe;
    }

    public static void maashesapla() {
        System.out.println("  maaas sana yeterli ");
    }

    public  void evlilikyıldönümü() {
        System.out.println("  nice mutlu yıllara ");
    }

    @Override
    public String toString() {
        return "c01_öğretmen{" +
                "isim='" + isim + '\'' +
                ", tecrübe=" + tecrübe +
                '}';
    }
}
