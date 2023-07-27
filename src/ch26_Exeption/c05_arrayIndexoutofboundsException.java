package ch26_Exeption;

public class c05_arrayIndexoutofboundsException {
    public static void main(String[] args) {

        int[] arr={22,55,35,52,15};
        System.out.println("arr[0] = " + arr[0]);

       //RTE System.out.println("arr[8] = " + arr[8]);

        try {
            System.out.println("arr[8] = " + arr[8]);
            System.out.println("bu kodu okuyorsun hata yok");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException hatası aldın");;
        }
        System.out.println("hata handle edildi app uygun çalıştı");
    }
}
