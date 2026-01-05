package com.stackandqueue;

public class CircularTourProblem {
    private static int startStation(int[] petrol, int[] cost) {
        int n = petrol.length;
        int startIdx = 0;

        int currGas = 0;

        for (int i = 0; i < n; i++) {
            currGas = currGas + petrol[i] - cost[i];

            if (currGas < 0) {
                startIdx = i + 1;
                currGas = 0;
            }
        }

        currGas = 0;
        for (int i = 0; i < n; i++) {

            int idx = (i + startIdx) % n;
            currGas = currGas + petrol[idx] - cost[idx];
            if (currGas < 0)
                return -1;
        }

        return startIdx;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 5, 7, 4};
        int[] cost = {6, 6, 3, 5};
        System.out.println(startStation(petrol, cost));
    }
}