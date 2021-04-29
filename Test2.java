package com.company.TaskDay4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        if (inputNum > 10 && inputNum <= 100){
            System.out.println("the number range is 10 ---> 100");
        }
        else if (inputNum > 200 && inputNum <=300){
            System.out.println("the number range is 200 ---> 300");
        }
        else if (inputNum > 300 && inputNum <=500){
            System.out.println("the number range is 300 ---> 500");}
        else {
            System.out.println("Number is in other range");
        }
    }
}
