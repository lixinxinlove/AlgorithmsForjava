package com.lixinxinlove.heap;


/**
 * 最大堆  二叉堆
 * pasrent(i) =i/2
 * left child(i)=2*i
 * right child(i)=2*i+1
 */
public class MaxHeap {

    private int[] mData;

    private int count = 0;

    public MaxHeap(int n) {
        this.mData = new int[n + 1];
        this.mData[0] = 0;
    }

    public void insent(int data) {
        mData[count + 1] = data;
        count++;
        shiftUp(count);
    }


    //插入元素
    private void shiftUp(int index) {
        int i = index;
        int p;
        while (i > 1) {
            p = i / 2;
            if (mData[i] > mData[p]) {
                int temp = mData[i];
                mData[i] = mData[p];
                mData[p] = temp;
                i = p;
            } else {
                break;
            }
        }
    }


    public int getMax() {
        int max = mData[1];
        //最后一个元素放到根上
        mData[1] = mData[count];
        count--;
        shiftDown(1);
        return max;
    }

    //取出一个元素
    private void shiftDown(int k) {
        while (2 * k <= count) {
            int j = 2 * k;
            if (j + 1 <= count && mData[j + 1] > mData[j]) {
                j += 1;
            }

            if (mData[k] >= mData[j]) {
                break;
            }
            int temp = mData[k];
            mData[k] = mData[j];
            mData[j] = temp;
            k = j;
        }
    }

    //有多少个元素
    public int size() {
        return count;
    }

    public boolean isEntity() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void printData() {

        System.out.println();
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
            System.out.print(mData[i]);
        }
        System.out.println();

    }


}
