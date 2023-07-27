package öğretmenöğrenciprojesi;

public class kişi {
    private String ad_soyad;
    private String kimlikno;
    private int yaş;

    public kişi(String ad_soyad, String kimlikno, int yaş) {
        this.ad_soyad = ad_soyad;
        this.kimlikno = kimlikno;
        this.yaş = Math.abs(yaş);
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(String kimlikno) {
        this.kimlikno = kimlikno;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    @Override
    public String toString() {
        return "kişi " +
                "ad_soyad='" + ad_soyad + '\'' +
                ", kimlikno='" + kimlikno + '\'' +
                ", yaş=" + yaş ;
    }
}
