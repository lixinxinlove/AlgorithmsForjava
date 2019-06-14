package com.lixinxinlove.heap;

public class HeapAndSort {

    //二叉堆

    public static void main(String[] args) {

        MaxHeap maxHeap = new MaxHeap(20);

        maxHeap.insent(62);
        maxHeap.insent(41);
        maxHeap.insent(30);
        maxHeap.insent(28);
        maxHeap.insent(16);
        maxHeap.insent(22);
        maxHeap.insent(13);
        maxHeap.insent(19);
        maxHeap.insent(17);
        maxHeap.insent(15);


        maxHeap.printData();

        maxHeap.insent(52);

        maxHeap.printData();


        System.out.println("---------取出最大值-------------");
        System.out.println(maxHeap.getMax());
        System.out.println(maxHeap.getMax());
        System.out.println(maxHeap.getMax());

        maxHeap.printData();

    }


}
