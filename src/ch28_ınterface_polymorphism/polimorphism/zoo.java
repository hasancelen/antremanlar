package ch28_ınterface_polymorphism.polimorphism;

class Animal{
    public void talk() {
        System.out.println("animal is talking");
    }
}
class Tiger extends Animal{
    public void hunt(){
        System.out.println("tiger is hunting");
    }
    public void talk() {
        System.out.println("tiger is talking  ==> roar");
    }
}
class Octopus extends Animal{
    public void swim(){
        System.out.println("octopus is swimming");
    }
    public void talk() {
        System.out.println("octopus is talking  ==> googloglo");
    }
}
public class zoo {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger [] tigers = {tiger1 , new Tiger()   };

        Octopus octopus1 = new Octopus();
        Octopus [] octopus = { octopus1 , new Octopus()};

        Animal animal=new Tiger();
        animal.talk();
       Tiger tiger=new Tiger();
       tiger.hunt();


    }

}
