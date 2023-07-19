package task24.task01;

import java.util.Scanner;

public class Main {

/* TODO
    Burada iki class vardır. Biri Main diğeri ise Subscribe.
    Subscribe class'ının içinde;
    Bu variables'ları private oluşturunuz.
    String name
    boolean doYouWanaSubscribe
    String whichMember
    3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

todo    Main class'ın içinde;
    Örnek;
    Name is Victoria, doYouWanaSubscribe true, whichMember Gold
    Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
    all homework and see you soon. yazdırınız.

    Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

    Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
    See you when you want to be a member. Thanks yazdırınız.
         */


}
class runner{
    public static void main(String[] args) {
        subscrime subscrime=new subscrime();
        Scanner input=new Scanner(System.in);
        System.out.println("do You WanaS ubscribe? true/no");
        String seçim= input.next().toLowerCase();
        if (seçim.equals("yes")){
            subscrime.setDoYouWanaSubscribe(true);
        }else subscrime.setDoYouWanaSubscribe(false);
        if (subscrime.isDoYouWanaSubscribe()){
            System.out.println("1- gold\n2- silver\n3- bronze");
            switch (input.nextInt()){
                case 1:
                    System.out.println("Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,\n" +
                            "    all homework and see you soon.");
                    break;
                case 2:
                    System.out.println("Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.");
                case 3:
                    System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.");
                default:
            }
        }

    }
}
class subscrime {
   private String name;
   private boolean doYouWanaSubscribe;
   private String whichMember;

    @Override
    public String toString() {
        return "subscrime{" +
                "name='" + name + '\'' +
                ", doYouWanaSubscribe=" + doYouWanaSubscribe +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }
}