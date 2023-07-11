package ch17_passByValue;

public class c05_passbyvalue_referance {
    public static void main(String[] args) {
        double etiketfiyat=100;
        double indirimoranı=0.1;
        System.out.println("        indirim öncesi etiket fiyatı"+etiketfiyat);
    etiketfiyat=indirim(etiketfiyat,indirimoranı);
        System.out.println("indirim sonrası etiket fiyatı"+etiketfiyat);
    }

    private static double indirim(double etiketfiyat, double indirimoranı) {
etiketfiyat*=(1-indirimoranı);
        System.out.println("method içinden fiyat "+etiketfiyat);
    return etiketfiyat;
    }
}
