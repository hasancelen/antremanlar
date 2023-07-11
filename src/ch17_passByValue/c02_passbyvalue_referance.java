package ch17_passByValue;

public class c02_passbyvalue_referance {
    public static void main(String[] args) {
        double fiyat = 100;
        System.out.println("method call öncesi fiyat = "+fiyat);
        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));
        System.out.println("method call sonrası fiyat = " + fiyat);

    }

    private static double indir33(double fiyat) {
        return fiyat*=0.67;
    }

    private static double indir22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indir11(double fiyat) {
        return fiyat*=0.89;
    }
}
