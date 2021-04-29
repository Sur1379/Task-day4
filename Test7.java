package com.company.TaskDay4;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number");
        int inputNum = scanner.nextInt();
        if (inputNum % 10 == 0 || inputNum % 10 == 5) {
            System.out.println("is multiple");
        } else {
            System.out.println("Not multiple");
        }

    }


}

