package ch26_Exeption;

public class c07_ıllegalargumentexception02 {
    public static void main(String[] args) {
        try {
            System.out.println("blok başı");
            exceptionmethod();
            System.out.println("try block sonu");
        } catch (Exception e) {
            System.out.println("catch blok başı");
            System.out.println("e="+e);
            System.out.println("e.getmessage()= "+e.getMessage());
            e.printStackTrace();//her kod bittiğinde hatayı yazar
            System.out.println("catch blok sonu");
        }
        System.out.println("main sonu tüm kodlar çalıştı");
    }
    public static void exceptionmethod() {
        throw new IllegalArgumentException("Illegal argument exception hatası aldın");

    }
}
