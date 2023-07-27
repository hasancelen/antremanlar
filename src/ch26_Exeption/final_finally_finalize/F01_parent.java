package ch26_Exeption.final_finally_finalize;

public class F01_parent {
    public void testmethod(){
        System.out.println("güven kontrol e mani değildir");
    }

    /**
     * final method cannot be overridden
     */
    public final void finalmethod(){
        System.out.println("final method dan gelirse");
    }
}
