package com.analysis;

public class SortingLargeDataset {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
    	if(r >= l) return;
    	int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++) left[i] = arr[l + i];
        for(int j = 0; j < n2; j++) right[j] = arr[m + 1 + j];

        int i = 0;
        itn j = 0;
        int k = l;

        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }

        while(i < n1) arr[k++] = left[i++];

        while(j < n2) arr[k++] = right[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
    	if(high >= low) return;
    	int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void test(int size) {
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[size];
        
        for(int i = 0; i < size; i++) {
            arr1[i] = arr2[i] = arr3[i] = size - i;
        }

        System.out.println("Size: " + size);

        if(size <= 10000) {
            long start = System.nanoTime();
            bubbleSort(arr1);
            System.out.println("Bubble Sort : " + (System.nanoTime() - start));
        } 
        else System.out.println("Bubble skipped");
        
        long start = System.nanoTime();
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Merge Sort: " + (System.nanoTime() - start));

        start = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println("Quick Sort: " + (System.nanoTime() - start));

        System.out.println();
    }

    public static void main(String[] args) {
        test(1000);
        test(10000);
        test(1000000);
    }
}

