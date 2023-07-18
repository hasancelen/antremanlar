package ch20_Constructor.java;

public class c04_teacher {

    int id;
    String ad;
    String soyad;
    String branş;
    int tecrübe;
    int yaş;
    double maaş;
    boolean emeklime;

    public c04_teacher() {
    }

    public c04_teacher(String ad, String soyad, String branş) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
    }
    public void derssaati(){
        System.out.println("haftada 15 saat sonrası extra olur");
    }

    @Override
    public String toString() {
        return "c04_teacher{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrübe=" + tecrübe +
                ", yaş=" + yaş +
                ", maaş=" + maaş +
                ", emeklime=" + emeklime +
                '}';
    }
}

