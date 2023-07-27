package InterviewQuestions.ObebOkek;

import static InterviewQuestions.ObebOkek.Hesapla.obeb;
import static InterviewQuestions.ObebOkek.Hesapla.okek;

public class Runner {
    public static void main(String[] args) {
        ObebOkek obj1=new ObebOkek(15,18);
        System.out.println("obeb(obj1) = " + obeb(obj1));//1
        System.out.println("okek(obj1) = " + okek(obj1));//15
    }
}
