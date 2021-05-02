package com.company.TaskDay4;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
//       if (a > 10 && b != 10){
//           System.out.println("Both a and b legal");
//       }
//       else{
//           System.out.println("No legal");
//       }


//        if (a > 0 && b > 0){
//            System.out.println("Both a and b legal");
//        }
//        else{
//            System.out.println("No legal");
//        }


//        if (a < 0 && b < 0){
//            System.out.println("Both a and b legal");
//        }
//        else{
//            System.out.println("No legal");
//        }



//        if (a > 10 && b < 1 && a % 2 != 0 && b % 2 != 0){
//            System.out.println("Both a and b legal");
//        }
//        else{
//            System.out.println("No legal");
//        }
//
//
//
//        if ((a + b) % 5 == 0){
//            System.out.println("Both a and b legal");
//        }
//        else{
//            System.out.println("No legal");
//        }


        if (a % 5 != 0 && b % 5 == 0 ){
            System.out.println("Both a and b legal");
        }
        else{
            System.out.println("No legal");
        }


    }
}
