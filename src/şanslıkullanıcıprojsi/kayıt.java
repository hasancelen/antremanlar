package şanslıkullanıcıprojsi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class kayıt {

    static ArrayList<kullanıcı>kullanıcılar=new ArrayList<>();//kullanıcı class dan create edilen boş list

    public static ArrayList<kullanıcı> kayıtal(){
        Scanner input=new Scanner(System.in);
        System.out.println("adını giriniz");
        kullanıcı k1=new kullanıcı(new Scanner(System.in).nextLine(), LocalDateTime.now());
kullanıcılar.add(k1);
        return kullanıcılar;
    }

    public static void şanslıkullanıcıbul(ArrayList<kullanıcı>kllnc){
        for (kullanıcı avuc:kllnc) {
            if (avuc.kayıtzamanı.getSecond()<=10){
                System.out.println(avuc.name+" şanslı kişisiniz 5 kilo bal kazandınız sisteme giriş zamanı "+avuc.kayıtzamanı);
            }else System.out.println(avuc.name+" şanslı kişi değilsiniz kovan yağmalandı giriş zamanı "+avuc.kayıtzamanı);
        }



    }
    public static void listele(ArrayList<kullanıcı>kullanıcı){
        System.out.println("kullanıcı = " + kullanıcı);

    }
}
