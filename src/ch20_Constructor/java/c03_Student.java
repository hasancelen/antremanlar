package ch20_Constructor.java;

public class c03_Student {

    String name;
    String  lastname;
    int classno;
    double degree;
    int schoolno;
    boolean success;

    @Override
    public String toString() {
        return "c03_Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", classno=" + classno +
                ", degree=" + degree +
                ", schoolno=" + schoolno +
                ", success=" + success +
                '}';
    }

    public void graduate(){
        if (degree>=60){
            System.out.println("you are graduated");
        }
        else {
            System.out.println("we are waitint next year");
        }


}}

