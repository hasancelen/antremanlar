package şanslıkullanıcıprojsi;

import java.util.ArrayList;
import java.util.Scanner;

import static şanslıkullanıcıprojsi.kayıt.*;

public class girişmenüsü {
    public static void giriş(){
        System.out.println("lütfen işlemini seçiniz \n 1 kullanıcı kayıt al \n 2 şanslı kişi bul \n 3 kayıt listele\n0 çıkış");
        Scanner input=new Scanner(System.in);
        System.out.println("seçimini giriniz");
        int seçim= input.nextInt();

        switch (seçim){
            case 0:
                çıkış();
                break;
            case 1:
               kullanıcılar= kayıtal();
               giriş();
            break;
            case 2:
                şanslıkullanıcıbul(kullanıcılar);
                giriş();
                break;
            case 3:
                listele(kullanıcılar);
                giriş();
                break;
            default:
                System.out.println("hatalı giriş");
                giriş();
                break;


        }



    }

    private static void çıkış() {
        System.out.println("çıkışınız yapılmıştır");
    }


}
