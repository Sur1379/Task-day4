package com.company.TaskDay4;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        int age = scanner.nextInt();
        if ( 0 < age && age < 18 ){
            System.out.println("must be 18 and older");
        }
        else if (age <0) {
            System.out.println("Not Allow");
        }
        else {
            System.out.println("Allow");
        }
    }

}
