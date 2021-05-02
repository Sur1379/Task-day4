package com.company.TaskDay4;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Such a triangle exists");
            } else {
                System.out.println("No such triangle exists");
            }
        } else {
            System.out.println("No such triangle exists");
        }
    }
}
