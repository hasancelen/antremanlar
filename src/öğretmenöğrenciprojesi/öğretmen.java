package öğretmenöğrenciprojesi;

public class öğretmen extends kişi{

    private String bölüm;
    private String sicilno;

    public öğretmen(String ad_soyad, String kimlikno, int yaş, String bölüm, String sicilno) {
        super(ad_soyad, kimlikno, yaş);
        this.bölüm = bölüm;
        this.sicilno = sicilno;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public String getSicilno() {
        return sicilno;
    }

    public void setSicilno(String sicilno) {
        this.sicilno = sicilno;
    }

    @Override
    public String toString() {
        return "öğretmen{" +
                "bölüm='" + bölüm + '\'' +
                ", sicilno='" + sicilno + '\'' +
                "} " + super.toString();
    }
}
