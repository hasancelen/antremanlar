package cod_chalange.Challange08;

import java.util.ArrayList;

public class Q14_CreateRandomList_SetList {
    //Task->
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
ArrayList<Integer>list=new ArrayList<>();
randomEkle(list);

    }//main sonu

    private static void randomEkle(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++)
        {
            int rastgele=(int) (Math.random()*20);
            if ((rastgele)%2==0){
                list.add(111);
            }else {list.add(rastgele);

            }
        }
        System.out.println(list);
    }


}//class sonu