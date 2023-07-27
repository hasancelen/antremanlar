package ch26_Exeption;

public class c06_numberformatException {
    public static void main(String[] args) {

        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e
// cevirildiğinde oluşan RTE exception
// java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir

        String str ="1516";
        System.out.println("str : "+(str+53));
        int sayı=Integer.parseInt(str);
        System.out.println("sayı = " + (sayı+53));

        String id="id1234";
        try {
            int sayı2=Integer.parseInt(id);
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: for input strin id1234");
        }

    }
}
