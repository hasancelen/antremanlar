package ch26_Exeption.Error_garbageCollector;

public class c02_GarbageCollector {
    public static void main(String[] args) {
        String str="";
        for (int i = 0; i < 1000; i++) {
            str+=i;
            System.out.println("str : "+str);

        }


    }
}
