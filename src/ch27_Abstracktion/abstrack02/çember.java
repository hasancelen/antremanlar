package ch27_Abstracktion.abstrack02;

public class çember extends sekil1{
    private double yarıçap;
    private final double pi=3.14;

    public çember(double yarıçap) {     this.yarıçap = yarıçap;
    }

    public double getYarıçap() {
        return yarıçap;
    }


    public void setYarıçap(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double alanhesaplama() {
        return pi*yarıçap*yarıçap;
    }

    @Override
    public double çevrehesaplama() {
        return 2*pi*yarıçap;
    }
}
