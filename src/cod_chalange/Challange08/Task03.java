package cod_chalange.Challange08;


import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        /* task->
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        //1.yol

        System.out.println("heysiri");
        System.out.println("heysiri".replace("hey", "bye"));

        //2. yol

        String arr[]="heysiri".split("y");//[he,siri]
        arr[0]="bye";
        System.out.println(arr[0] + arr[1]);


    }
}
