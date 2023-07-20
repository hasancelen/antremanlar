package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q33_ListCollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 br saga kaydir ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>sayılist=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("bir şeyler giresen");
sayılist.add(input.nextInt());
        }
        System.out.println("ilk hali = " + sayılist);
        Collections.sort(sayılist,Collections.reverseOrder());
        System.out.println("tersten yazılmış hali = " + sayılist);

        //listeyi karıştır ve yaztır

        Collections.shuffle((sayılist));
        System.out.println("karışık hali "+sayılist);

       //3 br kaydırma
    Collections.rotate(sayılist,3);
        System.out.println("sayılist 3 br kaydırılmış hali "+sayılist );

        // maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        // tüm maksimum sayıları minimum sayı ile değiştir


        System.out.println("en büyük sayı "+ Collections.max(sayılist));
        System.out.println("en küçük sayı "+Collections.min(sayılist));
        Collections.replaceAll(sayılist,Collections.max(sayılist),Collections.min(sayılist));
        System.out.println(sayılist);
    }
}
