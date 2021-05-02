package com.company.TaskDay4;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();
        if (a == b && b == c){
            System.out.println("There is 3 equal numbers");
        }
        else if ((a == b) || (b == c) || (a == c)){
            System.out.println("There is 2 equal numbers");
        }
        else {
            System.out.println("There is no equal numbers");
        }
    }
}
