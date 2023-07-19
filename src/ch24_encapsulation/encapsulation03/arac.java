package ch24_encapsulation.encapsulation03;

public class arac { /*
     TASK
 1- fieldları(encapsulated) model(String), renk(String), motor(int),
 yil (int)
olan Arac  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet
 araba creat ediniz

5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı
veri girisine karsi kontrol ediniz.
  */
    private String model;
    private String renk;
    private int motor;
    private int yıl;

    public arac(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
       setMotor(motor);
       setYıl(yıl);
        // this.motor = motor;
        //this.yıl = yıl;
    }

    public arac() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {

        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("fındık kadar motor mu olur yakıtlar pahalı herhalde");
            this.motor = 1001;
        }else this.motor=motor;

    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        if (yıl<0){
            System.out.println("eksi yıl farkındamısın");
            this.yıl = (-1)*yıl;
        } else if (yıl>2005) {
            System.out.println("o yıldaki arabanın burda ne işi var");
            this.yıl=2023;
        }else this.yıl=yıl;

    }

    @Override
    public String toString() {
        return "aracrunner{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }
}

