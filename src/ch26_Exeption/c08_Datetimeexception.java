package ch26_Exeption;

import java.time.DateTimeException;
import java.time.LocalDate;

public class c08_Datetimeexception {
    public static void main(String[] args) {

        // RTE     LocalDate date=LocalDate.of(2023,4,33);

        try {
            LocalDate date=LocalDate.of(2023,4,33);
            System.out.println("try sorunsuz çalıştı");
        } catch (DateTimeException e) {
            System.out.println("catch blok exception yakaladı");
            System.out.println(e.getMessage());
        }
        System.out.println("sorun çözüldü devam et");
    }
}
