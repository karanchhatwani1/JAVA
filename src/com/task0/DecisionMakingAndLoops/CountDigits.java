package com.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int a;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer :");
        a = sc.nextInt();

        while (a != 0){
            a/=10;
            count++;
        }
        System.out.println("Number of digits in the integer = "+count);
    }
}
