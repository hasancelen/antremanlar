package ch16_datetime;

import java.time.LocalTime;

public class c02_localtime {
    public static void main(String[] args) {
        LocalTime suan=LocalTime.now();
        System.out.println("suan = " + suan);

        System.out.println("suan.getHour() = " + suan.getHour());
        LocalTime suan2=LocalTime.of(13,55,59);
        System.out.println("suan2 = " + suan2);
        System.out.println("suan2.plusNanos(123545689) = " + suan2.plusNanos(123545689));

        System.out.println("hız testi");
        LocalTime forloopbası=LocalTime.now();
        System.out.println("forloopbası = " + forloopbası);
        int toplam=0;
        for (int i = 0; i < 1000000; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
        LocalTime forloopsonu=LocalTime.now();

        System.out.println("forloopsonu = " + forloopsonu);
        System.out.println("forloopsonu.getNano()- forloopbası.getNano() = " + (forloopsonu.getNano() - forloopbası.getNano()));
        System.out.println("forloopsonu.getMinute()- forloopbası.getMinute() = " + (forloopsonu.getMinute() - forloopbası.getMinute()));

        System.out.println("forloopsonu.getNano() = " + forloopsonu.getNano());

    }
}
