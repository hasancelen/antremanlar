package ch30_collection.emailcretion;

import java.util.Scanner;

public class email {
    private String name;
    private String lastname;
    private String password;
    private String departman;
    private String email;
    private String emailsuffix="clarusway.com";
    private int passwordlength=12;

    @Override
    public String toString() {
        return "email{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", departman='" + departman + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public email(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.password = setRandomPassWord(passwordlength);
        System.out.println("password = " + password);
        this.departman = setdepertman();
        this.email = name.toLowerCase()+lastname.toLowerCase()+"."+departman+"@"+emailsuffix;
    }

    public email() {
    }


    public String setRandomPassWord(int passwordlength){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "!@#$%^&*()-_=+[]{}|;:'\",.<>?";
        char []password= new char[passwordlength];
        for (int i = 0; i < passwordlength; i++) {
            int random= (int) (Math.random()*characters.length());
            password[i]=characters.charAt(random);
        }
        return new String(password);

    }

    public String setdepertman(){
        System.out.println("bu depetmanlardan birini seç \n1 test automation\2 developer\n3 devops");
        Scanner input=new Scanner(System.in);
        int secim= input.nextInt();

        if (secim==1){
            return  "test automation";
        } else if (secim==2) {return "developer";

        } else if (secim==3) {return "devops";

        }else return "hatalı giriş";
    }







}
