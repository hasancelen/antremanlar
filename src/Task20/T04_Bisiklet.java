package Task20;

import java.util.Scanner;

public class T04_Bisiklet {
    int hız=10;
    int vites=1;

    void hızdeğiştir(int yenihız){
        this.hız=yenihız;
    }
    void vitesarttır(){
        vites++;
    }
    void  vitesazalt(){
        vites--;
    }
    void durumgöster(){
        System.out.println("hız : "+hız);
        System.out.println("vites : "+vites);
    }
    void dur(){
        System.out.println("bisiklet durdu");
    }
    void işlemyap(){
        System.out.println("*** işlem yap ***");
        System.out.println("1-> durum göster\n2->vites arttır\n 3->vites azalt\n4->hız değiştir\n5->bisiklet duruyor");
        Scanner input=new Scanner(System.in);
        int seçim= input.nextInt();
        switch (seçim){
            case 1:
            durumgöster();
            işlemyap();
            break;
            case 2:
            vitesarttır();
            durumgöster();
            işlemyap();
            break;
            case 3:
            vitesazalt();
            durumgöster();
            işlemyap();
            break;
            case 4:
            System.out.println("yeni hız giriniz");
            hızdeğiştir(input.nextInt());
            case 5:
            dur();
            break;
            default:
                System.out.println("yanlış giriş yaptınız");

        }
    }
}