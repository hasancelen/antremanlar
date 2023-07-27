package ch27_Abstracktion.abstrack02;

public abstract class sekil1 {
private String name;

    public sekil1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanhesaplama();
    public abstract double çevrehesaplama();

    public String çiz(){
        return name+"isimli şekliniz çiziliyor";
    }
    @Override
    public String toString() {
        return "sekil1{" +
                "name='" + name + '\'' +
                "\n şekil alanı : "+this.alanhesaplama()+
                "\nşekil çevresi : "+this.çevrehesaplama()+"" +
                "\nçizilecek şekil"+this.çiz()+
                '}';
    }
}
