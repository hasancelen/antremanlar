package ch24_encapsulation.encapsulation03;

public class aracrunner {
    public static void main(String[] args) {
        arac arac1=new arac("tesla","blue",900,-2023);

        arac arac2=new arac("audi","black",2000,-2015);

        arac arac3=new arac();
        arac3.setModel("merso");
        arac3.setRenk("red");
        arac3.setMotor(800);
        arac3.setYıl(1923);


        System.out.println("arac1 = " + arac1);
        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);


    }
}

