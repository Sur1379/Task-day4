package com.company.TaskDay4;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1");
        int input1 = scanner.nextInt();
        System.out.println("Input number 2");
        int input2 = scanner.nextInt();
        System.out.println("Input number 3");
        int input3 = scanner.nextInt();
//        if (input1 > input2 && input2 > input3) {
//            System.out.println("Greatest number is " + input1);
//        } else if (input1 > input3 && input3 > input2) {
//            System.out.println("Greatest number is " + input1);
//        } else if (input2 > input1 && input1 > input3) {
//            System.out.println("Greatest number is " + input2);
//        } else if (input2 > input3 && input3 > input1) {
//            System.out.println("Greatest number is " + input2);
//        } else if (input3 > input1 && input1 > input2) {
//            System.out.println("Greatest number is " + input3);
//        } else if (input3 > input2 && input2 > input1) {
//            System.out.println("Greatest number is " + input3);
//        }
        if (input1 > input2 && input1 > input3){
            System.out.println("Greatest number is " + input1);
        }
        if (input2 > input1 && input2 > input3){
            System.out.println("Greatest number is " + input2);
        } if (input3 > input2 && input3 > input1){
            System.out.println("Greatest number is " + input3);
        }
        else if (input1 == input2 || input1 == input3 || input2 == input3){
            System.out.println("There is a equals number");
        }
    }
}
