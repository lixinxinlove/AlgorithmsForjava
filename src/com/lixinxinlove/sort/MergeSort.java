package com.lixinxinlove.sort;

/**
 * 归并排序   n*log(n)
 */
public class MergeSort {


    public static void mergeSort(int[] arr, int n) {
        __mergeSort(arr, 0, n - 1);
    }

    public static void mergeSort2(int[] arr, int n) {
        __mergeSort2(arr, 0, n - 1);
    }

    //递归使用归并排序,对 arr[l...r]的范围进行排序
    private static void __mergeSort(int[] arr, int l, int r) {

        //这里可以优化  在一定小的范围内可以使用插入排序
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;   //如果 l+r 很大  会有问题  int 约见

        __mergeSort(arr, l, mid);
        __mergeSort(arr, mid + 1, r);
        __merge(arr, l, mid, r);
    }

    private static void __mergeSort2(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;   //如果 l+r 很大  会有问题  int 约见

        __mergeSort2(arr, l, mid);
        __mergeSort2(arr, mid + 1, r);
        if (arr[mid] > arr[mid + 1]) {
            __merge(arr, l, mid, r);
        }

    }


    //将arr [l...mid] 和 arr[mid+1...r] 两部分进行归并
    private static void __merge(int[] arr, int l, int mid, int r) {

        int aux[] = new int[r - l + 1]; //申请空间

        for (int i = l; i <= r; i++) {
            aux[i - l] = arr[i];
        }

        int i = l;
        int j = mid + 1;

        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] < aux[j - l]) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }

    }


    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 3, 6, 5, 2, 4, 2, 1, 0};
        mergeSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }

    }


}
