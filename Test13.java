package com.company.TaskDay4;

import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt();
        System.out.println(randNum);
        boolean b1 = randNum < 1000 && randNum > -1000;
        System.out.println(b1);

        boolean b2 = randNum % 3 == 0 || randNum % 5 == 0;
        System.out.println(b2);

    }
}
