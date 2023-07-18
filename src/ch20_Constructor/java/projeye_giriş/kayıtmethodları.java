package ch20_Constructor.java.projeye_giriş;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class kayıtmethodları {
    static ArrayList<kullanıcı> kullanıcılist=new ArrayList<>();
    static Scanner input=new Scanner(System.in);
    public ArrayList<kullanıcı> kayıtal() {
        System.out.println("ismini gir");
        String isim = input.nextLine();
        kullanıcı kullanıcı = new kullanıcı(isim, LocalDateTime.now());

        kullanıcılist.add(kullanıcı);


        return kullanıcılist;
    }

    public void sanslıkullanıcı(ArrayList<kullanıcı> list){

        for (kullanıcı each:list) {
            if (each.kayıtzamanı.getSecond()<=10){
                System.out.println("sn"+each.name+" bugün şanslı günündesin");
            }
            else System.out.println("malesef şanslı gününde değilsiin");
        }



    }
public void listele(){
    System.out.println(kullanıcılist);

}
public  void  cıkış(){
    System.out.println("güle güle");

    }
}
