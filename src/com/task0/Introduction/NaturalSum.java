package com.task0.Introduction;

import com.sun.security.jgss.GSSUtil;

public class NaturalSum {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Sum of first 10 natural numbers are :");
        for(int i=1;i<=10;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
