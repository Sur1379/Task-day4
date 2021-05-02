package com.company.TaskDay4;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();
        if (a <= b && b <= c) {
            System.out.println(a + "\n" + b + "\n" + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + "\n" + c + "\n" + b);
        } else if (b <= c && c <= a) {
            System.out.println(b + "\n" + c + "\n" + a);
        } else if (b <= a && a <= c) {
            System.out.println(b + "\n" + a + "\n" + c);
        } else if (c <= a && a <= b) {
            System.out.println(c + "\n" + a + "\n" + b);
        } else {
            System.out.println(c + "\n" + b + "\n" + a);
        }
    }
}
