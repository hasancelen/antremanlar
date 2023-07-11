package ch14_ForEachLoop;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;

public class c01_ForEachloop {
    public static void main(String[] args) {
         /*
for-each loop for loop'un gelilmş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.

 */

        List<Integer>salılist=new ArrayList<>(List.of(1,2,55,66,33,35,34,72));
        System.out.println("***** task 01 ****");
        for(Integer sayi:salılist){
            System.out.println(sayi);
        }
        System.out.println("***** task 02 *****");
//task list elemanlarinın ilk 3 eleman hariç tek olanları print ediniz.

        for (Integer x:salılist.subList(3,salılist.size())){
            if (x%2==1){
                System.out.println("x = " + x);
            }
        }
        System.out.println("***** task 03 *****");
//task list elemanlarinın 2 ile 5 dahil indexler  arasındaki (2,3,4,5) elemanların toplamını  print ediniz.
        int toplm=0;
        for (Integer y:salılist.subList(2,6)){
            toplm+=y;
        }
        System.out.println(toplm);
    }
}
