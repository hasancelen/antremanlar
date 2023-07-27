package ch26_Exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class c02_Fileinputexception03 {



    public static void main(String[] args){
        Object obj="javadan sudan konuşuyoruz";
        String str=(String) obj;
        System.out.println("str = " + str);

        Object sayı=10;
        // String str2=(String) sayı;
       // RTE System.out.println("str2 = " + str2);


        try {
            String str2=(String) sayı;
        } catch (ClassCastException e) {
            System.out.println("integer değer String e cast edilemez");;
        }

        try {
            String str3=(String) sayı;
            System.out.println("bu kodu okuduysan kod hatasız çalış mış demektir");
        } catch (Exception e) {
            System.out.println("cast işlemi başarısız oldu");
        }
        System.out.println("bu kod çalışır mı");
    }

}
