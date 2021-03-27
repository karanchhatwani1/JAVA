package com.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of fibonacci numbers you want to print :" );
        n = sc.nextInt();

        System.out.println("Fibonacci Series :");
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");

            int sum = n1+n2;
            n1=n2;
            n2=sum;
        }
    }
}
