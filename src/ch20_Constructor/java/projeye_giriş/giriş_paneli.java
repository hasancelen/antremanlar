package ch20_Constructor.java.projeye_giriş;

import java.util.Scanner;

import static ch20_Constructor.java.projeye_giriş.kayıtmethodları.kullanıcılist;

public class giriş_paneli {
    public void giriş(){

        kayıtmethodları obj=new kayıtmethodları();
        Scanner input=new Scanner(System.in);

        System.out.println("yapacağin işlemi seç \n 1 kayıt ol \n 2 şanslı k,işiyibıl \n 3 tüm kullanıcıları listele \n 4 çıkış ");

        int seçin=input.nextInt();
switch (seçin){
    case 1:
        obj.kayıtal();
        giriş();
        break;
    case 2:
        obj.sanslıkullanıcı(kullanıcılist);
        giriş();
        break;
    case 3:
        obj.listele();
        giriş();
        break;

    case 4:
        obj.cıkış();
        break;
    default:
        System.out.println("yanlış tuşlama yaptınız tekrar dene");
        giriş();
        break;
}


    }
}
