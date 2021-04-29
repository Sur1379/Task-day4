package com.company.TaskDay4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input saturation percent");
        int inputNum = scanner.nextInt();
        if (inputNum == 98){
            System.out.println("excelent");}
        else if (inputNum < 98 && inputNum >= 70) {
            System.out.println("good saturation"); }
        else if (inputNum < 70 && inputNum >= 50 ){
            System.out.println("normal saturation");
        }
        else if (inputNum < 50 && inputNum >= 30){
            System.out.println("bad saturation");
        }
        else if (inputNum < 30 && inputNum >= 0){
            System.out.println("pacient died");

        }
    }
}
