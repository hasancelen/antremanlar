package ch26_Exeption;

public class c04_nullpointerexceptiom {
    public static void main(String[] args) {

      //  nullpointerexceptiom-- null ataması yapılan bir string e length() method run edildiğinde oluşan RTE exeption

        String str="";
        System.out.println("str.length() = " + str.length());

        String str1=null;
      // RTE   System.out.println("str1.length() = " + str1.length());
//Exception in thread "main" java.lang

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesajı okuyorsan null ın length i ni aldın demek tir");
        } catch (NullPointerException e) {
             ;
        }


    }
}
