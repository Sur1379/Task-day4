package com.company.TaskDay4;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input float number");
        float inputNum = scanner.nextFloat();

        if (inputNum > 0) {
            if (inputNum < 1) {
                System.out.println("Small positive number");
            } else if (inputNum >= 1000000) {
                System.out.println("Large positive number");
            } else {
                System.out.println("Positive number");
            }
        } else if (inputNum < 0) {
            if (Math.abs(inputNum) < 1) {
                System.out.println("Small negative number");
            } else if (Math.abs(inputNum) >= 1000000) {
                System.out.println("Large negative number");
            } else {
                System.out.println("Negative number");
            }
        } else {
            System.out.println("ZERO");
        }
    }
}
