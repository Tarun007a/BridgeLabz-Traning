package com.analysis;

import java.io.*;

public class ReadLargeFile {
    public static void readUsingFileReader(String filePath) throws Exception {
        FileReader fr = new FileReader(filePath);
        int ch = ' ';

        long start = System.nanoTime();
        while((ch = fr.read()) != -1);
        long time = System.nanoTime() - start;

        fr.close();
        System.out.println("FileReader Time : " + time);
    }

    public static void readUsingInputStreamReader(String filePath) throws Exception {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        int ch = ' ';

        long start = System.nanoTime();
        while((ch = reader.read()) != -1);
        long time = System.nanoTime() - start;

        isr.close();
        System.out.println("InputStreamReader Time : " + time);
    }

    public static void test(String filePath) throws Exception {
        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        test("name1.txt");
        test("name2.txt");
        test("name3.txt");
    }
}
