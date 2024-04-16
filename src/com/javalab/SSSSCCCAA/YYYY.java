package com.javalab.SSSSCCCAA;

public class YYYY {
    public static void main(String[] args) {
        // long형 에는 숫자 뒤에 l 또는 L을 붙이는 이유를 설명
        // 기본적인 정수는 int인데 int가 가질 수 있는 값보다 크면 사용을 못하기 때문에 long형인 l을 붙혀 long값임을 알려준다
        // float형에는 숫자 뒤에 f를 붙이는 이유를 설명
        // 기본적인 실수는 double인데 float로 초기화 하고 싶을 경우 또는 사용해야할 경우에 f를 붙혀 float형임을 알린다

        byte byteVariable = 100;
        short shortVariable = 1000;
        int intVariable = 100000;
        long longVariable = 1000000L;


        float floatVariable = 3.14f;
        double doubleVariable = 3.14;


        char charVariable = 'A';


        boolean booleanVariable = true;


        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longVariable: " + longVariable);
        System.out.println("floatVariable: " + floatVariable);
        System.out.println("doubleVariable: " + doubleVariable);
        System.out.println("charVariable: " + charVariable);
        System.out.println("booleanVariable: " + booleanVariable);
    }
}
