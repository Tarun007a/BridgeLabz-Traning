package com.analysis;

public class StringConcatinate {
    public static void testString(int n) {
        String s = "";
        long start = System.nanoTime();

        for(int i = 0; i < n; i++) s = s + "a";

        long time = System.nanoTime() - start;
        System.out.println("String Time : " + time);
    }

    public static void testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();

        for(int i = 0; i < n; i++) sb.append("a");

        long time = System.nanoTime() - start;
        System.out.println("StringBuilder Time : " + time);
    }

    public static void testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();

        for(int i = 0; i < n; i++) sb.append("a");

        long time = System.nanoTime() - start;
        System.out.println("StringBuffer Time : " + time);
    }

    public static void test(int n) {
        System.out.println("count: " + n);

        if(n <= 10000) testString(n);
        else System.out.println("Skipped string");

        testStringBuilder(n);
        testStringBuffer(n);

        System.out.println();
    }

    public static void main(String[] args) {
        test(1000);
        test(10000);
        test(1000000);
    }
}
