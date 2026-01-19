package com.comparelines;

import java.util.*;

public class MeasureApp {
    public static void compareLines(Line l1, Line l2) {
        double len1 = l1.getLength();
        double len2 = l2.getLength();

        System.out.println("Length of Line 1 : " + len1);
        System.out.println("Length of Line 2 : " + len2);

        if (len1 == len2) System.out.println("Both lines are equal");
        else if (len1 > len2) System.out.println("Line 1 is longer");    
        else System.out.println("Line 2 is longer");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Line> lines = new ArrayList<>();

        System.out.println("Enter coordinates for Line 1 :");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        lines.add(new Line(x1, y1, x2, y2));

        System.out.println("Enter coordinates for Line 2 :");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        lines.add(new Line(x1, y1, x2, y2));

        compareLines(lines.get(0), lines.get(1));
    }
}
