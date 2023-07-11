package ch_13arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c01_Arraylist {
    public static void main(String[] args) {
         /*
    Array List genel Tanimi:

           ArrayList<Type> arrayListName = new ArrayList<Type>();
                List<Type> arrayListName = new ArrayList<>();

            1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
               - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class dedigimiz object türünden olmalidir
               - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
               - int'n wrapper class'i        --> Integer'dir
               - double'un wrapper class'i    --> Double'dir. vs...

           2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
               - ArrayList'ler tanimlamada .size(); belirleme zorunlulugu yoktur degistirilebilir.
           3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

   List declarations(tanımlama) :
   Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
    eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


   key word: List<Wrapper Class> name=

   List'e assaign etme(atama) :
   List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
   List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
   List<wrapper Class> name = new ArrayList<>() *****doğru
   List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
   ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

   List'e ilk değer atama (initialize):....
   1.yol : asList();
   ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
   2.yol : Listof();
   ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

   ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
   Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


   Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

*/

        int sayi=99;
        int [] arr=new int[5];
        int[][] arrMd=new int[5][6];


        ArrayList<String> names=new ArrayList<>();//boyut belirlemeye gerek yok
        ArrayList<Integer> numbers=new ArrayList<>();


        System.out.println("names"+ names);//=names[]
        System.out.println("numbers"+ numbers);//=numbers[]

        //arraysliste veri ekleme
        names.add("22");
        names.add("şafak");
        names.add("iclal");
        names.add("rukiye");
        names.add("ali");
        names.add("burjuva");
        names.add("proleterya");

        System.out.println("names"+names);

        numbers.add(33);
        numbers.add(59);
        numbers.add(63);
        numbers.add(85);
        numbers.add(15);
        numbers.add(46);
        numbers.add(38);
        numbers.add(19);
        System.out.println("numbers"+numbers);


        //2. yol arraylıstte eleman ekleme
        ArrayList<String> city=new ArrayList<>(Arrays.asList("ankara","erzurum","izmir","konya","bursa","aydın"));
        System.out.println("city = " + city);

        //3.yol list.of() methodu ile
        ArrayList<String> country =new ArrayList<>(List.of("madagaskar","yenizellenda","almanya","fransa"));
        System.out.println("country.size() = " + country.size());
        System.out.println("country = " + country);
        country.add(1,"türkiye");
        System.out.println("country.size() = " + country.size());
        System.out.println("country = " + country);


    }
}
