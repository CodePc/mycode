package com.code.Heap;

import java.util.Arrays;

/**
 * Created by prem on 4/29/2017.
 */
public class MinHeapImpl {
    int size = 0;
    int cap = 20;
    int[] item = new int[cap];

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
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
        if (item[indexOne] < item[indexTwo]) {
            temp = item[indexOne];
            item[indexOne] = item[indexTwo];
            temp = item[indexTwo];
        }
    }

    public void ensureCapacity() {
        if (size == cap) {
            item = Arrays.copyOf(item, 2 * size);
            cap = 2 * cap;
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
        downHeapify();
        return temp;
    }

    public void addToHeap(int data) {
        ensureCapacity();
        item[size] = data;
        size++;
        upHeapify();
    }

    public void upHeapify() {
        int index = size - 1;
        while (hasParent(index) && item[index] < getParent(index)) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    public void downHeapify() {
        int index = 0;
        while (hasLeftChild(index) && item[index] > getLeftChild(index)) {
            int smallestChildIndex = getLeftChild(index);
            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallestChildIndex = getRightChild(index);
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
        minHeap.addToHeap(23);
        minHeap.addToHeap(21);
        minHeap.addToHeap(4);
        minHeap.addToHeap(8);
        minHeap.addToHeap(7);
        minHeap.addToHeap(43);
        minHeap.addToHeap(45);
        minHeap.addToHeap(67);
        minHeap.addToHeap(33);
        minHeap.addToHeap(77);
        System.out.println(Arrays.toString(minHeap.item));
        System.out.println(minHeap.removePeak());
        System.out.println(Arrays.toString(minHeap.item));
    }
}
