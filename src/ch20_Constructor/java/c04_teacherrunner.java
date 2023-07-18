package ch20_Constructor.java;

public class c04_teacherrunner {

    public static void main(String[] args) {

        c04_teacher snf=new c04_teacher();
       snf.ad="erol";
       snf.soyad="kara";
       snf.branş="sınıf ";
       snf.tecrübe=23;
       snf.yaş=54;
       snf.maaş=1500;
       snf.emeklime=true;
        System.out.println("snf = " + snf);
        c04_teacher tch=new c04_teacher("hasan","çelen","sınıf");
        System.out.println(tch);

    }


}
