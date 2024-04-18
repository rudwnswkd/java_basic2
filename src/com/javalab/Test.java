package com.javalab;

import java.util.Arrays;

public class Test {
        // 선택 정렬 메소드
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap arr[i] and arr[minIndex]
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // 버블 정렬 메소드
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};

            // 선택 정렬 수행
            selectionSort(arr);
            System.out.println("Selection Sorted array: " + Arrays.toString(arr));

            // 버블 정렬 수행
            int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr2);
            System.out.println("Bubble Sorted array: " + Arrays.toString(arr2));
        }
    }


