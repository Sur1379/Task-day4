package com.company.TaskDay4;

import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int radius = 4;
        System.out.println("Press 1 for perimetre");
        System.out.println("Press 2 for area");
        double area = Math.PI * Math.pow(radius,2);
        double perimetre = 2 * Math.PI * radius;
        Scanner scanner = new Scanner(System.in);
                int inputNum = scanner.nextInt();
        if (inputNum == 2 ){
            System.out.println(area);
        }
        else if (inputNum == 1){
            System.out.println(perimetre);
        }
    }
}
