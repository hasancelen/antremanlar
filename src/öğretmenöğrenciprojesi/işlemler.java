package öğretmenöğrenciprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class işlemler {
   static List<öğretmen>öğretmenlist=new ArrayList<>();
   static List<öğrenci>öğrencilist=new ArrayList<>();
  static Scanner input=new Scanner(System.in);
  static String kişitürü;
    public static void girişpaneli() {
        System.out.println("**********************************      " +
                "\nOGRENCI VE OGRETMEN ANA MENU " +
                "\n**********************************" +
                "\n1- OGRENCI ISLEMLERI" +
                "\n2- OGRETMEN ISLEMLERI" +
                "\nQ- CIKIS " +
                "\nLutfen yapmak istediginiz islemi giriniz : ");
        //String seçim= input.next().toLowerCase();
        //switch (seçim){
        switch (input.next().toLowerCase()){
            case "1":
                kişitürü="öğrenci";
                işlemmenüsü();
                break;
            case "2":
                kişitürü="öğretmen";
                işlemmenüsü();
                break;
            case "q":
                cıkış();
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz");
                girişpaneli();
                break;
        }




    }

    private static void işlemmenüsü() {
        System.out.println("Sectiginiz kisi turu: " + kişitürü + " ISLEM MENU , Lutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kişitürü + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");
        int seçim= input.nextInt();
        switch (seçim){
            case 0:
                girişpaneli();
                break;
            case 1:
                ekleme();
                break;
            case 2:
                ara();
                break;
            case 3:
                listele();
                break;
            case  4:
                silme();
                break;
        }
    }

    private static void silme() {
        System.out.println("*** "+kişitürü+" silme sayfası ***");
        if (kişitürü.equalsIgnoreCase("öğrenci")){
            System.out.println("aradığınız öğrenci kimlik nosu giriniz");
            String silinenkimliköğrencino= input.next();
            for (öğrenci k:öğrencilist) {
                if (k.getKimlikno().equals(silinenkimliköğrencino)){
                    öğrencilist.remove(k);
                    System.out.println("sildiğiniz öğrenci "+silinenkimliköğrencino+"sistemimizde mevcut");
                    break;
                }else System.out.println("silmeye çalıştığınız öğrenci mevcut değil");
            }


        }else {System.out.println("aradığınız öğretmen kimlik nosu giriniz");
            String silinecekkimliköğretmenno= input.next();
            for (öğretmen k:öğretmenlist) {
                if (k.getKimlikno().equals(silinecekkimliköğretmenno)){
                    öğretmenlist.remove(k);
                    System.out.println("silinecek öğretmen "+k.getAd_soyad()+"sistemimizde mevcut");
                    break;
                }else System.out.println("silmeye çalıştığınız  öğretmen mevcut değil");
            }

        }

        girişpaneli();
    }

    private static void listele() {
        System.out.println("*** "+kişitürü+" listeleme sayfası ***");
        if (kişitürü.equalsIgnoreCase("öğrenci")){
            System.out.println("öğrencilist = " + öğrencilist);

        }else {
            System.out.println("öğretmenlist = " + öğretmenlist);
        }

        işlemmenüsü();
    }

    private static void ara() {
        System.out.println("*** "+kişitürü+" arama sayfası ***");
        if (kişitürü.equalsIgnoreCase("öğrenci")){
            System.out.println("aradığınız öğrenci kimlik nosu giriniz");
            String aranankimliköğrencino= input.next();
            for (öğrenci k:öğrencilist) {
                if (k.getKimlikno().equals(aranankimliköğrencino)){
                    System.out.println("aradığınız öğrenci "+k.getAd_soyad()+"sistemimizde mevcut");
                    break;
                }else System.out.println("aradoğınız öğrenci mevcut değil");
            }


        }else {System.out.println("aradığınız öğretmen kimlik nosu giriniz");
            String aranankimliköğretmenno= input.next();
            for (öğretmen k:öğretmenlist) {
                if (k.getKimlikno().equals(aranankimliköğretmenno)){
                    System.out.println("aradığınız öğretmen "+k.getAd_soyad()+"sistemimizde mevcut");
                    break;
                }else System.out.println("aradoğınız öğretmen mevcut değil");
            }

        }

        işlemmenüsü();

    }

    private static void ekleme() {
        System.out.println("*** "+kişitürü+" ekleme sayfası ***");
        if (kişitürü.equalsIgnoreCase("öğrenci")){
            System.out.println("öğrenci ad soyad giriniz");
           // input.next(); //dummy
            //String adsoyad=inputLine.nextLine();
            //String adsoyad=input.nextLine()
            String adsoyad= new Scanner(System.in).nextLine();//yeni bir scanner obje
            System.out.println("öğrenci kimlik no");
            String kimlikno= input.next();
            System.out.println("öğrenci yaş giriniz");
            int yas= input.nextInt();
            System.out.println("öğrenci no giriniz");
            String no= input.next();
            System.out.println("öğrenci sınıf giriniz");
            String sınıf=input.next();
            öğrenci oğrcObj=new öğrenci(adsoyad,kimlikno,yas,no,sınıf);
            öğrencilist.add(oğrcObj);
            System.out.println("öğrenciniz "+oğrcObj.getAd_soyad()+" başarı ile eklendi"+"\n öğrenci işlem menüsüne yönlendiriliyorsunuz" );
            işlemmenüsü();
        }else {
            System.out.println("öğrenci ad soyad giriniz");
            // input.next(); //dummy
            //String adsoyad=inputLine.nextLine();
            //String adsoyad=input.nextLine()
            String adsoyad= new Scanner(System.in).nextLine();//yeni bir scanner obje
            System.out.println("öğretmen kimlik no");
            String kimlikno= input.next();
            System.out.println("öğretmen yaş giriniz");
            int yas= input.nextInt();
            System.out.println("öğrenci sicilno giriniz");
            String sicilno= input.next();
            System.out.println("öğrenci bölümü giriniz");
            String bölüm=input.next();
            öğretmen oğrtmenObj=new öğretmen(adsoyad,kimlikno,yas,bölüm,sicilno  );
            öğretmenlist.add(oğrtmenObj);
            System.out.println("öğrenciniz "+oğrtmenObj.getAd_soyad()+" başarı ile eklendi"+"\n öğrenci işlem menüsüne yönlendiriliyorsunuz" );
            işlemmenüsü();
        }

    }

    private static void cıkış() {
        System.out.println("agam yine bekleriz");
    }

}
