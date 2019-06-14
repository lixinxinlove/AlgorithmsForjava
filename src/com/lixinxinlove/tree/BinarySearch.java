package com.lixinxinlove.tree;


import static com.lixinxinlove.sort.BubbleSort.bubbleSort;

/**
 * 二分查找法  在有序的数组中找到目标  返回相应的索引
 */

public class BinarySearch {


    public static int binarySearch(int[] arr, int t) {
        int i = -1;
        int l = 0;
        int r = arr.length ;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] <t) {
                l= mid;
            } else if (arr[mid] > t) {
                r = mid;
            } else {
                return mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 3, 6, 5, 4,2, 1, 0,2,3,4,5,6,7,8,1,2,3,4,};
        bubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }

        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 9));

    }


}
