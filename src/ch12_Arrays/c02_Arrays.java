package ch12_Arrays;

public class c02_Arrays {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 55, 66, 35, 3, 4, 34, 33, 63, 72};
        int istenensayi = 35;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 35) {
                System.out.println("sayı var");

            }
            System.out.println("sayı yok");
        }
    }}
