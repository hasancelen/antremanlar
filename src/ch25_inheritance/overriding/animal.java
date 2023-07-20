package ch25_inheritance.overriding;

public class animal {//grandparent
    /*
Override edilen methodların access seviyeleri, parent class'taki
 methodun access seviyesiyle aynı veya daha geniş olabilir.
 Örneğin,
  parent class'ta protected olan bir method,
  child class'ta public olabilir

  ancak private veya default
   access seviyesiyle override edilemez.

   Örneğin, parent class'ta protected olan
   bir method, child class'ta public olarak override edilebilir, ancak
   private olarak override edilemez. Aynı şekilde, parent class'ta
   private
   olan bir method, child class'ta override edilemez
 */



public animal() {
            System.out.println("animal class pm siz const");
        }
        public void yeme(){
            System.out.println("hayvan yer");
        }
        public void icme(){
            System.out.println("hayvan icer");
        }
        public void hareket(){
            System.out.println("hayvan hareket eder");

            int number = 34;
            int age = 33;
            int numberOfAnimals = 500;





        }
    }

