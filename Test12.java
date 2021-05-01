package com.company.TaskDay4;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
//        How to determine whether a year is a leap year
//        To determine whether a year is a leap year, follow these steps:
//
//        If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//        If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//        If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//        The year is a leap year (it has 366 days).
//        The year is not a leap year (it has 365 days).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        int inputYear = scanner.nextInt();
        boolean x = inputYear % 4 == 0;
        boolean y = inputYear % 100 != 0;
        boolean z = (inputYear % 100 == 0) && (inputYear % 400 == 0);
        if (x && (y || z)) {
            System.out.println(inputYear + " is leap year");
        } else {
            System.out.println(inputYear + " is not leap year");
        }

    }
}
