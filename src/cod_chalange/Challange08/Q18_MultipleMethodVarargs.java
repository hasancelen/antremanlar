package cod_chalange.Challange08;

public class Q18_MultipleMethodVarargs {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
 */
    public static void main(String[] args) {

nothesapla("hasan",77,32,36,98,25,35);
nothesapla("ali",77,32,36,98);
nothesapla("veli",77,32,36);
nothesapla("san",77,32,36,98,18);


    }//main sonu
    public static void nothesapla(String name,int ... not){
      double toplam=0;
        for (int w:not) {
            toplam+=w;
        }
        System.out.println(name+"  not ortalaması: "+Math.round(toplam/not.length));
        }



    }