package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class c03_foreachloop {
    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
// ortaklari yazdirancode create ediniz.. with for-each
        String [] arr1={"zerrin","fatih","mustafa","zeynep","iclal","musa","kasım","john"};
        String [] arr2={"christina","bale","mustafa","zeynep","iclal","moosa","reese","angel"};
        List<String>ortakisimler=new ArrayList<>();
        for (String str1:arr1){
            for (String str2:arr2){
                if (str1.equalsIgnoreCase(str2)){
                    ortakisimler.add(str1);
                }
            }
        }
if (ortakisimler.isEmpty()){
    System.out.println(ortakisimler);
}else System.out.println(ortakisimler);


       }
    }

