package cod_chalange.Challange08;

import java.util.Scanner;

public class Q15_HackerLanguage {

// Task->Girilen bir metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) create ediniz.
//
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir şeyler giir");
        String str=input.nextLine();
        hackerdili(str);
        hackerdili("javaCan  javvanur javaSu javaTar");


    }

    private static void hackerdili(String str) {
        str.
                replaceAll("s","5").
                replaceAll("a","4").
                replaceAll("e","3").
                replaceAll("i","2").
                replaceAll("o","0");
        System.out.println("str = " + str);
    }
}