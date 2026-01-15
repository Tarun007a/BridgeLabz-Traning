package com.analysis;

import java.util.*;

public class SearchInLargeDataset {
    public static int linearSearch(ArrayList<Integer> list, int key) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == key) return i;
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;

        while(low <= high) {
            int mid = high + (low - high) / 2;

            if(list.get(mid) == key) return mid;
            else if(list.get(mid) < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void helper(int size) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= size; i++) list.add(i);
        int key = size;

        long start = System.nanoTime();
        linearSearch(list, key);
        long linearTime = System.nanoTime() - start;

        start = System.nanoTime();
        binarySearch(list, key);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search : " + linearTime);
        System.out.println("Binary Search : " + binaryTime);
        System.out.println();
    }

    public static void main(String[] args) {
        helper(1000);
        helper(10000);
        helper(1000000);
    }
}

