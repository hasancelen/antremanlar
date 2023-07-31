package ch28_ınterface_polymorphism.polimorphism.compiletime;


    public class calculation {

        public static void sum(int number1 , int number2){
            System.out.println("sum of 2 integers : " + (number1 + number2));
        }
        //overload
        public static void sum(int number1 , int number2 , int number3){
            System.out.println("sum of 3 integers : " + (number1 + number2 + number3));
        }

        //overload
        public static void sum(double number1 , double number2 ){
            System.out.println("sum of 2 doubles : " + (number1 + number2 ));
        }

        //overload
        public static void sum(double number1 , double number2 , double number3 ){
            System.out.println("sum of 3 doubles : " + (number1 + number2 +number3));
        }

        public static void subtrct(int number5 , int number6){
            System.out.println("subtract of 5 integers : " + (number5 - number6));
        }

        public static void subtrct(int number5 , int number6,int number7){
            System.out.println("subtract of 6 integers : " + (number5 - number6-number7));
        }
        public static void subtrct(double number5 , double number6){
            System.out.println("subtract of 2 integers : " + (number5 - number6));
        }
        public static void subtrct(double number5 , double number6,double number7){
            System.out.println("sum of 2 integers : " + (number5 - number6-number7));
        }






    }


