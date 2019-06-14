package com.lixinxinlove.heap;


/**
 * 最大堆排序   优化
 * <p>
 * 索引从0开始
 * <p>
 * * pasrent(i) =（i-）/2
 * * left child(i)=2*i+1
 * * right child(i)=2*i+2
 */

public class HeapSort {

    //原地堆排序


    public static void heapSort(int[] arr, int n) {

        for (int i = (n - 1) / 2; i >= 0; i--) {
            _shiftDown(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            _shiftDown(arr, i, 0);
        }


    }


    private static void _shiftDown(int[] arr, int n, int k) {

        while (2 * k + 1 < n) {
            int j = 2 * k + 1;
            if (j + 1 < n && arr[j + 1] > arr[j]) {
                j += 1;
            }

            if (arr[k] >= arr[j]) {
                break;
            }
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k = j;
        }
    }



    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 3, 6, 5, 2, 4, 2, 1, 0};
        heapSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }


}
