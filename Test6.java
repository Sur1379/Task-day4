package com.company.TaskDay4;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt();
        if (randomNum >= 2 && randomNum <= 7) {
            System.out.println(randomNum);
        } else if (randomNum < 0) {
            int randNum = -(randomNum % 10);
            if (randNum < 2) {
                System.out.println(randNum + 2);
            } else if (randNum > 7) {
                System.out.println(randNum - 2);
            } else {
                System.out.println(randNum);
            }
        } else if (randomNum > 7 && randomNum < 10) {
            System.out.println(randomNum - 2);
        } else if (randomNum < 2 && randomNum >= 0) {
            System.out.println(randomNum + 2);
        } else if (randomNum % 10 < 2) {
            System.out.println(randomNum % 10 + 2);
        } else if (randomNum % 10 > 7) {
            System.out.println(randomNum % 10 - 2);
        } else {
            System.out.println(randomNum % 10);
        }
    }
}


