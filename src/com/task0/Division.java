package com.task0;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();

        int quotient = num1/num2;
        int remainder = num1%num2;

        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
    }
}
