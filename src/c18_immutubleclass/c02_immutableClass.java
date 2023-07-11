package c18_immutubleclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class c02_immutableClass {
    public static void main(String[] args) {

        /*
 Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
 BigDecimal, BigInteger ,LocalDate LocalTime  java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
       Date,LocalDateTime StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
*/
        //immutable
        LocalDate bugün= LocalDate.now();
        System.out.println("bugün = " + bugün);
        bugün.plusDays(5);
        System.out.println("bugün = " + bugün);

        LocalTime şimdi=LocalTime.now();
        System.out.println("şimdi = " + şimdi);
        şimdi.plusHours(5);
        System.out.println("şimdi = " + şimdi);

    //mutable

        Date date=new Date();
        System.out.println("date = " + date);
        date.setTime(12345655);
        System.out.println("date = " + date);
    }
}
