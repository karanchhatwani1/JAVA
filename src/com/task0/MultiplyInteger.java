package com.task0;

import java.util.Scanner;

public class MultiplyInteger {
    public static void main(String[] args) {
        float num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = sc.nextFloat();
        System.out.println("Enter second number");
        num2 = sc.nextFloat();

        float result = num1*num2;
        System.out.println("Multiplication result = " + result);
    }
}
