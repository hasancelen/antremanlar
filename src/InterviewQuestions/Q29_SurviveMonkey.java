package InterviewQuestions;

public class Q29_SurviveMonkey {
    /* Task->
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int bananamiktarı=165;
        int survivaldays=1;
        boolean monkeyAlive = true;
        System.out.println("ağam senin maymun dünde 4 muz yer");

        do {
bananamiktarı-=4;
            System.out.println("agam senin maymunun kalan muz sayısı "+bananamiktarı);
survivaldays++;
if (bananamiktarı<4){
    monkeyAlive=false;
}
        }while(monkeyAlive);
        System.out.println("survivaldays = " + (survivaldays-1));
        System.out.println("bananamiktarı = " + bananamiktarı);
        System.out.println("monkeyAlive = " + monkeyAlive);
    }

}

