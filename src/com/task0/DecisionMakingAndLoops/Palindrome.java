package com.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,originalInteger,reversedInteger = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check :");
        n = sc.nextInt();
        originalInteger = n;

        while(n != 0){
            reversedInteger = reversedInteger *10+ n%10;
            n = n/10;
        }
        if(originalInteger == reversedInteger){
            System.out.println(originalInteger + " is a palindrome");
        }
        else{
            System.out.println(originalInteger + " is not a palindrome");
        }
    }
}
