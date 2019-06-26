package com.lixinxinlove.leetcode;

public class Solution {

    //整数反转
    public int reverse(int x) {

        boolean f;
        if (x > 0) {
            f = true;
        } else {
            f = false;
        }

        x = Math.abs(x);

        int r = 0;
        int[] arr = new int[10];
        int i = 0;

        while (true) {
            int a = x % 10;
            x /= 10;
            arr[i] = a;
            i++;
            if (i > 32) {
                return 0;
            }
            if (x == 0) {
                break;
            }
        }

        for (int j = 0; j < i; j++) {
            r += arr[j] * Math.pow(10, i - j - 1);
        }

        if (r >= (int) Math.pow(2, 31) - 1 && f) {
            return 0;
        }

        if (-r <= ((int) Math.pow(-2, 31)) + 1 && !f) {
            return 0;
        }

        if (f) {
            return r;
        } else {
            return -r;
        }
    }


    // 输入：(2 -> 4 -> 3) +
    //      (5 -> 6 -> 4)
    // 输出：7 -> 0 -> 8
    // 原因：342 + 465 = 807


    public static void main(String[] args) {
        Solution solution = new Solution();
        int rr = solution.reverse(-15638474);
        System.out.println("---------------------------");
        System.out.println(rr);

        System.out.println("---------------Math.pow(-2, 31)------------");
        System.out.println((int) Math.pow(-2, 31));

    }


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        class Solution1 {
            public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

                int a = 0;
                int b = 0;
                a = a * 10 + l1.val;
                b = b * 10 + l2.val;

                ListNode aNode = l1.next;

                while (aNode != null) {
                    a = a * 10 + aNode.val;
                    aNode = aNode.next;

                }

                while (l2.next != null) {
                    b = b * 10 + l2.next.val;
                }


                int c = a + b;


                ListNode lc;


                return null;
            }
        }
    }
}


