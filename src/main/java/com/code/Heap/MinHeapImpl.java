package com.code.Heap;

import java.util.Arrays;

/**
 * Created by prem on 4/29/2017.
 */
public class MinHeapImpl {
    int size = 0;
    int cap = 0;
    int[] item = new int[cap];

    private int getLeftChildIndex(int parentIndex) {
        return (2 * parentIndex) + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return (2 * parentIndex) + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int getLeftChild(int index) {
        return item[getLeftChildIndex(index)];
    }

    private int getRightChild(int index) {
        return item[getRightChildIndex(index)];
    }

    private int getParent(int index) {
        return item[getParentIndex(index)];
    }

    public void swap(int indexOne, int indexTwo) {
        int temp;
        temp = item[indexOne];
        item[indexOne] = item[indexTwo];
        item[indexTwo] = temp;

    }

    public void ensureCapacity() {
        if (size == cap) {
            item = Arrays.copyOf(item, size + 1);
            cap = cap + 1;
        }
    }

    public int getPeak() {
        if (size == 0)
            throw new IllegalStateException();
        return item[0];
    }

    public int removePeak() {
        if (size == 0) throw new IllegalStateException();
        int temp;
        temp = item[0];
        item[0] = item[size - 1];
        size--;
        item[size] = 0;
        downHeapify();
        return temp;
    }

    public void addToHeap(int data) {
        ensureCapacity();
        item[size++] = data;
        upHeapify();
    }

    public void upHeapify() {
        // start from most recent mode added to heap
        int index = size - 1;
        while (hasParent(index) && item[index] < getParent(index)) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    public void downHeapify() {
        //  start from root of the heap, as we are removing root
        int index = 0;
        while (hasLeftChild(index)) /*&& item[index] > getLeftChild(index))*/ {
            int smallestChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallestChildIndex = getRightChildIndex(index);
            }
            if (item[index] < item[smallestChildIndex]) {
                break;
            } else {
                swap(smallestChildIndex, index);
            }
            index = smallestChildIndex;

        }
    }

    public static void main(String[] args) {
        MinHeapImpl minHeap = new MinHeapImpl();
        minHeap.addToHeap(3);
        minHeap.addToHeap(10);
        minHeap.addToHeap(4);
        minHeap.addToHeap(8);
        minHeap.addToHeap(1);
        minHeap.addToHeap(0);
        minHeap.addToHeap(6);
        minHeap.addToHeap(9);
        System.out.println(Arrays.toString(minHeap.item));
        System.out.println(minHeap.removePeak());
        System.out.println(Arrays.toString(minHeap.item));
        System.out.println(minHeap.removePeak());
        System.out.println(Arrays.toString(minHeap.item));
    }
}
