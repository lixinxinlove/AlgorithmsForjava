package com.lixinxinlove.sort;

/**
 * 冒泡排序 O(n^2)
 */
public class BubbleSort {


    public static void bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 3, 6, 5, 2, 4, 2, 1, 0};
        bubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }

}
