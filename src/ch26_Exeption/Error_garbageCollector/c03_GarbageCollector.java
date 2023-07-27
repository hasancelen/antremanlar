package ch26_Exeption.Error_garbageCollector;

public class c03_GarbageCollector {
    protected void finalize(){
        System.out.println("object is garbage collector");
    }

    public static void main(String[] args) {
        c03_GarbageCollector s1=new c03_GarbageCollector();
        c03_GarbageCollector s2=new c03_GarbageCollector();
    s1=null;
    s2=null;

    System.gc();
    }/*
  Note: The Garbage collector of JVM collects only those objects that are created by new keyword.
  So if you have created any object without new, you can use finalize method to perform cleanup processing
   (destroying remaining objects).
   */
}
