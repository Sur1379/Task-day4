package com.company.TaskDay4;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 1 to 7");
        int inputNum = scanner.nextInt();
        if (inputNum == 1) {
            System.out.println("Monday");
        } else if (inputNum == 2) {
            System.out.println("Tuesday");
        } else if (inputNum == 3) {
            System.out.println("Wednesday");
        } else if (inputNum == 4) {
            System.out.println("Thursday");
        } else if (inputNum == 5) {
            System.out.println("Friday");
        } else if (inputNum == 6) {
            System.out.println("Saturday");
        } else if (inputNum == 7) {
            System.out.println("Sunday");
        }

    }
}
