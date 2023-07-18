package cod_challange;

import java.util.Scanner;

public class task01 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        içeriyormu();
    }

    private static void içeriyormu() {
        System.out.println("ağam hele bir şey giresen");
        String kelime1=input.nextLine();
        String istenen="xyz";
        if (kelime1.contains(istenen)) System.out.println(kelime1+"  ==  true");
    else System.out.println(kelime1+"  ==   false");
    }
}
