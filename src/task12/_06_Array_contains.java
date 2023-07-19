package task12;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

String [] array={"Apple", "Orange" , "Banana" , "Pineapple"};
       boolean varmı=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("Apple")){
                varmı=true;
            }else ;

        }
        System.out.println("varmı = " + varmı);;
    }
}
