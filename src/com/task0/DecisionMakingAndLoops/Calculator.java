package com.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1,num2;
        char op;
        int n = 1;
        Scanner sc = new Scanner(System.in);

        while(n != 0){
            System.out.println("Enter first number :");
            num1 = sc.nextDouble();
            System.out.println("Enter second number :");
            num2 = sc.nextDouble();
            System.out.println("Enter the operation you want to perform :");
            op = sc.next().charAt(0);
            double result = 0.0;

            switch(op){
                case '+' :
                    result = num1 + num2;
                    break;

                case '-' :
                    result = num1 - num2;
                    break;

                case '*' :
                    result = num1*num2;
                    break;

                case '/' :
                    result = num1/num2;
                    break;

                default:
                    System.out.println("Incorrect operation");
                    return;
            }
            System.out.println("Result = " + result);
            System.out.println("Press 1 to continue and 0 to exit :");
            n = sc.nextInt();
        }
    }
}
