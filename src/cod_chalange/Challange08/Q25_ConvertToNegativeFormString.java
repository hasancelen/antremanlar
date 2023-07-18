package cod_chalange.Challange08;

public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr = {"J", "a", "v", "a", "I", "s", "D", "i", "f", "f", "i", "c", "u", "l", "t"};
        String str="";
        for (int i = 0; i < arr.length; i++) {
          str+=arr[i];
        }
        System.out.println("str = " + str);
        System.out.println(str.replace("Is", "ISNOT"));
        String arr2="";
        for (String arr1:arr) {
            arr2+=arr1;
            
            
        }

        System.out.println("arr2 = " + arr2);
        System.out.println(arr2.replace("Is", "ISNOT"));
    }

}
