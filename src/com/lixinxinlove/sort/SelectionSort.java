package com.lixinxinlove.sort;

/**
 * 选择排序
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 3, 6, 5, 2, 4, 2, 1, 0};
        selectionSort(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }

    }


}
