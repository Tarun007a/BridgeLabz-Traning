package com.analysis;

public class ComputeFibo {
    public static int fibonacciRecursive(int n) {
        if(n <= 1) return n;
        
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if(n <= 1) return n;
        int a = 0;
        int b = 1;
        int sum = 0;
        
        for(int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void testFibonacci(int n) {
        System.out.println("Fibonacci : " + n);

        if(n <= 30) {
            long start = System.nanoTime();
            fibonacciRecursive(n);
            long time = System.nanoTime() - start;
            System.out.println("Recursive Time (ns): " + time);
        } 
        else System.out.println("skipped recursive");

        long start = System.nanoTime();
        fibonacciIterative(n);
        long time = System.nanoTime() - start;
        System.out.println("Iterative Time : " + time);

        System.out.println();
    }

    public static void main(String[] args) {
        testFibonacci(10);
        testFibonacci(30);
        testFibonacci(50);
    }
}
