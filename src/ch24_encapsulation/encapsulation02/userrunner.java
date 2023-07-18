package ch24_encapsulation.encapsulation02;

public class userrunner {
    public static void main(String[] args) {


        user obj1 = new user("taha","QA","123456asd",33);
        System.out.println("obj1.getAd() = " + obj1.getAd());
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        System.out.println("obj1.getYas() = " + obj1.getYas());


        System.out.println("obj1 = " + obj1);


        user user2=new user("zeynep hanım","aytop","123456as",-29);
        System.out.println("user2 = " + user2);

    }
}