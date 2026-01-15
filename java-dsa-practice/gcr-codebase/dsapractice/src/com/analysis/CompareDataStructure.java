package com.analysis;

import java.util.*;

public class CompareDataStructure {
    public static boolean arraySearch(int[] arr, int key) {
        for(int i : arr) {
            if(i == key) return true;
        }
        return false;
    }

    public static void testSearch(int size) {
        int[] arr = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < size; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int key = size - 1;

        System.out.println("size: " + size);

        long start = System.nanoTime();
        arraySearch(arr, key);
        System.out.println("Array Search Time : " + (System.nanoTime() - start));

        start = System.nanoTime();
        hashSet.contains(key);
        System.out.println("HashSet Search Time : " + (System.nanoTime() - start));

        start = System.nanoTime();
        treeSet.contains(key);
        System.out.println("TreeSet Search Time : " + (System.nanoTime() - start));

        System.out.println();
    }

    public static void main(String[] args) {
        testSearch(1000);
        testSearch(100000);
        testSearch(1000000);
    }
}
