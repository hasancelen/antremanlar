package ch16_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class c03_Localtime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println("time = " + time);
        System.out.println("date = " + date);
        LocalDateTime dt=LocalDateTime.of(date,time);
        System.out.println("dt = " + dt);
        System.out.println("dt.plusYears(3) = " + dt.plusYears(3));
    }
}
