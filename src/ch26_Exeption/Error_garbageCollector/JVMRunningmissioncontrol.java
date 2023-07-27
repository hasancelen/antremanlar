package ch26_Exeption.Error_garbageCollector;

import java.util.Date;

public class JVMRunningmissioncontrol {
    public static void main(String[] args) {

        Runtime rt=Runtime.getRuntime();
        System.out.println("rt.totalMemory() = " + rt.totalMemory());
        System.out.println("rt.freeMemory() = " + rt.freeMemory());


        Date d=null;

        for (int i = 0; i < 100000; i++) {
            d=new Date(i);
            d=null;

        }
        System.out.println("for lopp sonrası rt.totalMemory()="+rt.totalMemory());
        System.out.println("for loop sonrası rt.freeMemory() = " + rt.freeMemory());

    }
}
