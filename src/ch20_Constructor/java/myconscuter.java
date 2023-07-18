package ch20_Constructor.java;

public class myconscuter {int x=3;
    int y=5;

    public myconscuter(int i, int i2) {
        this(i2);
        this.x -= i;

        System.out.println("x = " + x);
    }

    public myconscuter(int i) {
        this();
        this.y = i;
        x+=y;
        System.out.println("x = " + x);

    }

    public myconscuter() {
        x+=1;
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        myconscuter mc1=new myconscuter(4,3);
    }
}
