package com.lixinxinlove.sort;


/**
 * 快速排序
 */
public class QuickSort {


    public static void quickSort(int[] arr, int n) {
        _quickSort(arr, 0, n - 1);
    }


    private static void _quickSort(int[] arr, int startIndex, int endIndex) {     //

        if (startIndex >= endIndex) {
            return;
        }

        int p = _partition(arr, startIndex, endIndex);

        _quickSort(arr, startIndex, p);
        _quickSort(arr, p + 1, endIndex);

    }

    //返回p，使得 arr[startIndex...p-1] <arr[p]  <arr[p+1...endIndex]
    private static int _partition(int[] arr, int startIndex, int endIndex) {

        int p = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < arr[startIndex]) {
                int temp = arr[i];
                arr[i] = arr[p + 1];
                arr[p + 1] = temp;
                p++;
            }
        }
        int temp = arr[startIndex];
        arr[startIndex] = arr[p];
        arr[p] = temp;
        return p;
    }


    public static void quickSort2(int[] arr, int n) {
        _quickSort2(arr, 0, n - 1);
    }


    private static void _quickSort2(int[] arr, int startIndex, int endIndex) {     //

        if (startIndex >= endIndex) {
            return;
        }

        int p = _partition(arr, startIndex, endIndex);

        _quickSort2(arr, startIndex, p);
        _quickSort2(arr, p + 1, endIndex);

    }


    //返回p，使得 arr[startIndex...p-1] <arr[p]  <arr[p+1...endIndex]
    private static int _partition2(int[] arr, int startIndex, int endIndex) {

        int i = startIndex + 1;
        int j = endIndex;

        while (true) {
            while (i <= endIndex && arr[i] < arr[startIndex]) {
                i++;
            }
            while (j >= startIndex + 1 && arr[i] > arr[startIndex]) {
                j--;
            }

            if (i > j) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j ]= temp;

            i++;
            j--;

        }



        return i;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 7, 3, 6, 5, 2, 4, 9, 1, 0};
        quickSort2(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }

}
