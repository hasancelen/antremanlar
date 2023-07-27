package ch15_varargs;

import java.util.Arrays;

public class c01_varargs {
    public static void main(String[] args) {/*
      VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da ayni sekilde kullanilir
      var----variety cesitlilik args---arguments
      SYNTAX ->
      mathodName(parametre1,parametre2, dataType... dataName) {
      method body....

      }

       1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır
       .
    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :


         Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
         ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

*/

        String str1 = "java";
        String str2 = "react";
        String str3 = "spring";
        String str4 = "next.js";
        String str5 = "aws";

        enFazlaKarakter(str1,str5);
        enFazlaKarakter(str1,str2,str3);
        enFazlaKarakter(str1,str5,str4,str3,str2);
        enFazlaKarakter(str1,str4,str3,str2);

    }

    public static void enFazlaKarakter(String... str) {
        String enFazlaKarakterli="" ;
        for (String w : str    ) {
            if (w.length()  > enFazlaKarakterli.length()){
                enFazlaKarakterli = w;
            }
        }
        System.out.println("enFazlaKarakterli = " + enFazlaKarakterli);
    }
}