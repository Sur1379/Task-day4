package com.company.TaskDay4;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        // 3 5 6 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input exactly K");
        int inputNum = scanner.nextInt();
        if (inputNum < 3 && inputNum > 0) {
            System.out.println("Can't buy");
        }
        if (inputNum == 4 || inputNum == 7) {
            System.out.println("Can't buy");
        } else if (inputNum > 3) {
            System.out.println("Can buy");
        } else {
            System.out.println("Can't buy");

        }
    }
}

