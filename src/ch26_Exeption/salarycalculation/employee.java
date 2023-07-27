package ch26_Exeption.salarycalculation;

public class employee {

    private String name;
    private int salary;
    private int workhours;
    private int year;

    public employee(String name, int salary, int workhours, int year) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.year = year;
    }

    public employee() {

    }
public double tax() {
    double paymentoftax = 0;
    if (salary < 10000) {
        paymentoftax = 0;
        System.out.println("vergiden muafsın ama sevinme gözüm üstünde");
    } else {
        paymentoftax = salary * 0.03;
        System.out.println("vergi dilimine girdin");
    }
return paymentoftax;
}
public int bonus(){
        int paymentpfbonus=0;
        int additionalbonus=100;
        if (workhours>40){
            return paymentpfbonus=(workhours-40)*additionalbonus;
        }else return paymentpfbonus;
}
public double raisesalary(){
        int timeofyear=2023;
        int sumofyear=timeofyear-year;
        double raising=0;
        if (sumofyear<5){
            raising=(salary+tax())*0.05;
        } else if (sumofyear<15) {
            raising=(salary+tax())*0.10;
        }else raising=(salary+tax())*0.20;
return raising;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workhours=" + workhours +
                ", year=" + year +
                '}';
    }
}
