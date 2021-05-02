package com.company.TaskDay4;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x coordinate for a");
        int ax = scanner.nextInt();
        System.out.println("Input y coordinate for a");
        int ay = scanner.nextInt();
        System.out.println("Input x coordinate for b");
        int bx = scanner.nextInt();
        System.out.println("Input y coordinate for b");
        int by = scanner.nextInt();
        if ((ax > 0 && ay > 0 && bx > 0 && by > 0) || (ax < 0 && ay < 0 && bx < 0 && by < 0) ||
                (ax < 0 && ay > 0 && bx < 0 && by > 0) || (ax > 0 && ay < 0 && bx > 0 && by < 0)) {
            System.out.println("In the same quarter");
        }
        else if (ax == 0 || ay == 0 || bx == 0 || by == 0){
            System.out.println("One of the point is on the coordinate lane");
        }
        else {
            System.out.println("Not in the same quarter");
        }
    }
}