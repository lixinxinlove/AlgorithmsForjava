package com.lixinxinlove;

import com.lixinxinlove.sort.InsertionSort;
import com.lixinxinlove.sort.MergeSort;
import com.lixinxinlove.sort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

/**
 * 归并排序
 */
public class Test {

    private static final int n = 10000000;

    private static int[] getArr(int n, int l, int r) {

        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = l + random.nextInt(r - l);
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = getArr(n, 10, n + 10);

        int[] arr1 = Arrays.copyOf(arr, n);

        int[] arr2 = Arrays.copyOf(arr, n);


        System.out.print("归并排序：");
        long st = System.currentTimeMillis();
        MergeSort.mergeSort(arr1, arr1.length);
        long et = System.currentTimeMillis();
        System.out.println(et - st);


        System.out.print("归并排序2：");
        long st2 = System.currentTimeMillis();
        MergeSort.mergeSort(arr2, arr2.length);
        long et2 = System.currentTimeMillis();
        System.out.println(et2 - st2);

//        System.out.print("选择排序：");
//        long st = System.currentTimeMillis();
//        SelectionSort.selectionSort(arr, arr.length);
//        long et = System.currentTimeMillis();
//        System.out.println(et - st);
//
//        System.out.print("插入排序：");
//        long st1 = System.currentTimeMillis();
//        InsertionSort.insertionSort2(arr1, arr1.length);
//        long et1 = System.currentTimeMillis();
//        System.out.println(et1 - st1);


    }

}
