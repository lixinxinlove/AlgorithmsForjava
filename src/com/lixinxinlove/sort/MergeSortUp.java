package com.lixinxinlove.sort;

/**
 * 归并排序  向上   n*log(n)
 */
public class MergeSortUp {


    public static void mergeSortUp(int[] arr, int n) {
        for (int sz = 1; sz <= n; sz *= 2) {

            for (int i = 0; i + sz < n; i = i + sz * 2) {
                //对 arr[i...i+sz-1] 和 arr[i+sz...i+2sz-1] 进行归并
                __merge(arr, i, i + sz - 1, Math.min(i + 2 * sz - 1, n - 1));
            }
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

        int[] arr = {9, 8, 7, 3, 6, 5, 2, 4, 2, 1, 0, 7};
        mergeSortUp(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }

    }


}
