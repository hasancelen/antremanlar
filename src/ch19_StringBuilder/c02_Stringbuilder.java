package ch19_StringBuilder;

public class c02_Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();

        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append("javaslan");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());


        sb1.append(" selam ");
        sb1.append(" nasılsın ").append(" maaşlara zam işi ne oldu ").append(63).append(" ").append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());


        StringBuilder sb2=new StringBuilder("tommy lee jones");
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());

        System.out.println("trimTOSize()");
        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());

        StringBuilder sb3=new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("rumeyse hanım qa");
        System.out.println("sb3.capacity() = " + sb3.capacity());

        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));

        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10));
        System.out.println("sb1.substring(3,10) = " + sb1.substring(3, 10));

        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10));

        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6));

        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\";)\") = " + sb3.insert(7, ";)"));


        System.out.println("sb3.insert(0,\"hi\",3,7) = " + sb3.insert(15, "hello", 1, 3));

        sb3.setCharAt(5,'s');
        System.out.println("sb3 = " + sb3);

        sb3.replace(7,9,"meşgul");
        System.out.println("sb3 = " + sb3);
    }
}
