package com.bridgelabz.LineComparision;
import java.util.Scanner;
import java.lang.*;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter points for first line");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter point x1 ");
        int x1 = scr.nextInt();
        System.out.println("Enter point y1 ");
        int y1 = scr.nextInt();
        System.out.println("Enter point x2 ");
        int x2 = scr.nextInt();
        System.out.println("Enter point y2 ");
        int y2 = scr.nextInt();
        double length1 = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("Length of first line: "+length1);


        System.out.println("Enter points for second line");
        System.out.println("Enter point x3 ");
        int x3 = scr.nextInt();
        System.out.println("Enter point y3 ");
        int y3 = scr.nextInt();
        System.out.println("Enter point x4 ");
        int x4 = scr.nextInt();
        System.out.println("Enter point y4 ");
        int y4 = scr.nextInt();
        double length2 = Math.sqrt((Math.pow((x4-x3),2))+(Math.pow((y4-y3),2)));
        System.out.println("Length of second line is: "+length2);
        if (length2==length1){
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }

    }
}
