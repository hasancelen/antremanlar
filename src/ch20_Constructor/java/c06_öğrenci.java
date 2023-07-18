package ch20_Constructor.java;

public class c06_öğrenci {
    String isim="hasan çelen";
    int yas;
    String name;
    int age;

    public c06_öğrenci(String isim, int yas) {
       //this.isim = isim;
       //this.yas = yas;

        isim=isim;
        yas=yas;

        name =isim;
        age=yas;

        System.out.println("pojo içinden isim= "+ isim);
        System.out.println("pojo içinden this.isim= "+ this.isim);
        System.out.println("pojo içinden name= "+ name);
    }
    public c06_öğrenci(){

    }
}
