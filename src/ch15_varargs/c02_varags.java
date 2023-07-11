package ch15_varargs;


public class c02_varags {
    public static void main(String[] args) { /*
array ve varargs method:
 */
//task1 verilen bir array deki elemanlari toplayan method create ediniz
        int [] arr ={ 1,2,-3,4,-5,-6 } ;
        topla(arr);
  varagstopla(arr);
    }

    private static int varagstopla(int...arr) {
        int toplam=0;
        for (int w:arr){toplam+=w;
        }
        System.out.println(toplam);
    return  toplam;
    }


    private static void topla(int[] arr) {
        int toplam=0;
        for (int w:arr){toplam+=w;
    }
        System.out.println(toplam);
}}
