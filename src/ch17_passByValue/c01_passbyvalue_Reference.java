package ch17_passByValue;

public class c01_passbyvalue_Reference {
    public static void main(String[] args) { /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bşr methoda call edildiğinde
        variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

Pass by value örneği: Diyelim ki bir fincanımız var ve bu fincanda kahve
içeceğiz. Yanımızda bir arkadaşımız da var ve o da kahve içmek istiyor.
 Ancak fincanımızın yalnızca bir kulbu var ve sadece bir kişi fincanı
 tutabilir. Bu durumda, fincanı arkadaşımıza vermek yerine fincanın bir
  kopyasını alıp arkadaşımıza veriyoruz. Bu kopya fincan, orijinal fincanla
  aynı görünebilir ve benzer şekilde kahve alabilir, ancak üzerinde
   yapacağımız değişiklikler orijinal fincanı etkilemez.

Pass by reference örneği: Diyelim ki bir fincanımız var ve bu fincanda
 kahve içeceğiz. Yanımızda bir arkadaşımız da var ve o da kahve içmek
  istiyor. Ancak fincanımızın iki kulbu var ve her iki kişi de fincanı
  tutabilir. Bu durumda, fincanı arkadaşımıza veriyoruz ve her ikisi de
   fincanı tutuyor. Eğer fincan üzerinde herhangi bir değişiklik yaparsak,
    bu değişiklikler her ikisini de etkiler, çünkü her iki kişi de aynı
    fincanı paylaşıyor.


        Java gibi bazı programlama dillerinde, primitive veri tipleri
(int, float, boolean vb.) pass by value olarak ele alınırken,
nesne tipleri (String, List, Object vb.) pass by reference olarak ele alınır.

Pass by value, bir kopya anahtar teslim etmek gibidir.
 Diyelim ki, bir kapıyı kilitlemek için bir anahtarınız var.
  Anahtarı bir kopya olarak bir başkasına verirsiniz.
   Eğer o kişi anahtarın üzerinde herhangi bir değişiklik yaparsa,
   sizin anahtarınızın üzerinde bir değişiklik olmaz.
   Anahtarınızın kopyası verilmiştir ve bu kopyanın üzerinde
    yapılan değişiklikler orijinal anahtarınızı etkilemez.


        //Asiye hanim
    //anahatari paspasin altina koyarsak pass by reference olur

Pass by reference ise, bir adresi anahtar teslim etmek gibidir.
Diyelim ki, bir ev sahibi olarak bir adresiniz var. Bu adresi bir
başkasına verirsiniz. O kişi bu adrese gider ve evin duvarlarında
veya mobilyalarında değişiklik yapar. Bu değişiklikler doğrudan
 evinize yapılır, çünkü verdiğiniz şey adresdir. Adres, evinizin
 tam konumunu gösterir ve üzerinde yapılan değişiklikler doğrudan
 evinize etki eder.

           */
        int x=10;
        String s="hello";
        
        incrementInt(x);
        System.out.println("method sonrası call x = " + x);
// task -> verilen fiyat için %24 artırılmış fiyatı print eden method
// create ediniz.
        double fiyat = 100;
        fiyat1(fiyat);
        System.out.println("fiyat = " + fiyat);
        
    }

    private static void fiyat1(double fiyat) {
        fiyat=fiyat+fiyat*0.24;
        System.out.println("method sonrası fiyat = " + fiyat);
    }

    private static void incrementInt(int x) {
        x+=10;
        System.out.println("method içinde call x = " + x);
        
    }
}
