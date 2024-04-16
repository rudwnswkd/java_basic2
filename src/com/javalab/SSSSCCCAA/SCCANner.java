package com.javalab.SSSSCCCAA;

import java.util.Scanner;

public class SCCANner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("상품의 단가를 입력하세요: ");
        String unitPriceString = scanner.nextLine();
        int unitPrice = Integer.parseInt(unitPriceString);

        System.out.print("상품의 수량을 입력하세요: ");
        String quantityString = scanner.nextLine();
        int quantity = Integer.parseInt(quantityString);

        int totalPrice = unitPrice * quantity;

        System.out.println("상품의 가격은 " + totalPrice + "원 입니다.");

        scanner.close();
    }
}

