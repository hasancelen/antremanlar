package ch16_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class c04_localdatetimeformatter {
    public static void main(String[] args) {

        /*
format->
        GUN
d : basta 0 varsa 0 yazmadan gun numarasi yazılır
dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
DDD : yilin kacinci gunu oldugunu yazar
E, EE, EEE : gun isminin ilk 3 harfi
EEEE : gun isminin tamamini

AY (Ay icin M, dakika icin m kullanilir)
M : basta 0 varsa 0 yazmadan ay numarasi yazılır
MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
MMM : Ay isminin ilk 3 harfi yazılır
MMMM : Ay isminin tamami yazılır

YY : yilin son iki rakamini
YYYY : Yilin tamamini yazılır

Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

HH : saatin tamami, tek rakamli saat olursa 02 gibi
H  : tek rakamli saat olursa sadece saati yazar
HH olursa 24 saatlik dilimine gore olur

hh :  12 saat dilimine gore 2 rakam olarak yazılır
h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

m : minute tek rakamlari tek yazlır
mm: tek rakamlari 08 gibi yazılır

a yazarsak AM veya PM degerini yazar


        */
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("ldt.format(format) = " + ldt.format(format));
        System.out.println("format.format(ldt) = " + format.format(ldt));
        LocalDate date = LocalDate.of(2018, Month.APRIL, 29);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    }
}
