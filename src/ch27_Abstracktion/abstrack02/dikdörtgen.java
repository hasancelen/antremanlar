package ch27_Abstracktion.abstrack02;

public class dikdörtgen extends sekil1 {
    private double uzunkenar;
    private double kısakenar;

    public dikdörtgen(double uzunkenar, double kısakenar) {
        this.uzunkenar = uzunkenar;
        this.kısakenar = kısakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    public double getKısakenar() {
        return kısakenar;
    }

    public void setKısakenar(double kısakenar) {
        this.kısakenar = kısakenar;
    }

    @Override
    public double alanhesaplama() {
        return kısakenar*uzunkenar;
    }

    @Override
    public double çevrehesaplama() {
        return 2*(kısakenar+uzunkenar);
    }
}
