package com.javalab.RRRRRR;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = scanner.nextInt();

        if(num == 2){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
        scanner.close();
    }
}