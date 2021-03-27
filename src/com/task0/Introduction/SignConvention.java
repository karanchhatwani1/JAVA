package com.task0.Introduction;

import java.util.Scanner;

public class SignConvention {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        a = sc.nextInt();

        if(a<0){
            System.out.println("The given number is negative");
        }
        else{
            System.out.println("The given number is positive");
        }
    }
}
