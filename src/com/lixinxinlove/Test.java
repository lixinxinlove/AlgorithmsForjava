package com.lixinxinlove;

import com.lixinxinlove.sort.InsertionSort;
import com.lixinxinlove.sort.MergeSort;
import com.lixinxinlove.sort.QuickSort;
import com.lixinxinlove.sort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

/**
 * 归并排序
 */
public class Test {

    private static final int n = 500000;

    private static int[] getArr(int n, int l, int r) {

        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = l + random.nextInt(r - l);
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr0 = getArr(n, 10, n + 10);
        int[] arr1 = Arrays.copyOf(arr0, n);
        int[] arr2 = Arrays.copyOf(arr0, n);
        int[] arr3 = Arrays.copyOf(arr0, n);


        System.out.print("选择排序：");
        long st0 = System.currentTimeMillis();
        SelectionSort.selectionSort(arr0, arr0.length);
        long et0 = System.currentTimeMillis();
        System.out.println(et0 - st0);

        System.out.print("插入排序：");
        long st1 = System.currentTimeMillis();
        InsertionSort.insertionSort2(arr1, arr1.length);
        long et1 = System.currentTimeMillis();
        System.out.println(et1 - st1);


        System.out.print("归并排序：");
        long st2 = System.currentTimeMillis();
        MergeSort.mergeSort(arr2, arr2.length);
        long et2 = System.currentTimeMillis();
        System.out.println(et2 - st2);


        System.out.print("快速排序：");
        long st3 = System.currentTimeMillis();
        QuickSort.quickSort(arr3, arr3.length);
        long et3 = System.currentTimeMillis();
        System.out.println(et3 - st3);


    }

}
