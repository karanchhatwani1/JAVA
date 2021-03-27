package com.task0.Introduction;

import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();

        int c = a+b;
        System.out.println("Addition of first and second number is : " + c);
    }
}
