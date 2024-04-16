package com.javalab.SSSSCCCAA;

import java.util.Scanner;

public class PrintFf {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.printf("첫번째 과목의 점수를 입력하시오 : ");
        double score1 = scanner.nextDouble();

        System.out.printf("두번째 과목의 점수를 입력하시오 : ");
        double score2 = scanner.nextDouble();

        System.out.printf("세번째 과목의 점수를 입력하시오 : ");
        double score3 = scanner.nextDouble();

        double avg = (score1 + score2 + score3) / 3;

        System.out.printf("세 과목의 평균은 : %.2f", avg);
    }
}
