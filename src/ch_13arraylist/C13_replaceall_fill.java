package ch_13arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceall_fill {
    public static void main(String[] args) {
        ArrayList<Integer> listnumber=new ArrayList<>(Arrays.asList(1,23,3,55,41,9,8,1,1));
        System.out.println(listnumber);


        System.out.println("Collections.replaceAll(listnumber,1,111) = " + Collections.replaceAll(listnumber, 1, 111));
        System.out.println(listnumber);
        Collections.fill(listnumber,33);
        System.out.println(listnumber);
    }}
