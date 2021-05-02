package com.company.TaskDay4;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We have ax2 + bx + c =0");
        System.out.println("Input a");
        double a = scanner.nextInt();
        System.out.println("Input b");
        double b = scanner.nextInt();
        System.out.println("Input c");
        double c = scanner.nextInt();
        double D = b * b - 4 * a * c;
        if (D == 0) {
            System.out.println(-b / 2 * a);
        } else if (D > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(D)) / 2 * a + "  x2 = " + (-b - Math.sqrt(D)) / 2 * a);
        } else {
            System.out.println("No decisions");
        }
    }
}
