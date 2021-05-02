package com.company.TaskDay4;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A");
        int a = scanner.nextInt();
        System.out.println("Input B");
        int b = scanner.nextInt();
//        boolean b1 = (a % 7 == 0 || b % 7 == 0) && a > 0 && b > 0 && a > b;
//        System.out.println(b1);

//        if (a % 7 == 0 || b % 7 == 0) {
//            if (a > 0 && b > 0) {
//                if (a > b) {
//                    System.out.println("True");
//                } else {
//                    System.out.println("False");
//                }
//            } else {
//                System.out.println("False");
//            }
//        } else {
//            System.out.println("False");
//        }

        String str1 = new String("True");
        String str2 = new String("False");
        String result = ((a % 7 == 0 || b % 7 == 0) && a > 0 && b > 0 && a > b ? str1 : str2);
        System.out.println(result);

    }
}
