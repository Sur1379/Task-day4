package com.company.TaskDay4;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        if ( inputNum%2 ==0 ){
            System.out.println("The number is even");
        }
        else {
            System.out.println("Not even");
        }
    }
}
