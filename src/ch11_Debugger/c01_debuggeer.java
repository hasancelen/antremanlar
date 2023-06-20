package ch11_Debugger;

public class c01_debuggeer {
    static int count=7;//class levelde static global variable tanımlandı
    public static void main(String[] args) {


        method01();
    }

    private static void method01() {
        System.out.println("method 1 çalışıyor");
        int a=0;//local var tanımlandı
        count++;
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" ");
            a+=2*i;
        }
    }


}
