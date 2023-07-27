package öğretmenöğrenciprojesi;

public class öğrenci extends kişi{

   private String numara;
    private String sınıf;

    public öğrenci(String ad_soyad, String kimlikno, int yaş, String numara, String sınıf) {
        super(ad_soyad, kimlikno, yaş);
        this.numara = numara;
        this.sınıf = sınıf;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    @Override
    public String toString() {
        return   super.toString() +'\''+
                " numara='" + numara + '\'' +
                ", sınıf='" + sınıf + '\'' ;
    }
}
