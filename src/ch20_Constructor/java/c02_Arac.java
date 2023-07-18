package ch20_Constructor.java;

public class c02_Arac {

    String marka;
    String model;
    Double motorhacmi;
    Boolean vitesauto ;
    Boolean ikinciel ;

    int yıl;
    String tramer;

int km;
    public static void main(String[] args) {

        c02_Arac arac1=new c02_Arac();
        arac1.ikinciel=true;
        arac1.marka="mercedes";
        arac1.km=50000;
        arac1.model="cla";
        arac1.motorhacmi=2.0;
        arac1.tramer="5 kaza var";
        arac1.yıl=2022;

        System.out.println("arac2 = " + arac1);

        System.out.println(arac1.marka + " " + arac1.tramer + " " + arac1.ikinciel + " " + arac1.km + " " + arac1.model + " " + arac1.motorhacmi + " " + arac1.yıl);

        //task -> 2. bir aracın tum field'larını atayarak print ediniz.

        c02_Arac arac2=new c02_Arac();
        arac2.ikinciel=true;
        arac2.marka="ford";
        arac2.km=4000;
        arac2.model="focus";
        arac2.motorhacmi=1.6;
        arac2.tramer="1 kaza var";
        arac2.yıl=2010;
        System.out.println("arac2 = " + arac2);


    }

    @Override
    public String toString() {
        return "c02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", vitesauto=" + vitesauto +
                ", ikinciel=" + ikinciel +
                ", yıl=" + yıl +
                ", tramer='" + tramer + '\'' +
                ", km=" + km +
                '}';
    }
}

