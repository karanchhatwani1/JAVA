package com.task0.DecisionMakingAndLoops;

public class Reversing {
    public static void main(String[] args) {
        int num = 304,rev = 0;

        while(num != 0){
            int dig = num%10;
            rev = rev*10 +dig;
            num = num/10;
        }

        System.out.println("Reversed number = "+rev);
    }
}
