package task12;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] numara = str.split(" ");
        System.out.println(Arrays.toString(numara));
        int toplamdolar = 0;
        int toplameuro = 0;
        for (String numb : numara) {
            if (numb.startsWith("$")) {
                toplamdolar += Integer.parseInt((numb.substring(1)));
            } else if (numb.startsWith("£")) {
                toplameuro += Integer.parseInt(numb.substring(1));
            }

        }

        System.out.println("toplameuro = " + toplameuro);
        System.out.println("toplamdolar = " + toplamdolar);
    }
}
