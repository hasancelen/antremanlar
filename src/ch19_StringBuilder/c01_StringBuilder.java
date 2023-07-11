package ch19_StringBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

public class c01_StringBuilder {
    public static void main(String[] args) {
 /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */
        String str="jzvaslan";
        System.out.println("method öncesi str = " + str);
        strBirleştir(str);
        System.out.println("method sonrası str : "+str);
        // task -> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time
// surelerini karsılatırın

        String a="a";
        StringBuilder sb1=new StringBuilder("");
        LocalTime str1basla= LocalTime.now();
        System.out.println("str obj başladı"+str1basla);
        for (int i = 0; i < 50000; i++) {
            a+=i;

        }
LocalTime str1bitti=LocalTime.now();
        System.out.println("String obj bitti "+str1bitti);

        System.out.println("fark"+(str1bitti.getNano()-str1basla.getNano()));

    }

    private static void strBirleştir(String str) {
        System.out.println(str+" selam method dan");
    }
}
