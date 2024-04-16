package com.javalab.SSSSCCCAA;

public class AAAA {
    public static void main(String[] args) {
        int start = 10;
        int end = 100;

        int multiplesOf5 = 0;
        int multiplesOf6 = 0;

        int currentNumber = start;
        while (currentNumber <= end) {
            if (currentNumber % 5 == 0) {
                multiplesOf5++;
            }
            if (currentNumber % 6 == 0) {
                multiplesOf6++;
            }
            currentNumber++;
        }

        System.out.println("10부터 100까지의 정수 중 5의 배수의 개수: " + multiplesOf5);
        System.out.println("10부터 100까지의 정수 중 6의 배수의 개수: " + multiplesOf6);
    }
}

