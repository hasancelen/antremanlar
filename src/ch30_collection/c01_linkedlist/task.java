package ch30_collection.c01_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        /*
     Task->
     Node değerleri "dortmund","javaCAN","javaTAR","berlin" olan bir linkedList create ediniz.
     Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "silme islemi basarili"
     yoksa "girdiginiz eleman list te yok" print eden code create ediniz
      */

        LinkedList<String>list1=new LinkedList<>(Arrays.asList("javacan","javatar","javaTAR","berlin"));
        Scanner input=new Scanner(System.in);
        System.out.println("silinecek veri gir");
        String silinecekveri= input.nextLine();

        if (list1.remove(silinecekveri)){

            System.out.println("silme işlemi başarılı");
            System.out.println("list1 = " + list1);
        }



    }
}
