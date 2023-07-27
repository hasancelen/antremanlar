package ch27_Abstracktion.abstrack_polymorphism02;


abstract class ScrumTeam {

    public String name, jobTitle;
    public double salary;

    public abstract void dailyStandUp();

    public abstract void demo();

    public void getEmployeeInfo() {
        System.out.println("***************");
        System.out.println("employee name : " + this.name +
                "\n Job Title : " + this.jobTitle +
                "\n Salary : " + this.salary);

        System.out.println("***************");
    }
}
class Testers extends ScrumTeam {

    public Testers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Tester " + name + " is working");
    }

    @Override
    public void demo() {
        System.out.println("Tester " + name + " is doing demo");
    }
}
class Developers extends ScrumTeam {

    public Developers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Developer  " + name + " is working");

    }

    @Override
    public void demo() {
        System.out.println("Developer " + name + " is doing demo");

    }
}

class BOA {
    public static void main(String[] args) {
        Testers tester1=new Testers("ahmet ","tester",5000);
        Testers tester2=new Testers("iclal ","tester",8000);
        Testers tester3=new Testers("sefa ","tester",6000);



    }


}
