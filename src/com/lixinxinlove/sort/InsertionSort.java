package com.lixinxinlove.sort;

/**
 * 插入排序 O(n^2)
 */
public class InsertionSort {

    public static void insertionSort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }

            }
        }
    }

    public static void insertionSort2(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            int t = arr[i];
            int j;
            for (j = i; j > 0 && t < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 3, 6, 5, 2, 4, 2, 1, 0};
        insertionSort2(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }

}
