package ch17_passByValue;

public class c04_passbyvalue_referance {
    static  double etiketfiyatı;
    static  double indirimoranı;
    public static void main(String[] args) {
etiketfiyatı=100;
        System.out.println("method call öncesietiket fiyatı "+ etiketfiyatı);
        indirimoranı=0.1;
        indir();
        indir();
        indir();
        System.out.println("method call sonrası etiket fiyatı "+ etiketfiyatı);
    }

    private static void indir() {
        etiketfiyatı*=(1-indirimoranı);
        System.out.println("etiket fiyatı method içinden "+etiketfiyatı);

    }
}
