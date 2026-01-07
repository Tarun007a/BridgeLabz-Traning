package com.searchingalgorithms.filereader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileAndInputStreamReader {

    private static void readWithFileReader(String path) {
        long start = System.nanoTime();
        long wordCount = 0;

        try{
        	BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    wordCount += line.trim().split(" ").length;
                }
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("FileReader Time : " + (System.nanoTime() - start));
    }

    private static void readWithInputStreamReader(String path) {
        long start = System.nanoTime();
        long wordCount = 0;

        try{
        	FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
         
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    wordCount += line.trim().split(" ").length;
                }
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("InputStreamReader Time : " + (System.nanoTime() - start));
    }

    public static void main(String[] args) {
        String filePath = "largefile.txt"; 
        readWithFileReader(filePath);
        readWithInputStreamReader(filePath);
    }
}

